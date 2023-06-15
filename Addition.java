package stringCalculater;


import static stringCalculater.AuxiliaryFunctions.removingQuotes;
import static stringCalculater.Main.printInQuotes;

public class Addition {
    static void addition(String[] s) throws Exception {
        if (!(s[1].contains("\""))) {
            throw new Exception("К строке нельзя прибавить число");
        } else {
            removingQuotes(s);//удаление ковычек находится в классе AuxiliaryFunctions
            printInQuotes(s[0] + s[1]);
        }
    }



}
