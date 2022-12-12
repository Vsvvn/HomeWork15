package transport;

import java.time.LocalDate;
import java.util.Objects;

public class Car {


//    Задание № 3
//    Задача № 1

    public class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {

            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }


    //    Задание № 3
//    Задача № 2

    public class insurance {
        private int validityPeriod;
        private final double price;
        private String number;

        public insurance(int validityPeriod, String number) {


            if (validityPeriod != 0 && validityPeriod == LocalDate.now().getYear()) {
                this.validityPeriod = validityPeriod;
                System.out.println("страховка действует в " + validityPeriod);
            } else {
                System.out.println("Нужно срочно ехать оформлять новую страховку!");
            }

            this.price = 10000;

            if (number.length() == 9) {
                this.number = number;
                System.out.println("номер страховки " + number);
            } else {
                System.out.println("Номер страховки некорректный!");

            }
        }

        @Override
        public String toString() {
            return "Цена страховки составляет " + price + " рублей" + "\n";
        }

        public int getValidityPeriod() {
            return validityPeriod;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void setValidityPeriod(int validityPeriod) {
            this.validityPeriod = validityPeriod;
        }

        public void setNumber(String number) {
            this.number = number;
        }


    }


//    Задание № 2
//    Задача № 1, 2

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean seasonTires;


    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, String transmission, String bodyType, String registrationNumber,
               int numberSeats, boolean seasonTires) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "хх000х000";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberSeats > 0) {
            this.numberSeats = numberSeats;
        } else {
            this.numberSeats = 2;
        }

        this.seasonTires = seasonTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }


    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public boolean isSeasonTires() {
        return seasonTires;
    }


    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    public void setSeasonTires(boolean seasonTires) {
        this.seasonTires = seasonTires;
    }

    public void seasonTiresChange() {
        setSeasonTires(!seasonTires);
    }
//    Метод реализующий смену шин через boolean


////////////////////////////////////////////////////////////////////////////////////////
//   Метод реализующий смену шин через String                                         //
////////////////////////////////////////////////////////////////////////////////////////                                                                                    //
//    public String seasonTiresChange() {                                             //
//                                                                                    //
//        int[] month = {9, 10, 11, 12, 1, 2};                                        //
//        String seasonTires = null;                                                  //
//                                                                                    //
//        for (int element : month) {                                                 //
//            if (this.seasonTires <= 12 && this.seasonTires > 0) {                   //
//                if (this.seasonTires == element) {                                  //
//                    seasonTires = "зимняя.";                                        //
//                    break;                                                          //
//                } else {                                                            //
//                    seasonTires = "летняя.";                                        //
//                }                                                                   //
//            } else {                                                                //
//                throw new IllegalArgumentException("Такого месяца несуществет!");   //
//            }                                                                       //
//        }                                                                           //
//        return seasonTires;                                                         //
//    }                                                                               //
////////////////////////////////////////////////////////////////////////////////////////

    public boolean registrationNumberCheck() {

        char[] letters = {'а', 'в', 'е', 'к', 'м', 'н', 'о', 'р', 'с', 'т', 'у', 'х'};

        boolean result;
        boolean result1 = true;
        boolean result2 = true;
        boolean result3 = true;
        boolean result4 = true;
        boolean result5 = true;
        boolean result6 = true;
        boolean result7 = true;

        char one;
        one = Character.valueOf(registrationNumber.charAt(0));
        char two;
        two = Character.valueOf(registrationNumber.charAt(4));
        char three;
        three = Character.valueOf(registrationNumber.charAt(5));

        result1 = registrationNumber.length() == 9;

        result2 = false;
        for (char element : letters) {
            if (element == (one)) {
                one = element;
                result2 = true;
            }
        }
        result3 = one == (registrationNumber.charAt(0));
        result = result1 && result2 && result3;

        result = result && Character.isDigit(registrationNumber.charAt(1));
        result = result && Character.isDigit(registrationNumber.charAt(2));
        result = result && Character.isDigit(registrationNumber.charAt(3));

        result4 = false;
        for (char element : letters) {
            if (element == (two)) {
                two = element;
                result4 = true;
            }
        }
        result5 = two == (registrationNumber.charAt(4));
        result = result1 && result4 && result5;

        result6 = false;
        for (char element : letters) {
            if (element == (three)) {
                three = element;
                result6 = true;
            }
        }
        result7 = result && three == (registrationNumber.charAt(5));
        result = result1 && result6 && result7;

        result = result && Character.isDigit(registrationNumber.charAt(6));
        result = result && Character.isDigit(registrationNumber.charAt(7));
        result = result && Character.isDigit(registrationNumber.charAt(8));

        return result;
    }
//    Метод реализующий проверку номера регистрации


    @Override

    public String toString() {
        return "Автомобиль марки " + brand + ", модель " + model + ", " + productionYear + " года выпуска," +
                " страна сборки " + productionCountry + ", цвет " + color + ", объем двигателя — " + engineVolume
                + " л." + "\n" + "коробка передач " + transmission + "тип кузова " + bodyType +
                ", регистрационный номер " + registrationNumber + ", количество мест " + numberSeats +
                ", летняя резина " + seasonTires;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear &&
                numberSeats == car.numberSeats && seasonTires == car.seasonTires && Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) && Objects.equals(color, car.color) &&
                Objects.equals(productionCountry, car.productionCountry) &&
                Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) &&
                Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, transmission, bodyType,
                registrationNumber, numberSeats, seasonTires);
    }
}