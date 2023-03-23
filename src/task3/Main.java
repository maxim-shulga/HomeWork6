package task3;

public class Main {
    public static void main(String[] args) {
        Distance dist = new Distance(5);

        System.out.println("Distance in km is " + Distance.Converter.kmToMtr(dist.getDistance()));
        System.out.println("Distance in mtr is " + Distance.Converter.mtrToKm(dist.getDistance()));
    }
}

