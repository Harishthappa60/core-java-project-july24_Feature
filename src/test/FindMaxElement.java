package test;

import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] numbers = {1, 84, 54, 84, 54, 84, 56, 32, 85, 39, 84, 64, 64, 34, 84, 999, 18, 54, 84, 54, 64, 84, 68, 64, 49, 43, 46};
        Arrays.sort(numbers);
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println(max);

        int j;
        for ( j = 0; j < (numbers.length -2); j++) {
            if (numbers[j] > max ) {
                max = numbers[j];

            }
        }
        System.out.println(numbers[j]);


        double[] marks = {35.25, 25.36, 14.36, 45.65, 25.85, 15.95, 75.35, 95.15, 35.75, 85.25};
        double maxi = marks[0];
        for ( j = 1; j < marks.length; j++) {
            if (marks[j] > maxi) {
                maxi = marks[j];
            }
        }
        System.out.println(maxi);
    }
}
