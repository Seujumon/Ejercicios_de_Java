package Entidades;

/**
  @author Juan Seura
 */
public class VideoJuego {
    private int codigo, cantidadDeJugadores;
    private String consola, titulo, categoria;

    public VideoJuego(int codigo, int cantidadDeJugadores, String consola, String titulo, String categoria) {
        this.codigo = codigo;
        this.cantidadDeJugadores = cantidadDeJugadores;
        this.consola = consola;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public VideoJuego() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoJuego{" + "codigo=" + codigo + ", cantidadDeJugadores=" + cantidadDeJugadores + ", consola=" + consola + ", titulo=" + titulo + ", categoria=" + categoria + '}';
    }
    
    

}
