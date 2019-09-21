public class DistanceCalculator {
    static double calculateDistance(double fuelVolume, double fuelConsumption){
        double distance = (double) fuelVolume / fuelConsumption * 100;
        return distance;
    }
}
