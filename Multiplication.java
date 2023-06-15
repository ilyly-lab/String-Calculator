package stringCalculater;

import static stringCalculater.AuxiliaryFunctions.removingQuotes;
import static stringCalculater.Main.printInQuotes;

public class Multiplication {
    static void multiplication(String[] s) throws Exception{
        removingQuotes(s);//удаление кавычек находится в классе AuxiliaryFunctions
        int multipler = Integer.parseInt(s[1]);//переводим в инт
        if (multipler > 10) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно,");
        }
        String rezult = "";
        for (int i = 0; i < multipler; i++) {
            rezult += s[0];
        }
        if (rezult.length() > 40) {
            rezult = rezult + "...";
        }
        printInQuotes(rezult);
    }
}
