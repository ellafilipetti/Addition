//Date : 14 juin
//Auteur: efilipetti

package ella_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;

public class Exemple2 {


	public static void main(String[] args)  throws IOException,FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		char c;
		
			ficALire=new FileReader("monFichier.txt");
			entree = new BufferedReader(ficALire);
			c=(char) entree.read();
			System.out.print(c);
			c=(char) entree.read();
			System.out.print(c);
			c=(char) entree.read();
			System.out.print(c);
			entree.close();
			ficALire.close();
	}

}
