public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int normalParameters = (int) service.calculate(65.00, 1.75);
        System.out.println(normalParameters);

    }

}