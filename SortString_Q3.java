package assignment2;

import java.util.Scanner;

public class SortString_Q3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(sort(str));
	}

	public static String sort(String str) {

		char characters [] = str.toCharArray();
		mergeSort(characters,0,characters.length-1);
		String ans = "";

		for(char c:characters) {
			ans = ans + c;
		}
		return ans;
	}

	public static void mergeSort(char[] arr, int left, int right) {

		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}

	public static void merge(char[] arr, int left, int mid, int right ) {
		int n = mid-left+1;
		int m = right-mid;
		char x[] = new char[n];
		char y[] = new char[m];

		for(int i=0;i<n;++i)
			x[i] = arr[left +i];

		for(int i=0;i<m;++i)
			y[i] = arr[mid+1+i];

		int i = 0;
		int j = 0;
		int k = left;

		while(i<n && j<m) {
			if(x[i]<=y[j]) {
				arr[k] = x[i];
				i++;
				k++;
			}

			else 
				arr[k] = y[j];
				j++;
				k++;
			}

		while(i<n) {
			arr[k] = x[i];
			i++;
			k++;
		}

		while(j<m) {
			arr[k] = y[j];
			j++;
			k++;
		}
	}
}