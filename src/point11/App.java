package point11;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {

	public static void main(String[] args) {
		LinkedHashSet<String> favoriteSongs = new LinkedHashSet<>();

		// Los temas, variadito
		favoriteSongs.add("Señora");
		favoriteSongs.add("Mi primera Cana");
		favoriteSongs.add("Hotel California");
		favoriteSongs.add("Tu con El");
		favoriteSongs.add("Sharks");

		System.out.println("Favorite Songs in Order:");
		Iterator<String> it = favoriteSongs.iterator();
		while (it.hasNext()) {
			String song = it.next();
			System.out.println(song);
		}
	}

}
