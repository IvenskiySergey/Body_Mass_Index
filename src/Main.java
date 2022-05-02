public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 88;
        double growth = 1.85;
        int bmi = (int) service.calculate(bodyMass, growth);

        System.out.println(bmi);
    }
}
