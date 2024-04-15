import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pais brasil = new Pais("Brasil", 212559417, 8515770);
        Pais chile = new Pais("Chile", 4738273, 38280203);

        Continente americaDoSul = new Continente("América do Sul");

        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(chile);
        americaDoSul.mostrarInformacoes();
    }
}