package Entidades;

/**
  @author Juan Seura
 */
public abstract class Pokemon {
   
    protected int num_pokedex, temporadaQueAparece;
    protected String numbrePokemon, sexo, tipo;
    protected double pesoPokemon;

    public Pokemon(int num_pokedex, int temporadaQueAparece, String numbrePokemon, String sexo, String tipo, double pesoPokemon) {
        this.num_pokedex = num_pokedex;
        this.temporadaQueAparece = temporadaQueAparece;
        this.numbrePokemon = numbrePokemon;
        this.sexo = sexo;
        this.tipo = tipo;
        this.pesoPokemon = pesoPokemon;
    }

    public Pokemon() {
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
    
    
    public abstract void atacarPlacaje();
    public abstract void atacarAranazo();
    public abstract void atacarMordisco();
    

}

