import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public int dimensaoTotal() {
        int dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal;
    }

    public int populacaoTotal(){
        int populacaoTotal = 0;
        for(Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacional(){
        int populacaoTotal = 0;
        int dimensaoTotal = 0;
        for(Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
            dimensaoTotal += pais.getDimensao();
        }

        return dimensaoTotal != 0 ? (double) populacaoTotal / dimensaoTotal : 0;
    }

    public Pais paisComMaiorPopoulacao() {
        Pais paisComMaiorPopulacao = null;
        int maiorPopulacao = 0;
        for (Pais pais : paises) {
            if (pais.getPopulacao() > maiorPopulacao) {
                maiorPopulacao = pais.getPopulacao();
                paisComMaiorPopulacao = pais;
            }
        }
        return paisComMaiorPopulacao;
    }

    public Pais paisComMenorPopulacao(){
        Pais paisComMenorPopulacao = null;
        int menorPopulacao = 0;
        for (Pais pais : paises){
            if (paisComMenorPopulacao == null || pais.getPopulacao() < paisComMenorPopulacao.getPopulacao()){
                menorPopulacao = pais.getPopulacao();
                paisComMenorPopulacao = pais;
            }

        }
        return paisComMenorPopulacao;
    }

    public Pais paisDeMaiorDimensao() {
        Pais maiorDimensao = null;
        double maxDimensao = Integer.MIN_VALUE;

        for (Pais pais : paises) {
            if (pais.getDimensao() > maxDimensao) {
                maxDimensao = pais.getDimensao();
                maiorDimensao = pais;
            }
        }
        return maiorDimensao;
    }

    public Pais paisDeMenorDimensao() {
        Pais menorDimensao = null;
        double minDimensao = Integer.MAX_VALUE;

        for (Pais pais : paises) {
            if (pais.getDimensao() < minDimensao) {
                minDimensao = pais.getDimensao();
                menorDimensao = pais;
            }
        }
        return menorDimensao;
    }

    public double razaoTerritorialMaiorMenor() {
        double maiorPais = paisDeMaiorDimensao().getDimensao();
        double menorPais = paisDeMenorDimensao().getDimensao();
        return (double) maiorPais / menorPais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public void mostrarInformacoes(){
        System.out.println("=============================================");
        System.out.println("Continente: " + getNome());
        System.out.println("=============================================");
        System.out.println("Dimensão total do continente: " + dimensaoTotal());
        System.out.println("População total do continente: " + populacaoTotal());
        System.out.println("País com maior população: " + paisComMaiorPopoulacao().getNome());
        System.out.println("País com menor população: " + paisComMenorPopulacao().getNome());
        System.out.println("País com maior dimensão territorial: " + paisDeMaiorDimensao().getNome());
        System.out.println("País com menor dimensão territorial: " + paisDeMenorDimensao().getNome());
        System.out.println("Razão territorial do maior país em relação ao menor país  do continente: " + String.format("%.2f", razaoTerritorialMaiorMenor()));
    }
}
