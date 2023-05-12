package Servicios;

import Entidades.Bulbasor;
import Entidades.Charmander;
import Entidades.Pikachu;
import Entidades.Squartle;

/**
  @author Juan Seura
 */
public class PokemonServicios{
        Pikachu pika;
        Charmander charchar;
        Squartle squar;
        Bulbasor bulba;

    public PokemonServicios() {
        this.pika = new Pikachu(1,1,"Pika Pika","Masculino", "Eléctrico", 1.5);
        this.charchar = new Charmander(1,1,"Char Char","Masculino", "Fuego", 1.7);
        this.squar = new Squartle(1,1,"Squar Squar","Masculino", "Agua", 1.8);
        this.bulba  = new Bulbasor(1,1,"Bulb Bulb","Masculino", "Planta", 2.0);
    }
    
    public void ataquesPikachu(){
        System.out.println("Ataca Pikachu!!!"
                + "\n "); 
        pika.atacarRayo();
        pika.atacarAranazo();
        pika.atacarImpactrueno();
        pika.atacarMordisco();
        pika.atacarPunioTrueno();
        pika.atacarRayoCarga();
        pika.atacarPlacaje();
        System.out.println("");
    }
    public void ataquesCharmander(){
        System.out.println("Ataca Charmander!!!"
                + "\n "); 
        charchar.atacarAranazo();
        charchar.atacarAscuas();
        charchar.atacarLanzallamas();
        charchar.atacarMordisco();
        charchar.atacarPlacaje();
        charchar.atacarPunioFuego();
        System.out.println("");
    }
    public void ataquesSquartle(){
        System.out.println("Ataca Squartle!!!"
                + "\n "); 
        squar.atacarAranazo();
        squar.atacarBurbuja();
        squar.atacarHidroBomba();
        squar.atacarHidroPulso();
        squar.atacarMordisco();
        squar.atacarPistolaDeAgua();
        squar.atacarPlacaje();
        System.out.println("");
    }
    public void ataquesBulbasor(){
        System.out.println("Ataca Bulbasor!!!"
                + "\n "); 
        bulba.atacarAranazo();
        bulba.atacarDrenaje();
        bulba.atacarHojaAfilada();
        bulba.atacarLatigoCepa();
        bulba.atacarMordisco();
        bulba.atacarParalizar();
        bulba.atacarPlacaje();
        System.out.println("");
    }
}