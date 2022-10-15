public class Freight2 {

    private double weight;
    private double charge;

    public Freight2(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double calculatePrice() {

        if (weight > 10) {
            charge = 3.80;
        } else if (weight > 6 && weight <= 10) {
            charge = 3.70;
        } else if (weight <= 6 && weight > 2) {
            charge = 2.20;
        } else {
            charge = 1.10;
        }
        return charge;
    }

    public double totalPrice() {
        return weight * charge;
    }
}
