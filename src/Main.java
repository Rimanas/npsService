public class Main {
    public static void main(String[] args) {
        NpsService npsService = new NpsService();
        int[] votes = {10, 2, 3, 4, 6, 9, 10, 8, 6, 5, 7, 8, 4, 0, 2, 3, 1, 8, 7, 6, 5 ,4, 6, 8};
        double result = npsService.calculate(votes);
        System.out.println(result);
    }
}
