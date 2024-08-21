package com.variables.variables01.comportamiento;

public class PatoNegro {
    private CantoAve cantoAve;

    public PatoNegro(CantoAve cantoAve) {
        this.cantoAve = cantoAve;
    }

    public void cantar() {
        cantoAve.cantar();
    }
}
