package lab;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class lab {
	
	public static void main(String[] args) throws IOException { 
		
		
		Auto auto = inserimento();
		System.out.println("fine inserimento\n");
			

		
	}


    public static Auto inserimento() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Acquisizione dati telaio
        System.out.println("Inserisci il produttore del telaio:");
        String produttoreTelaio = reader.readLine();
        System.out.println("Inserisci il numero del telaio:");
        int numeroTelaio = Integer.parseInt(reader.readLine());
        Telaio telaio = new Telaio(produttoreTelaio, numeroTelaio);
        
        // Acquisizione dati motore
        System.out.println("Inserisci il produttore del motore:");
        String produttoreMotore = reader.readLine();
        System.out.println("Inserisci il numero del motore:");
        int numeroMotore = Integer.parseInt(reader.readLine());
        Motore motore = new Motore(produttoreMotore, numeroMotore);
        
        // Acquisizione dati cambio
        System.out.println("Inserisci il produttore del cambio:");
        String produttoreCambio = reader.readLine();
        System.out.println("Inserisci il numero del cambio:");
        int numeroCambio = Integer.parseInt(reader.readLine());
        Cambio cambio = new Cambio(produttoreCambio, numeroCambio);
        
        // Creazione dell'oggetto Auto
        Auto auto = new Auto(telaio, motore, cambio);
        return auto;
    }

}








