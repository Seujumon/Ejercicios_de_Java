
package pokedex;

import Servicios.PokemonServicios;

/**
 @author Juan Seura
 */
public class Pokedex {
    
    public static void main(String[] args) {
        PokemonServicios servicios = new PokemonServicios();
        servicios.ataquesPikachu();
        servicios.ataquesCharmander();
        servicios.ataquesSquartle();
        servicios.ataquesBulbasor();
    }
}
