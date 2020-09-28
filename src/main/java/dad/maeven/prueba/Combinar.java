package dad.maeven.prueba;

public class Combinar {
	/* 
	 * Combina todos los elementos de un listado y 
	 * los retotna en el formato de una 
	 * cadena separada por espacio
	 */
	public static String combinar(Object[] array) {

		String texto = "";

		for (int i = 0; i < array.length; i++) {
			texto += array[i];
			texto += " ";
		}

		return texto;
	}

	public static void main(String[] args) {
		Object[] array = { "hola", 3.1416, "adios,15", true };
		String resultado = combinar(array);
		System.out.println(resultado);
	}

}
