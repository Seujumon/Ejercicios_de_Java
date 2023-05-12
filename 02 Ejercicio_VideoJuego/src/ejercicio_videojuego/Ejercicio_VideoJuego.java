
package ejercicio_videojuego;

import Entidades.VideoJuego;
import java.util.ArrayList;

/**
 @author Juan Seura
 */
public class Ejercicio_VideoJuego {
    
    public static void main(String[] args) {
        ArrayList <VideoJuego> listaDeVJ = new ArrayList<>();
        VideoJuego juego1= new VideoJuego(1, 4, "Nintendo64", "Super Mario Kart 64", "Carreras");
        VideoJuego juego2=new VideoJuego(2, 2, "Sega", "Mortal Kombat 3 Ultimate", "Peleas");
        VideoJuego juego3=new VideoJuego(3, 1, "Nes", "Poyan", "Plataforma");
        VideoJuego juego4=new VideoJuego(4, 2, "Nintendo64", "Street Fighter", "Peleas");
        VideoJuego juego5=new VideoJuego(5, 1, "PC", "Prince of Persia", "Plataforma");
        listaDeVJ.add(juego1);
        listaDeVJ.add(juego2);
        listaDeVJ.add(juego3);
        listaDeVJ.add(juego4);
        listaDeVJ.add(juego5);
        for(VideoJuego aux : listaDeVJ){
            System.out.println("Código: " + aux.getCodigo());
            System.out.println("Juego: " + aux.getTitulo());
            System.out.println("Cantidad de Jugadores: " + aux.getCantidadDeJugadores());
            System.out.println("Consola: " + aux.getConsola());
            System.out.println("Categoría: " + aux.getCategoria());
            System.out.println("");
            System.out.println("===========**********=========");
            System.out.println("");
        }
        //CAMBIO DE JUEGOS
        listaDeVJ.get(2).setCantidadDeJugadores(2);
        listaDeVJ.get(2).setTitulo("Urban Champion");
        listaDeVJ.get(3).setCantidadDeJugadores(1);
        listaDeVJ.get(3).setTitulo("Killer Instict");
        
        
        for(VideoJuego aux : listaDeVJ){
            System.out.println("Código: " + aux.getCodigo());
            System.out.println("Juego: " + aux.getTitulo());
            System.out.println("Cantidad de Jugadores: " + aux.getCantidadDeJugadores());
            System.out.println("Consola: " + aux.getConsola());
            System.out.println("Categoría: " + aux.getCategoria());
            System.out.println("");
            System.out.println("===========**********=========");
            System.out.println("");
        }
        
        System.out.println("JUEGOS DE NINTENDO 64-");
        
       for(VideoJuego juego: listaDeVJ){
           if(juego.getConsola().equalsIgnoreCase("nintendo64")){
                System.out.println("Código: " + juego.getCodigo());
                System.out.println("Juego: " + juego.getTitulo());
                System.out.println("Cantidad de Jugadores: " + juego.getCantidadDeJugadores());
                System.out.println("Consola: " + juego.getConsola());
                System.out.println("Categoría: " + juego.getCategoria());
                System.out.println("");
                System.out.println("===========**********=========");
                System.out.println("");
               
           }
       }
        
         
        
    }

}
