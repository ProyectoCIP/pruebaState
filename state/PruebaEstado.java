package state;

import java.util.Scanner;

public class PruebaEstado {

	/**
	 * @param args3
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EstadoHabitacion estHab = new EstadoHabitacion();
		Estado disponible = new Disponible();
		Estado facturada = new Facturada();
		Estado checkin = new CheckIn();
		Estado checkout = new CheckOut();
		Estado bloqueada = new Bloqueada();
		Estado reservada = new Reservada(); 
		
		int opcion = 0; 
		Scanner sc = new Scanner(System.in); 
		
		
		do{
			muestraMenu(); 
			opcion = sc.nextInt();
			
			switch(opcion)
			{
			case 1: 
				estHab.setEstado(reservada); 
				break; 
			case 2: 
				estHab.setEstado(bloqueada); 
				break; 
			case 3: 
				estHab.setEstado(disponible); 
				break; 
			case 4: 
				estHab.setEstado(facturada); 
				break; 
			case 5: 
				estHab.setEstado(checkin); 
				break;
			case 6: 
				estHab.setEstado(checkout); 
				break;
			case 7: 
				System.out.println("Estado actual:"+estHab.getEstado());; 
				break; 
			case 0:
				System.exit(0); 
			default:
				System.out.println("error de opcion");
			}
			estHab.ejecutarAccion();
			
		}while(opcion!=0); 

	}

	private static void muestraMenu()
	{
		StringBuffer menu = new StringBuffer();
		menu.append("SELECCIONE ESTADO \n");
		menu.append("1-Reservada. 2-Bloqueada. 3-Disponible \n");
		menu.append("4-Facturada. 5-CheckIn.   6-CheckOut  \n");
		System.out.println(menu.toString());
	}
}
