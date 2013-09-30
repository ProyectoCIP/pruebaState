package state;

public class Disponible implements Estado {

	public void ejecutarAccion(EstadoHabitacion habitacion) {
		// TODO Auto-generated method stub
		System.out.println("voy a reservarla");
		
		habitacion.setEstado(new Reservada());
		
	}

}
