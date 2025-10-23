package aluracursos.screenmatch.calculos;

import aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    //ATRIBUTOS
    private int timepoTotal;

    //METODOS
    public int getTimepoTotal() {
        return this.timepoTotal;
    }

    public void incluye (Titulo titulo){
        this.timepoTotal += titulo.getDuracionMinutos();
    }

}
