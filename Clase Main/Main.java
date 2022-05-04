package pract8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
    	int op;
    	Scanner guardado=new Scanner(System.in);
    	
        Jugador[] jugador = {
                new Jugador(2, "Erick", 195),
                new Jugador(6, "Axel", 168),
                new Jugador(3, "Gustavo", 120),
                new Jugador(7, "Cesar", 321)
        };
        Equipo equipo = new Equipo();
        do {
            System.out.println("Escoge una opción");
		    System.out.println("1)Nombres");
		    System.out.println("2)Uniformes");
		    op=guardado.nextInt();
		    switch(op) {
		        case 1:
		    	    System.out.println("Numero de Jugadores: " + equipo.totalPlayers(jugador));
		    	    System.out.println("");
		            for (int i = 0; i < jugador.length; i++) {
		                jugador[i].validateName();
		            }
		            System.out.println("");
		            System.out.println("Total de puntos anotados " + equipo.totalPoints(jugador));
		            System.out.println("");
		            break;
		        case 2:
		            for (int i = 0; i < jugador.length; i++) {
		                jugador[i].validateUniform();
		            }
		            break;
		        case 3:
		        	System.out.println("Gracias");break;
		    }
        }while(op != 3);
    }

}
