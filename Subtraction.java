package stringCalculater;

import static stringCalculater.AuxiliaryFunctions.removingQuotes;
import static stringCalculater.Main.printInQuotes;

public class Subtraction {
    static void subtraction(String[] s) {
        removingQuotes(s);//удаление кавычек находится в классе AuxiliaryFunctions
        int index = s[0].indexOf(s[1]);//находим индекс начала второго элемента
        if(index == -1) { //если не нашел, то печатаем неизменно первый элемент
            printInQuotes(s[0]);
        }else{
            String result = s[0].substring(0, index);//обрезаем первый элемент если if 1
            result+=s[0].substring(index+s[1].length());//вырезаем второй элемент от его начала, на его длину
            printInQuotes(result);
        }
    }
}
