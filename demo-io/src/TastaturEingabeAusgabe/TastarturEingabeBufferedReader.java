package TastaturEingabeAusgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TastarturEingabeBufferedReader {

    public String leseZeile(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            input = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return input;
    }

    public String leseMehrereZeilen(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        try {
            do {
                input += bufferedReader.readLine();
            } while (!input.endsWith("over"));
            input = input.substring(0, input.length()-4);
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return input;
    }

    public void ausgabe(){
        System.out.println(this.leseZeile());
        System.out.println(this.leseMehrereZeilen());
    }

    public static void main(String[] args) {
    TastarturEingabeBufferedReader tastarturEingabeBufferedReader = new TastarturEingabeBufferedReader();

    tastarturEingabeBufferedReader.ausgabe();
    }


}
