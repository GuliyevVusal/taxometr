import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");

        double distance = sc.nextDouble();
        double startTaxometer = 1; // Starting fare

        double totalPrice;

        if (distance < 6) {
            totalPrice = 5 + startTaxometer; // Short distance flat rate
        } else if (distance >= 6 && distance <= 9) {
            totalPrice = 0.80 * distance + startTaxometer;
        } else if (distance >= 10 && distance <= 15) {
            totalPrice = 0.70 * distance + startTaxometer;
        } else if (distance >= 15 && distance <= 25) {
            totalPrice = 0.60 * distance + startTaxometer;
        } else {
            totalPrice = 0.50 * distance + startTaxometer;
        }
        double roundedPrice = Math.round(totalPrice * 100.0) / 100.0;

        System.out.println("Your total fare is: " + roundedPrice + " AZN");
    }
}