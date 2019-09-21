import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите уровень оставшегося топлива");
        double fuelVolume = scanner.nextDouble();
        System.out.println("Укажите расход топлива");
        double fuelConsumption = scanner.nextDouble();
        System.out.println("Оставшееся расстояние = " + DistanceCalculator.calculateDistance(fuelVolume, fuelConsumption));



    }
}
