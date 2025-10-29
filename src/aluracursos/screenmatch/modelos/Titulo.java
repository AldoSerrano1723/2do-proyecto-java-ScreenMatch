package aluracursos.screenmatch.modelos;

public class Titulo {

    //ATRIBUTOS

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvalaciones;

    //CONSTRUCTOR
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }


    //METODOS SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
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
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionMinutos());
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
