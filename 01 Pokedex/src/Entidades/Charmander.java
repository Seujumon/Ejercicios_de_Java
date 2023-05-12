package Entidades;

/**
  @author Juan Seura
 */
public class Charmander extends Pokemon implements Fuego{

    public Charmander(int num_pokedex, int temporadaQueAparece, String numbrePokemon, String sexo, String tipo, double pesoPokemon) {
        super(num_pokedex, temporadaQueAparece, numbrePokemon, sexo, tipo, pesoPokemon);
    }

    public Charmander() {
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public int getTemporadaQueAparece() {
        return temporadaQueAparece;
    }

    public void setTemporadaQueAparece(int temporadaQueAparece) {
        this.temporadaQueAparece = temporadaQueAparece;
    }

    public String getNumbrePokemon() {
        return numbrePokemon;
    }

    public void setNumbrePokemon(String numbrePokemon) {
        this.numbrePokemon = numbrePokemon;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }
    

    @Override
    public void atacarPlacaje() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Placaje");
    }

    @Override
    public void atacarAranazo() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Aranazo");
    }

    @Override
    public void atacarMordisco() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Punio de Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Soy " + getNumbrePokemon() + ", y uso Lanza Llamas");
    }

}
