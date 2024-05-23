package RandomAccFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;

public class EinlesenAuslesen {

    String text1 = "AAAA\nBBBB\nCCCC";
    String text2 = "EEEE\nFFFF\nGGGG";



    public static void schreibeText(String text){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("test.txt", "rw");
            randomAccessFile.writeBytes(text);

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void leseText(){
        String text = "";
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("test.txt", "rw");


            while (randomAccessFile.getFilePointer()>randomAccessFile.length()){
                text += randomAccessFile.readLine();
            }
            randomAccessFile.close();
            System.out.println(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        EinlesenAuslesen einlesenAuslesen = new EinlesenAuslesen();
        EinlesenAuslesen.schreibeText(einlesenAuslesen.text1);
        EinlesenAuslesen.leseText();
        EinlesenAuslesen.schreibeText(einlesenAuslesen.text2);
        EinlesenAuslesen.leseText();
    }
}
