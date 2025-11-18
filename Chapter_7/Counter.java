public class Counter{
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int count = 0;
        int sum = responseTimes[0];

        for (int i = 1; i < responseTimes.length; i++) {
            int avg = sum / i;

            if (responseTimes[i] > avg) {
                count++;
            }

            sum += responseTimes[i];
        }

        System.out.println(count);
    }
}
