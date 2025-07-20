package io.github.aline01600.sanduiche;
public class Sanduiche {
    private String pao;
    private String carne;
    private String queijo;
    private String salada;
    private String molho;

    public Sanduiche(String pao, String carne, String queijo, String salada, String molho) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.salada = salada;
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Sanduíche:\n" +
               "- Pão: " + pao + "\n" +
               "- Carne: " + carne + "\n" +
               "- Queijo: " + queijo + "\n" +
               "- Salada: " + salada + "\n" +
               "- Molho: " + molho;
    }
}
