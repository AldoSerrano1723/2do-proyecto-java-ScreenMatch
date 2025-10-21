package aluracursos.screenmatch.modelos;

public class Peliculas {

    //ATRIBUTOS

    private String nombreDePelicula;
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvalaciones;

    //METODOS SET

    public void setNombreDePelicula(String nombreDePelicula) {
        this.nombreDePelicula = nombreDePelicula;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    //METODOS GET

    public int getTotalDeLasEvalaciones(){
        return totalDeLasEvalaciones;
    }

    public String getNombreDePelicula() {
        return nombreDePelicula;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    //METODOS

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombreDePelicula);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionMinutos);
        System.out.println("Incluido en el plan: " + (incluidoEnPlan ? "Si" : "No"));
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvalaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvalaciones;
    }
}
