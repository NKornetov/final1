import java.util.Arrays;
import java.util.Scanner;

public class final1 {

    public static void main(String[] args) {

        int n = 1; // Переменная которая пригодится дальше при создании массива для умножения
        int sum = 0; // переменная для десятичного числа
        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите двоичное число:");
        String text = in.nextLine();

        char[] chArray = text.toCharArray();

        for(int i = 0; i<chArray.length; i++) {        // Проверка, введено ли двоичное число
            if (chArray[i] != '1' & chArray[i] != '0') {
                System.out.println("Это не двоичное число");
                System.exit(0);
            }
        }
        int[] intarray = new int[chArray.length];
        for(int p = 0; p<chArray.length; p++) {        // переводим массив char в массив int
            intarray[p] = Character.getNumericValue(chArray[p]);
        }

            int[] newarray = new int [chArray.length]; // Создаем массив длинной в веденное число и записываем в него значения для последующего умножения
            newarray[0]=1;

            for (int o = 1; o<chArray.length;o++)
            {
                n*= 2;
                newarray[o] = n;
            }

        int [] finalarray = new int[chArray.length]; // создаем еще один массив в который складываем перемноженные числа

            for (int z = 1; z<chArray.length+1; z++) {
               a = newarray[newarray.length-z];
               b = intarray[z-1];

                finalarray[z-1]=a*b;
            }

            for (int l = 0; l<finalarray.length; l++) { // складываем числа массива и получаем десятичное число

                sum += finalarray[l];
            }
        System.out.println("Десятичное число: " + sum);
     }


    }
