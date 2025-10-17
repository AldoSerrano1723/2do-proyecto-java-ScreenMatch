public class Peliculas {

    String nombreDePelicula;
    int fechaDeLanzamiento;
    int duracionMinutos;
    boolean incluidoEnPlan;
    double sumaDeLasEvaluaciones;
    int totalDeLasEvalaciones;

    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombreDePelicula);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionMinutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvalaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvalaciones;
    }
}
