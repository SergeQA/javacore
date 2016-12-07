package SergeQA.lesson10;

import java.util.Arrays;

/**
 * Created by user on 12/6/2016.
 */
public class Strings {

    public static void convertToString(){
        String toPrint = "";
        char [] charToString = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for (int i = 0; i < charToString.length; i++){
            toPrint += charToString[i];
        }

        System.out.println(toPrint);
    }

    public static void replaceInString(){
        String withReplacement = "";
        char [] arrayForReplace = {'a', 'b', ',', 'c', '[', 'd', 'b', 'b', ']', };
        withReplacement = Arrays.toString(arrayForReplace);
        withReplacement.replace(",", "]");
        System.out.println(withReplacement);
    }

/*    public void changeCar(Car car){
        car.name = "Default BMW";
    }
*/

}
