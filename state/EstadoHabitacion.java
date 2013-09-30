package state;

public class EstadoHabitacion {
	
	private Estado miEstado; 
	
	public String getEstado() {
		return miEstado.toString();
	}
	
	public void setEstado(Estado e)
	{
		this.miEstado = e; 
	}
	
	public void ejecutarAccion(){
		
		miEstado.ejecutarAccion(this);
	}

}
