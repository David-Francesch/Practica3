import java.util.Scanner;

/**
 * Gestion de de la carga de vehiculos en un barco transbordador
 * @author <Nombre del alumno>
 * @version feb-15
 */
public class GestionTransbordador {

	/**
	 * Programa principal basado en menu
	 */
	public static void main(String[] args) {
		// opciones del menu
		final int CARGA_VEHICULO = 1, BUSCA_VEHICULO = 2, VACIA_TRANSBORDADOR = 3;

		// variables auxiliares
		Scanner sc= new Scanner(System.in);
		int numOcupantes;
		double peso;

		// crea el transbordador
		// TODO

		// crea la ventana de menú
		// Menu menu = new Menu("Carga transbordador");
		// menu.insertaOpcion("Carga vehiculo", CARGA_VEHICULO);
		// menu.insertaOpcion("Busca vehiculo", BUSCA_VEHICULO);
		// menu.insertaOpcion("Vacia transbordador", VACIA_TRANSBORDADOR);
		int opcion;

		System.out.println("Selecciona una opcion:");
		System.out.println("1. Cargar vehiculo");
		System.out.println("2. Buscar vehiculo");
		System.out.println("3. Vaciar vehiculo");
		System.out.println("4. Salir");
		// lazo de espera de comandos del usuario
		while(true) {
			opcion = sc.nextInt();

			// realiza las acciones dependiendo de la opción elegida
			switch (opcion) {
			case 1:
				// lect = new Lectura("Datos vehiculo");
				// lect.creaEntrada("Matricula", "");
				// lect.creaEntrada("Num ocupantes", "");
				// lect.creaEntrada("Peso (Kg)", "");
				// lect.esperaYCierra();
				System.out.println("Introduce la matricula");
				String matricula = sc.nextLine();
				System.out.println("Introduce el numero de ocupantes");
				numOcupantes = sc.nextInt();
				System.out.println("Introduce el peso del vehiculo");
				peso = sc.nextDouble();
				
				// Crea el vehiculo y le carga en el transbordador
				Vehiculo v = new Vehiculo(matricula, peso, numOcupantes);
				
				// muestra informacion sobre la carga
				if (precio < 0) {
					System.out.println("Error, Superada carga maxima");
				} else {
					System.out.println("Precio vehiculo:" + precio);
				}
				break;

			case 2:
				// lect = new Lectura("Busca vehiculo por caracteristicas");
				// lect.creaEntrada("Num ocupantes", "");
				// lect.creaEntrada("Peso (Kg)", "");
				// lect.esperaYCierra();
				numOcupantes = sc.nextInt();
				double pesoMinimo = sc.nextDouble();
				
				// busca el vehiculo con las caracteristicas indicadas
				// TODO
				
				// muestra datos del vehiculo buscado
				if (v == null) {
					System.out.println("Error, No hay ningun vehiculo con las caracteristicas buscadas");
				} else {
					mensaje("Datos vehiculo", "Matricula:" + v.matricula() +
							"\nNum ocupantes:" + v.numOcupantes() +
							"\nPeso (Kg):" + v.peso());
				}				
				break;

			case 3:
				// vacia el transbordador y le deja preparado para comenzar una nueva carga
				// TODO
								
				System.out.println("Informacion, El transbordador ha sido vaciado");
				break;
			default:
				System.out.println("Selecciona la opcion correcta.");
			}
		}
	}

	/**
	 * Metodo auxiliar que muestra un ventana de mensaje
	 * @param titulo titulo de la ventana
	 * @param txt texto contenido en la ventana
	 */
	// private static void mensaje(String titulo, String txt) {
	// 	Mensaje msj = new Mensaje(titulo);
	// 	msj.escribe(txt);

	// }

}
