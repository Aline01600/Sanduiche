package io.github.aline01600.sanduiche;
public class SanduicheBuilder {
    private String pao = "Pão francês";
    private String carne = "Hambúrguer bovino";
    private String queijo = "Mussarela";
    private String salada = "Alface e tomate";
    private String molho = "Maionese";

    public SanduicheBuilder comPao(String pao) {
        this.pao = pao;
        return this;
    }

    public SanduicheBuilder comCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public SanduicheBuilder comQueijo(String queijo) {
        this.queijo = queijo;
        return this;
    }

    public SanduicheBuilder comSalada(String salada) {
        this.salada = salada;
        return this;
    }

    public SanduicheBuilder comMolho(String molho) {
        this.molho = molho;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(pao, carne, queijo, salada, molho);
    }
}


