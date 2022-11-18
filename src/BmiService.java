public class BmiService {
    public float calculate(float m, float h) {
        float bmi = m * 10000 / (h * h);
        return bmi;
    }
}
