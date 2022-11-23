public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double a = 67;
        double b = 1.73;
        int cost = service.calculate(a, b);
        System.out.println(cost);
    }
}
