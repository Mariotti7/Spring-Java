package fileTeste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramIII {

	public static void main(String[] args) {
		// File Writer e Buffered Writer (criação de arquivo)
		
		String[] lines = new String[]{"Shazam!", "Carai!", "Boa noite!"};
		
		String path = ("C:\\Users\\Geraldo\\out.txt");
		String path2 = ("C:\\Users\\Geraldo\\out.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		//Lendo o arquivo criado
		
		try (BufferedReader br = new BufferedReader(new FileReader(path2))){
			String line2 = br.readLine();
			
			while(line2 != null) {
				System.out.println(line2);
				line2 = br.readLine();
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
