public class Flower {

//    Задание № 1
//    Задача № 2

    private final String FLOWER_NAME;
    private final String COUNTRY;
    private final double COST;
    private int lifeSpan;

    public Flower(String FLOWER_NAME, String COUNTRY, double COST, int lifeSpan) {

        if (FLOWER_NAME == null || FLOWER_NAME.isEmpty()) {
            this.FLOWER_NAME = "Тип цветка не указан";
        } else {
            this.FLOWER_NAME = FLOWER_NAME;
        }


        if (COUNTRY == null || COUNTRY.isEmpty()) {
            this.COUNTRY = "Россия";
        } else {
            this.COUNTRY = COUNTRY;
        }

        if (COST >= 0) {
            this.COST = COST;
        } else {
            this.COST = 1;
        }

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    @Override
    public String toString() {
        return "Название цветка " + getFLOWER_NAME() + ", страна происхождения " + getCOUNTRY() + ", стоимость " + getCOST() +
                " рублей , срок стояния " + getLifeSpan() + " суток.";
    }
//  В консоль выводится информация по каждому цветку со всеми данными: названием, страной происхождения, стоимостью
//  и сроком стояния цветка.


    public String getFLOWER_NAME() {
        return FLOWER_NAME;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public double getCOST() {
        return COST;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}
