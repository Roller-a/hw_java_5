public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 1.87F;
        int weight = 98;
        int result = service.calculate(height, weight);
        System.out.println(result);
    }
}