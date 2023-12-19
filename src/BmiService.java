public class BmiService {
    public int calculate(float height, int weight) {
        int index;
        index = (int) (weight / Math.pow(height, 2));
        return index;
    }
}
