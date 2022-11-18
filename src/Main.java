public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        float m1 = 45; // масса тела в кг.
        float h1 = 146; // вес в м.

        float resultAccurate = service.calculate(m1, h1);
        int resultTemp = (int) Math.round(resultAccurate*100);
        float result = (float)resultTemp/100;

        System.out.println("Индекс массы тела - " + result);



    }
}