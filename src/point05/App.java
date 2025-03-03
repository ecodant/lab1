package point05;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		/*
		 * NOTA: Las clases de este ejercicio implementan la interface "Map" y usan un
		 * sistema de almacenamiento clave-valor, para crear instancias de ellas toca
		 * especificar el tipo del la clave o el tipo del valor y estas deben ser
		 * clases, no valores primitivos EJ: <String, Integer> String será la clave y
		 * Integer será el valor
		 */

		/*
		 * El HashMap es una collection desordenada, y no ofrece garantias de ningun
		 * order para los elementos que se ponga en ellas, tambien permiten almacenar
		 * nulls cosa que no todas las 3 collection aquí pueden.
		 */
		HashMap<String, Integer> hashito = new HashMap<>();
		/*
		 * El TreeMap a diferencia del anterior permite order los elementos con
		 * comparadores basicamente se solo se le debe indicar el criterio de
		 * comparación y se orderia los elementos, otra cosita es que no le gustan los
		 * nulls.
		 * 
		 */
		TreeMap<String, Integer> treecitoMap = new TreeMap<>();
		/*
		 * El LinkedHashMap es según lo que entendí en la documentación una mezcla del
		 * Hash y el LinkedList el Hash hace referencia a una "Hash Table" que es una
		 * diccionario de claves valor y el LinkedList pues es una lista lineal de
		 * valores que el order se determina por la inserción, por lo cual "garantiza"
		 * un order en los elementos a diferencia del HashMap de arriba, pero pues es
		 * lineal
		 */
		LinkedHashMap<String, Integer> linkedcito = new LinkedHashMap<>();

	}

}
