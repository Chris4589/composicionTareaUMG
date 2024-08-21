package com.variables.variables01.comportamiento;

public class Main {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Gallina gallina = new Gallina();
        pato.cantar();
        gallina.cantar();

        PatoNegro patoNegro = new PatoNegro(pato);
        patoNegro.cantar();
    }
}
