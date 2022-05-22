import java.util.ArrayList;

/**
 * Barco transbordador de vehiculos.
 * 
 * @author <Nombre del alumno>
 * @version feb-15
 */
public class Transbordador {
	// vehiculos transportado por el barco
	private ArrayList<Vehiculo> vehiculosTransportados = new ArrayList<Vehiculo>();
	
	// peso maximo soportado (Kg)
	private final double pesoMaxSoportado;
	
	// peso actual debido a los vehiculos transportados (Kg)
	private double pesoActual;
	
	// precio en euros por ocupante de un vehiculo
	private static final double PRECIO_POR_OCUPANTE = 1.2;
	
	// precio en euros por Kg de peso de un vehiculo
	private static final double PRECIO_POR_Kg = 0.003; 
	
	/**
	 * Construye un transbordador que es capaz de soportar el peso maximo indicado.
	 * El transbordador comienza vacio.
	 * @param pesoMaxSoportado peso maximo soportado por el transbordador
	 */
	public Transbordador(double pesoMaxSoportado) {
		this.pesoMaxSoportado = pesoMaxSoportado;
	}
	
	/**
	 * Carga un vehiculo en el transbordador (siempre que no se supere el
	 * peso maximo soportado)
	 * @param v vehiculo a cargar
	 * @return precio a cobrar al vehiculo o -1 si se supera el peso maximo
	 * soportado 
	 */
	public double cargaVehiculo(Vehiculo v) {
		if (pesoActual + v.peso() > pesoMaxSoportado) {
			return -1;
		}else{
			pesoActual = pesoActual + v.peso();
			return v.peso()*PRECIO_POR_Kg;
		}
	}
	
	/**
	 * Busca un vehiculo con el numero de ocupantes indicado y con un peso igual
	 * o superior al peso minimo indicado
	 * @param numOcupantes numero de ocupantes del vehiculo buscado
	 * @param pesoMinimo peso minimo del vehiculo buscado
	 * @return un vehiculo cargado en el transbordador que tenga el numero de ocupantes
	 * indicado y un peso igual o mayor que el peso minimo indicado. Retorna null si no
	 * hay ningun vehiculo que cumpla las condiciones indicadas
	 */
	public Vehiculo buscaVehiculoConCaracteristicas(int numOcupantes, double pesoMinimo) {
		for (int j = 0; j < vehiculosTransportados.size(); j++) {
			if (vehiculosTransportados.contains(numOcupantes) && vehiculosTransportados.contains(pesoMinimo)) {
				return vehiculosTransportados.get(j);
			}
		}
		return null;
	}
	
	/**
	 * Vacia el transbordador de los vehiculos que transportaba.
	 */
	public void vaciaTransbordador() {
		vehiculosTransportados.clear();

	}
}
