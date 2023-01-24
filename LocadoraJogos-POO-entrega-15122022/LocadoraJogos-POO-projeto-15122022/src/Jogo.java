public class Jogo {

    private String nome;
    private String Categoria;
    private int anoLancamento;
    private boolean locado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean getLocado() {
        return locado;
    }

    public void setLocado(boolean locado) {
        this.locado = locado;
    }
}
