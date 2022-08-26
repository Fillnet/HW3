public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int hz = 10;
        byte a = 1;
        short b = 1;
        int c = 1;
        long d = 1;
        float e = 1f;
        double f = 1;
        System.out.println("Значение переменной  a с типом  byte равно " + a );
        System.out.println("Значение переменной  b с типом  short равно " + b );
        System.out.println("Значение переменной  c с типом  int равно " + c );
        System.out.println("Значение переменной  d с типом  long равно " + d );
        System.out.println("Значение переменной  e с типом  float равно " + e );
        System.out.println("Значение переменной  f с типом  double равно " + f );
        System.out.println("Значение переменной  hz с типом  double равно " + hz );
        System.out.println("Задача 2");
        float aa = 27.12f;
        long bb = 987_678_965_549L;
        float cc = 2.786f;
        boolean hzHz = hz > 1000; //boolean тут должен быть но я про него ничерта не знаю
        short ee = 569;
        short ff = -159;
        short gg = 27897;
        byte hh = 67;
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(ee);
        System.out.println(ff);
        System.out.println(gg);
        System.out.println(hh);
        System.out.println(hzHz);
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        int allPeople = teacher2 + teacher2 + teacher3;
        int papper = 480;
        int paperOne = papper / allPeople;
        System.out.println("На каждого ученика расчитано " + paperOne + " листов бумаги");
        System.out.println("Задача 4");
        short all = 16;
        byte time = 2;
        int allTime = all / time;
        int aaa = 20;
        int bbb = 24 * 60;
        int ccc = bbb * 3;
        int ddd = bbb * 30;
        int aaaa = aaa * allTime;
        int bbbb = bbb * allTime;
        int cccc = ccc * allTime;
        int dddd = ddd * allTime;
        System.out.println("За 20 минут работы машины произвела бутылок " + aaaa + " штук ");
        System.out.println("За сутки работы машины произвела бутылок " + bbbb + " штук ");
        System.out.println("За 3 дня работы машины произвела бутылок " + cccc + " штук ");
        System.out.println("За 1 месяц работы машины произвела бутылок " + dddd + " штук ");
        System.out.println("Задача 5 ");
        int colorAll = 120;
        int colorWhite = 2;
        int colorBrown = 4;
        int color1Class = colorBrown + colorWhite;
        int allClases = colorAll / color1Class;
        int whiteClases = allClases * colorWhite;
        int brownClases = allClases * colorBrown;
        System.out.println("В школе, где " + allClases +"  классов, нужно " + whiteClases + "  банок белой краски и "+ brownClases + " банок коричневой краски ");
        System.out.println("Задача 6 ");
        short bananas = 80;
        short milk = 105;
        short iceCream = 100;
        short eggs = 70;
        int breakFast = 5 * bananas + 2 * milk + 2 * iceCream + 4 * eggs;
        System.out.println("Вес завтрака в граммах " + breakFast);
        float breakFastKilograms = breakFast / 1000f;
        System.out.println("Вес завтрака в килограммах " + breakFastKilograms);
        System.out.println("Задача 7 ");
        byte excessWeightKilograms = 7;
        int excessWeightGram = excessWeightKilograms * 1000;
        int badLostWeight = 250;
        int goodLostWeight = 500;
        int goodDayLostWeight = excessWeightGram / goodLostWeight;
        int badDayLostWeight = excessWeightGram / badLostWeight;
        int averageLostDayWeight = (goodDayLostWeight + badDayLostWeight) / 2;
        System.out.println("Нужно похудеть на " + excessWeightKilograms + " кг");
        System.out.println("Нужно похудеть на " + excessWeightGram + " г");
        System.out.println("Количество дней при похудении на 500г: " + goodDayLostWeight + " дней");
        System.out.println("Количество дней при похудении на 250г: " + badDayLostWeight + " дней");
        System.out.println("Среднее количество дней для похудения: " + averageLostDayWeight + " день");
        System.out.println("Задача 8 ");
        int salaryOldMasha = 67760;
        int salaryOldDenis = 83690;
        int salaryOldKristina = 76230;
        int salaryNewMasha = (int) (salaryOldMasha * 0.1 + salaryOldMasha);
        int salaryNewDenis = (int) (salaryOldDenis * 0.1 + salaryOldDenis);
        int salaryNewKristina = (int) (salaryOldKristina * 0.1 + salaryOldKristina);
        int year = 12;
        int salaryOldMashaYear = salaryOldMasha * year;
        int salaryOldDenisYear = salaryOldDenis * year;
        int salaryOldKristinaYear = salaryOldKristina * year;

        int salaryNewMashaYear = salaryNewMasha * year;
        int salaryNewDenisYear = salaryNewDenis * year;
        int salaryNewKristinaYear = salaryNewKristina * year;

        int salaryDifferenceMasha = salaryNewMashaYear - salaryOldMashaYear;
        int salaryDifferenceDenis = salaryNewDenisYear - salaryOldDenisYear;
        int salaryDifferenceKristina = salaryNewKristinaYear - salaryOldKristinaYear;

        System.out.println("Зарплата Маши " + salaryOldMasha + " рублей");
        System.out.println("Зарплата Дениса " + salaryOldDenis + " рублей");
        System.out.println("Зарплата Кристины " + salaryOldKristina + " рублей");

        System.out.println("Новая Зарплата Маши " + salaryNewMasha + " рублей");
        System.out.println("Новая Зарплата Дениса " + salaryNewDenis + " рублей");
        System.out.println("Новая Зарплата Кристины " + salaryNewKristina + " рублей");

        System.out.println("Раньше Маша получала за год  " + salaryOldMashaYear + " рублей");
        System.out.println("Раньше Денис получал за год  " + salaryOldDenisYear + " рублей");
        System.out.println("Раньше Кристина получала за год  " + salaryOldKristinaYear + " рублей");

        System.out.println("Маша теперь получает " + salaryNewMashaYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryNewDenisYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryNewKristinaYear + " рублей" + " Годовой доход вырос на " + salaryDifferenceKristina + " рублей");


    }
}