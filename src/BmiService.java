public class BmiService {
    public int calculate (double a, double b) {
        int cost = (int) (a / (b * b));
        return (int) cost;
    }
}
