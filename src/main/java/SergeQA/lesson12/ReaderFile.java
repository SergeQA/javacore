package SergeQA.lesson12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class ReaderFile {
    public static void readerFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("F:\\inputdata.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            System.out.println("Reagrdless about exception you will see this text");
        }

    }
}
