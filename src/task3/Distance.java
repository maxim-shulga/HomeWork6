package task3;

public class Distance {
    private double distance;
    public Distance(double distance){
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public static class Converter {
        public static double kmToMtr(double distance){
            return distance * 1000;
        }
        public static double mtrToKm(double distance){
            return distance / 1000;
        }
    }
    public void print(){
        System.out.println(distance);
    }

}
