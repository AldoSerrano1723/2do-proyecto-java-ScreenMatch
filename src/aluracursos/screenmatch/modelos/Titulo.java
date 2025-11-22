package aluracursos.screenmatch.modelos;


import aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo> {

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

    public Titulo(TituloOMDB tituloOMDB) {
        this.nombre = tituloOMDB.title();
        this.fechaDeLanzamiento = Integer.valueOf(tituloOMDB.year());

        if (tituloOMDB.runtime().contains("N/A")) {
            throw new ErrorEnConversionDeDuracionException("No puedo convertir la duracion, porque contiene un N/A");
        }

        this.duracionMinutos = Integer.valueOf(tituloOMDB.runtime().substring(0, 3).replace(" ", ""));
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
    @Override
    public int compareTo(Titulo otrotitulo) {
        return this.getNombre().compareTo(otrotitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(" + "Titulo: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")," + " Duracion: " + this.duracionMinutos + " min" + ")";
    }

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
