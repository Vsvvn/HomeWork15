import java.util.Arrays;
import java.util.Locale;

public class Bouquet {

//    Задание № 1
//    Задача № 2 дополнительно

    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    private double calculatedCoast() {
        double sum = 0;
        for (Flower flowers : flowers) {
            sum = sum + flowers.getCOST();
        }
        return sum * 1.1;
    }


    private int calculatedLifeSpan() {
        int minLifeSpan = Integer.MAX_VALUE;

        for (Flower flowers : flowers) {
            if (minLifeSpan > flowers.getLifeSpan()) {
                minLifeSpan = flowers.getLifeSpan();
            }
        }
        return minLifeSpan;
    }
//    Метод реализующий вычисление срока стояния букета

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Состав букета").append("\n");
        double sum = calculatedCoast();
        int minLifeSpan = calculatedLifeSpan();
        for (Flower flower : flowers) {
            result.append(flower).append("\n");
        }
        result.append("количество дней стояния букета ").append(minLifeSpan).append(" дн.");
        result.append(" Стоимость букета ").append(String.format(Locale.US,"%.2f", sum)).append(" р.");
        return result.toString();
    }
}