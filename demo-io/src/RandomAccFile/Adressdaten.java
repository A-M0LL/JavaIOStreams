package RandomAccFile;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Adressdaten {
    public void listeNamen() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("Namenliste.txt", "r");
            randomAccessFile.seek(0);

            while(randomAccessFile.getFilePointer() < randomAccessFile.length()){
                String zeile = randomAccessFile.readLine();
                String[] teile = zeile.split(",");

                System.out.println(teile[1] + " " + teile[0]);
            }
        } catch(IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Adressdaten adressdaten = new Adressdaten();

        adressdaten.listeNamen();
    }
}
