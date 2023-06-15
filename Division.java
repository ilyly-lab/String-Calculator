package stringCalculater;

import static stringCalculater.AuxiliaryFunctions.removingQuotes;
import static stringCalculater.Main.printInQuotes;

public class Division {
    static void division(String[] s) throws Exception{
        removingQuotes(s);//удаление кавычек находится в классе AuxiliaryFunctions
        int divider = Integer.parseInt(s[1]);//получаем число на которое будем делить
        if (divider > 10) {
            throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно,");
        }
        int newLen = s[0].length()/divider;//получаем результат деления
        String result = s[0].substring(0,newLen);//обрезаем
        printInQuotes(result);
    }
}
