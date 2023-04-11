import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weightKilo = 55;
        double heightM = 1.63;
        double BMI = service.calculate(weightKilo, heightM);
        System.out.println(BMI);


    }
}

