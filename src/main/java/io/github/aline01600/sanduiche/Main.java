package io.github.aline01600.sanduiche;
public class Main {
    public static void main(String[] args) {
        Sanduiche sanduiche1 = new SanduicheBuilder()
            .comPao("Pão integral")
            .comCarne("Frango grelhado")
            .comQueijo("Cheddar")
            .comSalada("Rúcula e tomate")
            .comMolho("Barbecue")
            .build();

        Sanduiche sanduiche2 = new SanduicheBuilder()
            .comCarne("Hambúrguer vegetariano")
            .comMolho("Molho de alho")
            .build();

        System.out.println(sanduiche1);
        System.out.println();
        System.out.println(sanduiche2);
    }
}
