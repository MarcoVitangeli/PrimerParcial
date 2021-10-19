package unlam.progava.oia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LectorDeArchivos {
	public static String leerArchivo(String path) {
		Scanner in = null;
		try {
			in = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		in.close();
		
		return "";
	}
}
