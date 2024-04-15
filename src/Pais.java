public class Pais {
    private String nome;
    private int populacao;
    private double dimensao;

    public Pais(String nome, int populacao, double dimensao) {
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
}

