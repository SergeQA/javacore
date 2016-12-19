package SergeQA.homework.lesson12;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class NumberSorting {
    public static void numberSorting() throws IOException {
        BufferedReader reading = new BufferedReader(new FileReader("F:\\QA_Automation\\Projects\\Javacore\\javacore\\InputFile.txt"));
        String line;
        while ((line = reading.readLine()) != null) {
            String[] splittedLine = line.split(",");

            int[] numbersToSort = new int[splittedLine.length];
            for (int i = 0; i < splittedLine.length; i++) {
                numbersToSort[i] = Integer.valueOf(splittedLine[i]);
            }

            for (int j = 0; j < numbersToSort.length; j++) {
                for (int k = 1; k < numbersToSort.length; k++) {
                    if (numbersToSort[k - 1] > numbersToSort[k]) {
                        int temp;
                        temp = numbersToSort[k - 1];
                        numbersToSort[k - 1] = numbersToSort[k];
                        numbersToSort[k] = temp;
                    }
                }
            }

            String lineToWrite = Arrays.toString(numbersToSort);

            System.out.println(Arrays.toString(numbersToSort));


            BufferedWriter lineNew = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\QA_Automation\\Projects\\Javacore\\javacore\\OutputFile.txt")));
            lineNew.append(lineToWrite);
            lineNew.newLine();
            lineNew.close();
        }

    }




}
