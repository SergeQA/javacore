package SergeQA.lesson12;

import java.io.*;

/**
 * Created by user on 12/13/2016.
 */
public class WritingFile {
    public static void writingFile() throws IOException {
        String firstLine = "The first line in the beginning";
        String secondLine = "The second line is the end";
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\inputdata.txt")));
        write.append(firstLine);
        write.newLine();
        write.append(secondLine);
        write.close();
    }
}
