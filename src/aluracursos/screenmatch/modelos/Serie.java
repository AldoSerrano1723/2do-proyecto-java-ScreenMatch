package aluracursos.screenmatch.modelos;

public class Serie extends Titulo{

    //ATRIBUTOS
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    //CONSTRUCTOR
    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    //METODOS
    @Override
    public int getDuracionMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
