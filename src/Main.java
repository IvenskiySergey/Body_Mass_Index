public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyMass = 110;
        double growth = 1.87;
        int bmi = (int) service.calculate(bodyMass,growth);

        System.out.println(bmi);
    }
}
