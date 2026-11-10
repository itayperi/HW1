public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int denominator = 1;
        boolean positive = true;
        int numbersLength = Integer.parseInt(args[0]);

        for (int i = 0; i < numbersLength; i++) {
            if (positive)
                approxPi += 1.0 / denominator;

            else
                approxPi -= 1.0 / denominator;

            positive = !positive;
            denominator += 2;
        }

        approxPi *= 4;

        System.out.println(approxPi + " " + actualPi);
    }
}
