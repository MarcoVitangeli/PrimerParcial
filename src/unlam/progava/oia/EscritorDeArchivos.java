package unlam.progava.oia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritorDeArchivos {
	
	public static void escribirArchivo(String path,int resultado) {
		FileWriter file = null;
		PrintWriter printerWriter = null;

		try {
			file = new FileWriter(path);
			printerWriter = new PrintWriter(file);

			printerWriter.println(Integer.toString(resultado));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}	
