import java.util.Scanner;

public class Freight2Tester {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the weight of your package: ");
        double weight = in.nextDouble();

        Freight2 package1 = new Freight2(weight);
        System.out.printf("The package weight: %7.2f %n", package1.getWeight());
        System.out.printf("The rate per pound: %7.2f %n", package1.calculatePrice());
        System.out.printf("The shipping charges: %5.2f", package1.totalPrice());

    }

}
