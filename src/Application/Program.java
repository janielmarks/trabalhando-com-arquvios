package Application;

import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException {

        String[] lines = new String[] { "Good morning, afternoon, night"};
        String path = "/home/janiel-marques/Downloads/teste.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line: lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}


