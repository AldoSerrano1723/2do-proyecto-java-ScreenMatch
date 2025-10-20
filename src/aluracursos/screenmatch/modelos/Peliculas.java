package aluracursos.screenmatch.modelos;

public class Peliculas {

    public String nombreDePelicula;
    public int fechaDeLanzamiento;
    public int duracionMinutos;
    public boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvalaciones;

    public int getTotalDeLasEvalaciones(){
        return totalDeLasEvalaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombreDePelicula);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionMinutos);
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvalaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvalaciones;
    }
}
