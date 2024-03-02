package boundary;

import bean.Smartphone;
import esSmartphoneKamanin.InputSmartphone;
import esSmartphoneKamanin.OutputSmartphone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione del primo smartphone
        System.out.println("Inserisci le informazioni per il primo smartphone:");
        Smartphone smartphone1 = new InputSmartphone().getSmartphone(scanner);

        // Creazione del secondo smartphone
        System.out.println("\nInserisci le informazioni per il secondo smartphone:");
        Smartphone smartphone2 = new InputSmartphone().getSmartphone(scanner);

        // Output delle informazioni sugli smartphone
        
        OutputSmartphone.printSmartphoneInfo(smartphone1);
        OutputSmartphone.printSmartphoneInfo(smartphone2);
        
        System.out.println(smartphone1);
        System.out.println(smartphone2);

        scanner.close();
    }
}

