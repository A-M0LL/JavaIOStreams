package TastaturEingabeAusgabe;

import java.io.*;
public class TastarturEingabeInputStreamReader {

    public char leseZeichen(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        char input = ' ';
        try{
            input = (char)inputStreamReader.read();
            inputStreamReader.close();
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        return input;
    }

    public String leseWort(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        String input = "";
        try{
            do {
                input += (char)inputStreamReader.read();
            } while (inputStreamReader.ready());
            inputStreamReader.close();
        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
        }
        return input;
    }

    public void ausgabe(){
        System.out.println(this.leseZeichen());
        System.out.println(this.leseWort());
    }

    public static void main(String[] args) {
        TastarturEingabeInputStreamReader tastarturEingabeInputStreamReader = new TastarturEingabeInputStreamReader();
        tastarturEingabeInputStreamReader.ausgabe();
    }
}
