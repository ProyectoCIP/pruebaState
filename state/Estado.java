package state;

public interface Estado {
	
	//lo sobre-escriben cada estado. 

	public void ejecutarAccion(EstadoHabitacion habitacion);

}
