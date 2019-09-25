public class DistanceCalculator {
    static int calculateDistance(int fuelVolume, int fuelConsumption){
        int distance = fuelVolume / fuelConsumption * 100;
        return distance;
    }
}
