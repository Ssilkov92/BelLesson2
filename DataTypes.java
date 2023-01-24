package org.example;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

/*      Написать программу, выводящую информацию о вас (имя, фамилия, профессия).

        Объявить переменные всех вам известных типов и вывести их значения на экран.

        Запросить на ввод строку, ввести произвольное значение с клавиатуры
        и вывести на экран результат работы всех рассмотренных методов
        работы со строками.*/

        String name = "Dmitry", surname = "Chernousov", profession = "QA Automation Trainer";
        System.out.println(name + " " + surname +" "+profession);

        // boolean: хранит значение true или false
        boolean isActive = false;
        boolean isAlive = true;
        System.out.println(isActive);
        System.out.println(isAlive);

// byte: хранит целое число от -128 до 127 и занимает 1 байт
        byte a = 3;
        byte b = 8;
        System.out.println(a);
        System.out.println(b);

// short: хранит целое число от -32768 до 32767 и занимает 2 байта
        short c = 3;
        short d = 8;
        System.out.println(c);
        System.out.println(d);

//int: хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int e = 4;
        int g = 9;
        System.out.println(e);
        System.out.println(g);

//long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long e1 = 5;
        long j = 10;
        System.out.println(e);
        System.out.println(j);

//double: хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
        double x = 8.5;
        double y = 2.7;
        System.out.println(x);
        System.out.println(y);

//float: хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        float x1 = 8.5F;
        float y1 = 2.7F;
        System.out.println(x1);
        System.out.println(y1);

//char: хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        int num111 = 0x6F; // 16-теричная система, число 111
        int num8 = 010; // 8-ричная система, число 8
        int num13 = 0b1101; // 2-ичная система, число 13
        System.out.println(num111);
        System.out.println(num8);
        System.out.println(num13);

        int x2 = 123_456;
        int y2 = 234_567__789;
        System.out.println(x2);  // 123456
        System.out.println(y2);  // 234567789

        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String text = in.nextLine();

/*        %x: для вывода шестнадцатеричных чисел
            %f: для вывода чисел с плавающей точкой
            %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01
                %c: для вывода одиночного символа
            %s: для вывода строковых значений*/

        System.out.printf("Your text: %s \n", text);
        in.close();
        System.out.println("Hello world!");
        
        //нихрена себе задачка

        //вот так поворотик
    }

}
