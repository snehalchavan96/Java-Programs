package InterviewProg;

import java.util.Arrays;

public class Arrange0_1_2 {

    public static void main(String[] args) {
        int arr[] = {2, 0, 1, 2, 1, 0, 2, 2, 0, 0, 2, 1};

        int low = 0, mid = 0, high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:  // Swap arr[low] and arr[mid], increment both
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:  // Just move ahead
                    mid++;
                    break;

                case 2:  // Swap arr[mid] and arr[high], decrement high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        // Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
