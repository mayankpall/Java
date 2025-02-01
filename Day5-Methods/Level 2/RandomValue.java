

public class RandomValue {

    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        //Math.random() generates 0.0 to 1.0
        //Multiply it by 9000 we get 0.0 and 8999.9999.
        //This ensures the number is at least 1000 (4-digit)
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; 
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.printf("\nAverage: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}
