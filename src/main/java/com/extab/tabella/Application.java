package com.extab.tabella;

import com.extab.tabella.entities.Acquisto;
import com.extab.tabella.entities.Citta;
import com.extab.tabella.entities.Libro;
import com.extab.tabella.entities.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.SELECT;

@SpringBootApplication
public class Application implements CommandLineRunner
{
	ArrayList<Persona> persone = new ArrayList<>();
	ArrayList<Libro> libro = new ArrayList<>();
	ArrayList<Citta> citta = new ArrayList<>();
	ArrayList<Acquisto> acquisti = new ArrayList<>();
	ArrayList<Object> join = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception
	{
		letturaPersona();
		letturaLibri();
		letturaCitta();
		letturaAcquisti();
		joinPersonaCitta(persone,citta,libro,acquisti);
	}
	void letturaPersona()
	{
		try
		{
			int indice = 0;
			File file = new File("database\\" + "persona.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				if(indice > 0)
				{
					String dati = scanner.nextLine();
					String [] split = dati.split(",");
					persone.add(new Persona(split[0],split[1],split[2],Integer.parseInt(split[3]),Integer.parseInt(split[4]),split[5]));
				}
				else
				{
					scanner.nextLine();
				}
				indice++;
			}
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	void letturaLibri()
	{
		try
		{
			int indice = 0;
			File file = new File("database\\" + "libro.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				if(indice > 0)
				{
					String dati = scanner.nextLine();
					String [] split = dati.split(",");
					libro.add(new Libro(split[0],split[1],split[2],split[3]));
				}
				else
				{
					scanner.nextLine();
				}
				indice++;
			}
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	void letturaCitta()
	{
		try
		{
			int indice = 0;
			File file = new File("database\\" + "citta.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				if(indice > 0)
				{
					String dati = scanner.nextLine();
					String [] split = dati.split(",");
					citta.add(new Citta(Integer.parseInt(split[0]),split[1],split[2],split[3],Integer.parseInt(split[4]),Integer.parseInt(split[5])));
				}
				else
				{
					scanner.nextLine();
				}
				indice++;
			}
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	void letturaAcquisti()
	{
		try
		{
			int indice = 0;
			File file = new File("database\\" + "acquisto.txt");
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine())
			{
				if(indice > 0)
				{
					String dati = scanner.nextLine();
					String [] split = dati.split(",");
					acquisti.add(new Acquisto(split[0],split[1], LocalDate.parse(split[2]),Integer.parseInt(split[3])));
				}
				else
				{
					scanner.nextLine();
				}
				indice++;
			}
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	void joinPersonaCitta(ArrayList<Persona> tabella1, ArrayList<Citta> tabella2, ArrayList<Libro> tabella3, ArrayList<Acquisto> tabella4) throws ClassNotFoundException
	{
		for(Persona item: persone)
		{
			for(Citta item1: citta)
			{
				for(Libro item2: libro)
				{
					for(Acquisto item3: acquisti)
					{
						if(item.getCf().equals(item3.getCfP()) && item2.getId().equals(item3.getIdL()) && item.getCitta() == item1.getCap())
						{
							System.out.println(item.getNome() + " " + item.getCognome() + " " + item.getCf() + " " + item.getGenere() + " " + item.getCitta() + " " + item.getAnno_nascita() + " " + item1.getNome() + " " + item1.getProvincia() + " " + item1.getRegione() + " " + item1.getEstensione() + " " + item1.getN_abitanti() + " " + item2.getId() + " " + item2.getTitolo() + " " + item2.getDescrizione() + " " + item2.getTipologia() + " " + item3.getData() + " " + item3.getPrezzo());
						}
					}
				}

			}
		}
	}
}