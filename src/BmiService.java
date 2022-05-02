public class BmiService {

    public double calculate (int bodyMass, double growth) {
        double degree = growth * growth;
        double bmi = bodyMass / degree;

        return (double) bmi;
    }
}
