package TastaturEingabeAusgabe;

import java.io.*;
public class TastaturEingabeInputStream {

public char leseZeichen() {
    char input = 0;
    try {
        input = (char) System.in.read();
    } catch (IOException e) {
        System.out.println("ERROR: " + e.getMessage());
    }
    return input;
}

public String leseWort(){
    String input = "";
    try {
        do {
            input += (char) System.in.read();
        } while (System.in.available()>0);
    } catch (IOException e){
        System.out.println(e.getMessage());
    }
    return input;
}

public void ausgabe(){
    System.out.println(leseZeichen());
    System.out.println(leseWort());
}

    public static void main(String[] args) {
        TastaturEingabeInputStream tastaturEingabeInputStream = new TastaturEingabeInputStream();
        tastaturEingabeInputStream.ausgabe();
    }
}
