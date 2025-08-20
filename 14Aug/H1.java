public class H1 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 3, 4, 1, 2, 3, 0, 2, 6, 0, 7, 2, 9};

        // loop for each element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) continue;

            // check if element repeats later
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;  // remove ONLY the first occurrence
                    break;        // stop after removing the first one
                }
            }
        }

        // print result
        System.out.print("Result: ");
        for (int num : arr) {
            if (num != -1) {
                System.out.print(num + " ");
            }
        }
    }
}
