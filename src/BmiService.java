public class BmiService {
    public double calculate(int weightKilo, double heightM) {
        double index = weightKilo / (heightM * heightM);
        return (int) index;
    }

}
