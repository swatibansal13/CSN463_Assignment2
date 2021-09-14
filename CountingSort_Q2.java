package assignment2;
import java.util.Scanner;

public class CountingSort_Q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);   

		//Size of array
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		sort(arr);

		for(int c: arr) {
			System.out.print(c + " ");
		}
	}

	public static void sort(int arr[])
    {
        int n = arr.length;
        int output[] = new int[n];
        int count[] = new int[256];

        for (int i = 0; i < 256; ++i)
            count[i] = 0;

        for (int i = 0; i < n; ++i)
            ++count[arr[i]];

        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i)
            arr[i] = output[i];

    }
}