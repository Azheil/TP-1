import java.io.IOException;
import java.util.Scanner;

/**
 * 21 sept. 2012
 * Seb
 * TP-1
 */

/**
 * @author Seb
 *
 */
public class PgmEditer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("PGM Editer");
		System.out.println("----------------------");
		System.out.println("\nEntrer le nom de fichier");
		Scanner sc = new Scanner(System.in);
		String filePath = sc.next();
		
		try {
			ShortPixmap image = new ShortPixmap(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	
	public void histogramme(ShortPixmap img) {
		short[] histogramme = new short[256];
		
		for (int i=0; i<=img.width; i++) {
			for (int j=0; j<=img.height; i++ ) {
				//int k = img.
				//histogramme[k]++; 
			}
		}
	}

}
