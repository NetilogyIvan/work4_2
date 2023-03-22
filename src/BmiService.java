public class BmiService {

    public int calculate(int massKg, double heightMeter) {
        double myBmi = massKg / (heightMeter * heightMeter);

        return (int) myBmi;
    }
}
