import transport.Car;

import java.time.LocalDate;

public class Main {

    public static void separator() {
        System.out.println("=======================" + "\n");
    }

    public static void printTheIssueNumber(String task, String issue) {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Задание № " + task);
        System.out.println("Задача № " + issue);
        System.out.println("+++++++++++++++++++++++");
    }


    public static void main(String[] args) {

        printTheIssueNumber("1", "1");

        Human maksim = new Human("", -1900, null, "бренд-менеджера.");
        maksim.setYearOfBirth(-11);
        System.out.println(maksim);

        Human anya = new Human("Аня", 1993, "Москва", "методиста образовательных программ.");
        System.out.println(anya);

        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджера.");
        System.out.println(katya);

        Human artem = new Human("Артем", 1995, "Москва", "директора по развитию бизнеса.");
        System.out.println(artem);

        Human vladimir = new Human("Владимир", 2001, "Казань", "нигде не работает.");
        System.out.println(vladimir);


        separator();
        printTheIssueNumber("1", "2");

        Flower rose = new Flower("Роза обыкновенная", "Голландия", 35.59, 0);
        System.out.println(rose);

        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        System.out.println(chrysanthemum);

        Flower peony = new Flower("Пион", "Англия", 69.9, 1);
        System.out.println(peony);

        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
        System.out.println(gypsophila);


        separator();
        printTheIssueNumber("1", "2 дополнительно");

        Bouquet bouquet = new Bouquet(new Flower[]{
                rose, rose, rose,
                chrysanthemum, chrysanthemum, chrysanthemum,
                chrysanthemum, chrysanthemum,
                gypsophila});

        bouquet.printInfo();


        separator();
        printTheIssueNumber("2", "1, 2");
        printTheIssueNumber("3","1, 2");

        Car ladaGranta = new Car("Lada", "Lada Granta", -1.7, "желтый", -2015, "Россия",
                "автоматическая", "седан", "а111аг222", 4, true);

        ladaGranta.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        System.out.println(ladaGranta);
        System.out.println("Регистрационный номер: " + ladaGranta.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера

        Car.insurance ladaGrantaInsurance = ladaGranta.new insurance(2022, "995589949");
//  Объект страховка (ladaGrantaInsurance)
        System.out.println(ladaGrantaInsurance);

        Car audiA8 = new Car("Audi", "Audi A8 50 L TDI quattro", 3.0, "черный",
                2020, "Германия", "автоматическая", "седан",
                "а111ав222", 2, true);

        audiA8.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        System.out.println(audiA8);
        System.out.println("Регистрационный номер: " + audiA8.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера

        final Car.insurance audiA8Insurance = audiA8.new insurance(2021, "9999999");
//  Объект страховка (audiA8Insurance)
        System.out.println(audiA8Insurance);

        Car bmwZ8 = new Car("BMW", "BMW Z8", 3.0, "черный", 2021,
                "Германия", "автоматическая", "седан", "а111ав222",
                2, true);

        bmwZ8.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        System.out.println(bmwZ8);
        System.out.println("Регистрационный номер: " + bmwZ8.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера

        Car.insurance bmwZ8Insurance = bmwZ8.new insurance(2023, "99989999");
//  Объект страховка (bmwZ8Insurance)
        System.out.println(bmwZ8Insurance);


        Car kiaSportage = new Car("Kia", "Kia Sportage 4-го поколения", 2.4, "красный",
                2018, "Южная Корея", "автоматическая", "седан",
                "а171рв242", 2, true);

        kiaSportage.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        System.out.println(kiaSportage);
        System.out.println("Регистрационный номер: " + kiaSportage.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера

        Car.insurance kiaSportageInsurance = kiaSportage.new insurance(2023, "999800999");
//  Объект страховка (kiaSportageInsurance)
        System.out.println(kiaSportageInsurance);


        Car hyundaiAvante = new Car("Hyundai", "Hyundai Avante", 1.6, "оранжевый",
                2016, "Южная Корея", "автоматическая", "седан",
                "а151аг522", 2, true);

        hyundaiAvante.setSeasonTires(true);
//        метод реализующий возможность смены сезонных шин

        System.out.println(hyundaiAvante);
        System.out.println("Регистрационный номер: " + hyundaiAvante.registrationNumberCheck());
//        метод реализующий вывод проверки корретности регистрационного номера

        Car.insurance hyundaiAvanteInsurance = hyundaiAvante.new insurance(2023, "99789979");
//  Объект страховка (hyundaiAvanteInsurance)
        System.out.println(hyundaiAvanteInsurance);

        separator();
    }
}