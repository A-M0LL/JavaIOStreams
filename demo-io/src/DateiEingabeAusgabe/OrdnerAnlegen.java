package DateiEingabeAusgabe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OrdnerAnlegen {
    private File datei;
    private File ordner;

    public void ordnerAnlegen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ordnernamen eingben: ");
        String pathname = scanner.next();
        ordner = new File(pathname);

        if (ordner.exists()){
            System.out.println("Der ordner existiert schon!");
            return;
        } else if (!ordner.mkdir()){
            System.out.println("Ungültiger Name!");
            return;
        }
        System.out.println("Ordner wurde angelegt!");
        this.dateiAnlegen();
        }


    public void dateiAnlegen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dateinamen eingeben: ");
        String pathname = scanner.next();
        datei = new File(ordner, pathname + ".txt");

        try {
            if (datei.exists()){
                System.out.println("Die Datei existiert schon!");
                return;
            } else if (!datei.createNewFile()){
                System.out.println("Ungültiger Name!");
                return;
            }
                System.out.println("Datei wurde angelegt!");
                this.listeOrdner();

        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    //Erweiterung Aufgabe 2
    public void listeOrdner(){
        System.out.println("\nAlle Dateien im Ordner: " + ordner.getAbsolutePath());
        for (File file : ordner.listFiles()){
            System.out.println(file.getName());
        }
    }

    public static void main(String[] args) {
        OrdnerAnlegen ordnerAnlegen = new OrdnerAnlegen();

        ordnerAnlegen.ordnerAnlegen();

    }
}
