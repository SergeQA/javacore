package SergeQA.lesson12;

import java.io.*;

/**
 * Created by user on 12/13/2016.
 */
public class IsPalindrome {
    public static void isPalindrome() throws IOException {
        BufferedReader reading = new BufferedReader(new FileReader("F:\\inputdata.txt"));
        String line;
        line = reading.readLine();
        StringBuilder newLine = new StringBuilder(line);
        newLine.reverse();
        String linePalindrome = "This line is palindrome";
        String lineNotPalindrome = "This line is not palindrome";
        if (line.equals(newLine)){
            BufferedWriter madeLine = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\outputdata.txt")));
            madeLine.append(linePalindrome);
            madeLine.close();
        }
        else {
            BufferedWriter madeLine = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\outputdata.txt")));
            madeLine.append(lineNotPalindrome);
            madeLine.close();
        }
    }
}
