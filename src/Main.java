public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte mouse = 10;
        System.out.println("Значение переменной mouse с типом byte равно " + mouse);
        short cat = 32766;
        System.out.println("Значение переменной cat с типом short равно " + cat);
        int dog = 2777643;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        long cow = 777555666L;
        System.out.println("Значение переменной cow с типом long равно " + cow);
        float tiger = 6.99f;
        System.out.println("Значение переменной tiger с типом float равно " + tiger);
        double lion = 1.0000044;
        System.out.println("Значение переменной lion с типом double равно " + lion);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        int d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 430;
        int totalStudents = teacher1 + teacher2 + teacher3;
        int papersForOne = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + papersForOne + " листов бумаги.");
    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte power2min = 16;
        int power1min = power2min / 2;
        int minutes1Day = 24 * 60;
        int power20Minutes = 20 * power1min;
        System.out.println("За 20 минут машина произвела " + power20Minutes + " штук бутылок.");
        int power1Day = minutes1Day * power1min;
        System.out.println("За сутки машина произвела " + power1Day + " штук бутылок.");
        int power3day = minutes1Day * 3 * power1min;
        System.out.println("За 3 дня машина произвела " + power3day + " штук бутылок.");
        int power1Months = minutes1Day * 30 * power1min;
        System.out.println("За месяц машина произвела " + power1Months + " штук бутылок.");
    }

    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        short white = 2;
        short brown = 4;
        int paintOneClass = white + brown;
        int classInSchool = totalPaint / paintOneClass;
        int totalWhite = white * classInSchool;
        int totalBrown = brown * classInSchool;
        System.out.println("В школе, где " + classInSchool + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte weightOneBananas = 80;
        short milk = 200;
        byte weightMilk100Ml = 105;
        float weightMilkOneMl = weightMilk100Ml / 100f;
        byte icecream = 2;
        short weightOneIcecream = 100;
        byte eggs = 4;
        byte weightEggs = 70;
        double weightBreakfast = (bananas * weightOneBananas) + (milk * weightMilkOneMl) + (icecream * weightOneIcecream) + (eggs * weightEggs);
        System.out.println("Вес завтрака " + weightBreakfast + " грамм.");
    }

    public static void task7 () {
        System.out.println("Задача 7");
        byte removeWeight = 7;
        int remoweWeightInGramm = removeWeight * 1000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int dayWeightLoss1 = remoweWeightInGramm / weightLoss1;
        System.out.println("При снижении веса на " + weightLoss1 + " грамм в день - потребуется " + dayWeightLoss1 + " дней.");
        int dayWeightLoss2 = remoweWeightInGramm / weightLoss2;
        System.out.println("При снижении веса на " + weightLoss2 + " грамм в день - потребуется " + dayWeightLoss2 + " дней.");
        int middleDayWeightLoss = (dayWeightLoss1 + dayWeightLoss2) / 2;
        System.out.println("В среднем понадобится " + middleDayWeightLoss + " день.");
    }

}