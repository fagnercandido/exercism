class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for(int count = 1; count <= input; count++) {
            sum = sum + count;
        }
        return (int) Math.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for(int count = 1; count <= input; count++) {
            sum = sum + (int) Math.pow(count, 2);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
