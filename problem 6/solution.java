import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read lower and upper indexes
        int l = sc.nextInt();
        int u = sc.nextInt();

        double avg = findavg(arr, l, u);

        if (avg != 0) {
            System.out.println(avg);
        } else {
            System.out.println("No numbers between limits");
        }
    }

    public static double findavg(int arr[], int l, int u) {
        int total = 0;
        int count = 0;

        // Loop between indexes (strictly between l and u)
        for (int i = l + 1; i < u; i++) {
            total += arr[i];
            count++;
        }

        if (count > 0) {
            return (double) total / count;
        } else {
            return 0; // No elements between indexes
        }
    }
}
