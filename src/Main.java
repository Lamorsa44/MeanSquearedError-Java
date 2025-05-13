import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int[] results;
        int[] predictions;

        System.out.println("Enter N: ");
        N = sc.nextInt();
        results = new int[N];
        predictions = new int[N];

        System.out.println("Enter table of results");
        IntStream.range(0, N).forEach(i -> {
            results[i] = sc.nextInt();
        });

        System.out.println("Enter table of predictions");
        IntStream.range(0, N).forEach(i -> {
            predictions[i] = sc.nextInt();
        });

        System.out.println("Result: " + getMeanSquaredError(results, predictions));
    }

    public static double getMeanSquaredError(int[] results, int[] predictions) {
        int  N = results.length;
        return IntStream.range(0, N).mapToDouble(x -> Math.pow(results[x] - predictions[x], 2)).sum() / N;
    }
}