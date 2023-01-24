import java.util.ArrayList;

import java.util.Scanner;

public class Locadora {
    Scanner sc = new Scanner(System.in);

    private ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }

    public void adicionarjogo() {
        String nomeJogo = Util.getString("Digite o nome do jogo:\n");
        String categoriaJogo = Util.getString("Digite a categoria do jogo:\n");
        int anoLancamentoJogo = Util.getInt("Digite o ano de Lançamento do jogo:", "ERRO ao processar, Coloque apenas numeros!");
        Jogo jogo = new Jogo();
        jogo.setNome(nomeJogo);
        jogo.setCategoria(categoriaJogo);
        jogo.setAnoLancamento(anoLancamentoJogo);

        jogos.add(jogo);
        System.out.println("Jogo adicionado!");
    }

    public void deletarJogo() {
        if (!jogos.isEmpty()) {
            int delete = Util.getInt("Você deseja deletar um Jogo! \n Digite a posição do Jogo: ", "ERRO ao processar, Coloque apenas numeros!");
            jogos.remove((delete) - 1);
            System.out.println("Jogo Deletado!");
        } else {
            System.out.println("NÃO EXISTE JOGO, POR FAVOR ADICIONE. ");
        }
    }

    public Jogo lerJogos(String titulo) {
        if (!jogos.isEmpty()) {
            for (Jogo jogo : jogos) {
                if (jogo.getNome().equals(titulo)) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Posição: " + (jogos.indexOf(jogo) + 1));
                    System.out.println("INFORMAÇÕES DO JOGO: ");
                    System.out.println("Nome do Jogo: " + jogo.getNome());
                    System.out.println("Categoria do Jogo: " + jogo.getCategoria());
                    System.out.println("Ano de lançamento do Jogo: " + jogo.getAnoLancamento());
                    System.out.println("--------------------------------------------------------------------------------------------");
                }else {
                    System.out.println("O NOME DO JOGO ESTÁ INCORRETO , TENTE NOVAMENTE");
                }
            }
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A LEITURA, POR FAVOR ADICIONE UM JOGO ");
        }
        return null;
    }


    public Jogo lerJogos() {
        if (!jogos.isEmpty()) {
            for (Jogo jogo : jogos) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("Posição: " + (jogos.indexOf(jogo) + 1));
                System.out.println("INFORMAÇÕES DO JOGO: ");
                System.out.println("Nome do Jogo: " + jogo.getNome());
                System.out.println("Categoria do Jogo: " + jogo.getCategoria());
                System.out.println("Ano de lançamento do Jogo: " + jogo.getAnoLancamento());
                System.out.println("--------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A LEITURA, POR FAVOR ADICIONE UM JOGO ");
        }
        return null;
    }

    public void alterarJogo() {
        if (!jogos.isEmpty()) {
            int alterarjogo1 = Util.getInt("Você deseja alterar dados do Jogo!\nPor favor, digite a posição do Jogo: ", "ERRO ao processar, Coloque apenas numeros!");
            int alterarjogo2 = Util.getInt("Selecione o que deseja alterar: \n1. Nome do Jogo:\n2. Categoria;\n3. Ano de lançamento:\n4. Não alterar nada.", "ERRO ao processar, Coloque apenas numeros!");
            switch (alterarjogo2) {
                case 1 -> {
                    String nome = Util.getString("Digite o novo nome do jogo:\n");
                    jogos.get(alterarjogo1 - 1).setNome(nome);
                }
                case 2 -> {
                    String categoria = Util.getString("Digite a nova categoria do jogo:\n");
                    jogos.get(alterarjogo1 - 1).setCategoria(categoria);
                }
                case 3 -> {
                    int anoLancamento = Util.getInt("Por favor, digite o novo ano de Lançamento:", "ERRO ao processar, Coloque apenas numeros!");
                    jogos.get(alterarjogo1 - 1).setAnoLancamento(anoLancamento);
                }
                case 4 ->
                        System.out.println("Não haverá alteração em nada, você retornará ao menu inicial!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
            System.out.println("Dados Atualizados!");
        } else {
            System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO, POR FAVOR ADICIONE UM JOGO");
        }

    }

    public void contratarFuncionario() {
        int idFuncionario = Util.getInt("Digite o Id do Funcionário: ", "ERRO ao processar, Coloque apenas numeros! ");
        String cargoFuncionario = Util.getString("Digite o cargo do Funcionário: \n");
        String nomeFuncionario = Util.getString("Digite o nome do Funcionário:\n ");
        int idadeFuncionario = Util.getInt("Digite a idade do Funcionário: ", "ERRO ao processar, Coloque apenas numeros! ");
        long cpfFuncionario = Util.getlong("Digite o Cpf do Funcionário: ", "ERRO ao processar, Coloque apenas numeros! ");
        int telefoneFuncionario = Util.getInt("Digite o telefone do Funcionário: ", "ERRO ao processar, Coloque apenas numeros! ");
        String emailFuncionario = Util.getString("Digite o Email do Funcionário:\n");

        Funcionario funcionario = new Funcionario();
        funcionario.setId(idFuncionario);
        funcionario.setCargo(cargoFuncionario);
        funcionario.setNome(nomeFuncionario);
        funcionario.setIdade(idadeFuncionario);
        funcionario.setCpf(cpfFuncionario);
        funcionario.setTelefone(telefoneFuncionario);
        funcionario.setEmail(emailFuncionario);

        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado!");

    }

    public void deletarFuncionario() {
        if (!funcionarios.isEmpty()) {
            int delete = Util.getInt("Você deseja deletar um Funcionário! \n Digite a posição do Funcionario: ", "ERRO ao processar, Coloque apenas numeros!");
            funcionarios.remove((delete) - 1);
            System.out.println("Funcionário Deletado!");
        } else {
            System.out.println("NÃO EXISTE FUNCIONÁRIO, POR FAVOR ADICIONE UM FUNCIONÁRIO ");
        }
    }

    public Funcionario lerFuncionarios(Integer id) {
        if (!funcionarios.isEmpty()) {
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getId().equals(id)) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    System.out.println("Posição: " + (funcionarios.indexOf(funcionario) + 1));
                    System.out.println("INFORMAÇÕES DO FUNCIONARIOS: ");
                    System.out.println("ID: " + funcionario.getId());
                    System.out.println("Cargo: " + funcionario.getCargo());
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.println("Idade: " + funcionario.getIdade() + " ANOS ");
                    System.out.println("CPF: " + funcionario.getCpf());
                    System.out.println("Telefone: " + funcionario.getTelefone());
                    System.out.println("Email: " + funcionario.getEmail());
                }
            }
        } else {
            System.out.println("NÃO EXISTE, NENHUM FUNCIONÁRIO! ");
        }
        return null;
    }

    public Funcionario lerFuncionarios() {
        if (!funcionarios.isEmpty()) {
            for (Funcionario funcionario : funcionarios) {
                System.out.println("--------------------------------------------------------------------------------------------");
                System.out.println("Posição: " + (funcionarios.indexOf(funcionario) + 1));
                System.out.println("INFORMAÇÕES DO FUNCIONARIOS: ");
                System.out.println("ID: " + funcionario.getId());
                System.out.println("Cargo: " + funcionario.getCargo());
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("Idade: " + funcionario.getIdade() + " ANOS ");
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Telefone: " + funcionario.getTelefone());
                System.out.println("Email: " + funcionario.getEmail());

            }
        } else {
            System.out.println("NÃO EXISTE, NENHUM FUNCIONÁRIO! ");
        }
        return null;
    }

    public void alterarFuncionario() {
        if (!funcionarios.isEmpty()) {
            int alterarfuncionario1 = Util.getInt("Você deseja alterar dados do Funcionário!\nPor favor, digite a posição: ", "ERRO ao processar, Coloque apenas numeros!");
            int alterarfuncionario2 = Util.getInt("Selecione o que deseja alterar: \n1. ID do funcionário\n 2. Cargo do Funcionário\n3. Nome do Funcionario\n4. Idade\n5. CPF\n6. Telefone\n7. Email\n8. Não alterar nada", "ERRO ao processar, Coloque apenas numeros!");

            switch (alterarfuncionario2) {
                case 1 -> {
                    int id = Util.getInt("Digite o novo ID do Funcionário:", "ERRO ao processar, Coloque apenas numeros!");
                    funcionarios.get(alterarfuncionario1 - 1).setId(id);
                    break;
                }
                case 2 -> {
                    String cargo = Util.getString("Digite o novo cargo do Funcionário:\n");
                    funcionarios.get(alterarfuncionario1 - 1).setCargo(cargo);
                    break;
                }
                case 3 -> {
                    String nome = Util.getString("Digite o novo nome do Funcionário:\n");
                    funcionarios.get(alterarfuncionario1 - 1).setNome(nome);
                    break;
                }
                case 4 -> {
                    int idade = Util.getInt("Digite a nova idade do Funcionário: ", "ERRO ao processar, Coloque apenas numeros!");
                    funcionarios.get(alterarfuncionario1 - 1).setIdade(idade);
                    break;
                }
                case 5 -> {
                    long cpf = Util.getlong("Digite o novo Cpf do Funcionário: ", "ERRO ao processar, Coloque apenas numeros!");
                    funcionarios.get(alterarfuncionario1 - 1).setCpf(cpf);
                    break;
                }
                case 6 -> {
                    int telefone = Util.getInt("Digite o novo telefone do Funcionário: ", "ERRO ao processar, Coloque apenas numeros!");
                    funcionarios.get(alterarfuncionario1 - 1).setTelefone(telefone);
                    break;
                }
                case 7 -> {
                    String email = Util.getString("Digite o novo Email do cliente:\n");
                    funcionarios.get(alterarfuncionario1 - 1).setEmail(email);
                    break;
                }
                case 8 -> {
                    System.out.println("Não haverá alteração em nada, você retornará ao menu inicial!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
                }
                default -> {
                    System.out.println("DIGITE UM NÚMERO CORRESPONDENTE!! ");
                }
            }
            System.out.println("Dados Atualizados!");
        } else {
            System.out.println("NÃO EXISTE NENHUM FUNCIONÁRIO, SEM POSSIBILIDADE DE ALTERAÇÃO! ");
        }
    }
}

