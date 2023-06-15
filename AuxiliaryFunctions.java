package stringCalculater;

import static stringCalculater.Main.arabicNumber;
import static stringCalculater.Main.printInQuotes;

public class AuxiliaryFunctions {//вспомогательные функции
    public static void verificationOfRequirements(String[] strings, char action) throws Exception{//требования к проверке
        if (action == '*' || action == '/') {
            if (strings[1].contains("\"")) throw new Exception("Строчку можно делить или умножать только на число");
        }
        if (!(strings[0].contains("\""))) {
            throw new Exception("Пункт номер 9 Первым аргументом выражения, подаваемого на вход, должна быть строка, при вводе пользователем выражения вроде 3 + привет, калькулятор должен выбросить исключение и прекратить свою работу.");
        }
        if (arabicNumber.contains(strings[0])) {
            throw new Exception("Пункт номер 9 Первым аргументом выражения, подаваемого на вход, должна быть строка, при вводе пользователем выражения вроде 3 + привет, калькулятор должен выбросить исключение и прекратить свою работу.");
        }
        if (((strings[0].length()) > 10) || (strings[1].length() > 10)) {
            throw new Exception("строки должны быть длинной не более 10 символов.");
        }
    }
    static void removingQuotes(String[] strings) {//удаление ковычек
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replace("\"", "");
        }
    }
}

