package com.company;

import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//---1 Якщо змінна a дорівнює нулю, то виведіть 'Вірно', інакше виведіть 'Невірно'. Перевірте роботу при a, що дорівнює 1, 0, -3
	int a = -3;
	if (a==-3){
        System.out.println("Good");
    }else{
        System.out.println("Bad");
        }

//---2 В змінної min лежить число від 0 до 59. Визначте в яку чверть години потрапляє це число (в першу, другу, третю або четверту).
int min = 55;
if (min>=0 && min <=15){
    System.out.println("Перша чверть");
}if (min>=16 && min<=30){
            System.out.println("Друга чверть");
        }if (min>=31 && min<=45){
            System.out.println("Третя чверть");
        }if (min>=46 && min<=59){
            System.out.println("Четверта чверть");
        }

//----3 Якщо змінна a дорівнює або менше 1, а змінна b більше або дорівнює 3,то виведіть суму цих змінних,
//інакше виведіть їх різницю (результат віднімання). Перевірте роботу при a і b, що дорівнює 1 і 3, 0 і 6, 3 і 5.
int q =3;
int b =5;
if (q<=1 && b>=3){
    int c= q+b;
    System.out.println(c);
}else {
    int c = q-b;
    System.out.println(c);
}

//---4 В змінної month лежить якесь число з інтервалу від 1 до 12. Визначте в яку пору року потрапляє цей місяць (зима, літо, весна, осінь).
int month = 1;
        if (month==12 || month<=2){
            System.out.println("Winter");
        }if (month>=3 && month<=5){
            System.out.println("Spring");
        }if (month>=6 && month<=8){
            System.out.println("Summer");
        }if (month>=9 && month<=11){
            System.out.println("Autumn");
        }

//---5 Решите задачу через switch-case Переменная num может принимать 4 значения: 1, 2, 3 или 4.
//Если она имеет значение '1', то в переменную result запишем 'зима', если имеет значение '2' – 'весна' и так далее
int num =4;
switch (num){
    case 1:
        String result = "Winter";
        System.out.println(result);
        break;
    case 2:
        String result1 = "Spring";
        System.out.println(result1);
        break;
    case 3:
        String result2 = "Summer";
        System.out.println(result2);
        break;
    case 4:
        String result3 = "Autumn";
        System.out.println(result3);
        break;
}

//---6 Все параматры получаем с клавиатуры!!!! Имитируем поведение пешехода на перекстке. Если светофор зеленый - вывести "иди".
//Если светофор желтый - вывести "подожди". Если светофор красный - вывести "стой". Если светофор в аварийном режиме вывести "делай что хочешь"!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вибери цифру від 1 до 4");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("Світлофор - зелений. Можеш йти");
                break;
            case 2:
                System.out.println("Світлофор - жовтий. Піжди");
                break;
            case 3:
                System.out.println("Світлофор - червоний. Почекай");
                break;
            case 4:
                System.out.println("Світлофор - не робочий. Роби що хочеш");
                break;
        }

//----7 Все параметры получаем с клавиатуры!!!! Создать переменную isRoadClear которая характеризирует наличие на дороге машин.
//Улучшаем предыдущее задание. Если светофор зеленый и машин нет - вывести "иди". Если светофор зеленый и машины есть  - вывести подожди пока нарушители проедут".
//Если светофор желтый и машины есть - вывести "жди". Если светофор желтый и машин нет - вывести "все рано жди".
//Если светофор красный и машин нет- вывести "стой все рано". Если светофор красный - и машины есть вывести "стой и жди".
//Если светофор в аварийном режиме вывести "делай что хочешь"!
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Світлофор - зелений ---1");
        System.out.println("Світлофор - жовтий ---2");
        System.out.println("Світлофор - червоний ---3");
        System.out.println("Світлофор - не робочий ---4");
        int r = scanner.nextInt();
        System.out.println("Машин нема ---0");
        System.out.println("Машини є ---1");
        int j = scanner.nextInt();
            switch (r){
                case 1:
                    switch (j){
                        case 0:
                            System.out.println("Йди спокійно");
                            break;
                        case 1:
                            System.out.println("Почекай поки порушники проїдуть");
                    }
                    break;
                case 2:
                    switch(j){
                        case 0:
                            System.out.println("Чекай");
                            break;
                        case 1:
                            System.out.println("Всеодно чекай");
                    }
                            break;
                case 3:
                    switch (j){
                        case 0:
                            System.out.println("Стій");
                            break;
                        case 1:
                            System.out.println("Стій і чекай");
                    }
                            break;
                case 4:
                    System.out.println("Роби що хочеш");
                    break;
             }

    }
   }
