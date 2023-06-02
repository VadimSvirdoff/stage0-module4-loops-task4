package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skippedSum = calculateSkippedSum(numberToSkip);
            int countedSum = calculateCountedSum(numberToSkip, lastInRow);
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }

    private int calculateSkippedSum(int numberToSkip) {
        int sum = 0;
        for (int i = 1; i <= numberToSkip; i++) {
            sum += i;
        }
        return sum;
    }

    private int calculateCountedSum(int numberToSkip, int lastInRow) {
        int sum = 0;
        for (int i = numberToSkip + 1; i <= lastInRow; i++) {
            sum += i;
        }
        return sum;
    }
}
