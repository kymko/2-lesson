package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        String color = "Красный";
        switch (color){
            case "Белый":
                System.out.println("Значение переменной равно: Белый");
                break;
            case "Желтый":
                System.out.println("Значение переменной равно: Желтый");
                break;
            case "Красный":
                System.out.println("Вы добрый и мягкий!");
                break;
            default:
                System.out.println("Вы грубый!");
        }
        if (color != "Красный" && !color.isEmpty())
        {
            System.out.println("Условие верно");
        }



          // Operators
        int num = 10;
        if (num > 3 && num < 0){
            System.out.println("Число находится в диапозоне от 3 до 20");
        }
        int num1 = 10;
        if (num1 > 3 || num1 < 20){
            System.out.println("Выполнено");
        }



         */
        print("your word");
        System.out.println(sum(2,3));


    }
    // Metods
    public static  void print(){
        System.out.println("Вызван метод print");
    }


    public static  void print(String word){
        System.out.println("Our word "+ word);
    }


    public static int sum(int num1, int num2){
        return num1 + num2;

    }






}
