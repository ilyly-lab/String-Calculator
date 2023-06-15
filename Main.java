package stringCalculater;

import java.util.Scanner;

import static stringCalculater.AuxiliaryFunctions.verificationOfRequirements;
import static stringCalculater.Division.division;
import static stringCalculater.Addition.*;
import static stringCalculater.Multiplication.multiplication;
import static stringCalculater.Subtraction.subtraction;

public class Main {
    static String arabicNumber = "1,2,3,4,5,6,7,8,9,0";//для проверки первого элемента
    static void printInQuotes(String text){
        System.out.println("\""+text+"\"");//добавить кавычки в готовый результат
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        exp = exp.replace(" ", "");

        String[] data;//массив для первого и второго элемента
        char action;// переменная с математическим знаком +,-,?,*

        if (exp.contains("+")) {//проверка математического знака +,-,?,*
            data = exp.split("\\+");
            action = '+';
        } else if (exp.contains("-")) {
            data = exp.split("-");
            action = '-';
        } else if (exp.contains("*")) {
            data = exp.split("\\*");
            action = '*';
        } else if (exp.contains("/")) {
            data = exp.split("/");
            action = '/';
        } else {
            throw new Exception("некорректный знак действия");
        }

        verificationOfRequirements(data, action);//проверка некоторых требований к задаче
        if (action == '+') {//с этой строки и далее ищется математический знак и выполняется выражение
            addition(data);
        }
        if (action == '*') {
            multiplication(data);
        }
        if (action == '-') {
            subtraction(data);
            }
        if (action == '/'){
            division(data);
        }
    }
}


