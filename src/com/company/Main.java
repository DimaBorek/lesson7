package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = getUserInput(scanner, 1 ,5 );
        System.out.println(input);

    }

   private static int getUserInput(Scanner scanner,int min, int max){
       int result;
       while (true){ //бесконечный цикл
           System.out.println("Введите число от"+min+"до"+max);
               try {
                   String stringNumber = scanner.next();
                   result = Integer.valueOf(stringNumber);
               }catch (NumberFormatException e) {
                   System.out.println("Вы ввели не число");
                   continue;
               }
               if(result<min||result>max) {
                   System.out.println("число не от" + min + "до" + max);
                   continue;
               }
               break;
               }

       return result;
   }
private static int getUserInputRecursion(Scanner scanner,int min,int max){ // метод рекурсия( вызов метода в своем же методе)
       int result;
    System.out.println("Введите число от"+min+"до"+max);
    try{
        String stringNumber = scanner.next();
        result = Integer.valueOf(stringNumber);
    }catch (NumberFormatException e) {
        System.out.println("Вы ввели не число");
        return getUserInputRecursion(scanner,min,max);
    }
    if(result<min||result>max) {
        System.out.println("число не от" + min + "до" + max);
        return getUserInputRecursion(scanner, min, max);
    }
    return result;

  }
}
