package additional;

public class Main {
    public static void main(String[] args) {
        System.out.println("2 + 2 = " + Calculator.add(2,2));
        System.out.println("6 - 1 = " + Calculator.sub(6,1));
        System.out.println("6 * 3 = " + Calculator.mul(6,3));
        System.out.println("6 / 3 = " + Calculator.div(6,3));
        System.out.println("6 / 0 = " + Calculator.div(6,0));
    }
}
