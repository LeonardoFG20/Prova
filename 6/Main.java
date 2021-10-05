import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Main {


	public static void main(String[] args) {

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("prova.txt")));
			out.write("Leonardo Franco Gambeta");
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedReader in = new BufferedReader(new FileReader("teste.txt"));
			System.out.println(in.readLine());
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
