package SergeQA.homework.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 12/20/2016.
 */
public class PalindromeWords {
    public static void palindromeWords() throws IOException {
        BufferedReader wordRead = new BufferedReader(new FileReader("F:\\QA_Automation\\Projects\\Javacore\\javacore\\FileWords"));
        String lineOne;
        while ((lineOne = wordRead.readLine()) !=null){
            StringBuilder lineTwo = new StringBuilder(lineOne);
            lineTwo.reverse();
        }
    }
}