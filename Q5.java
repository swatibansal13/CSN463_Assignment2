
package assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5 {

    public static void main(String[] args) throws Exception {
    int universe[]={0,1,2,3,4,5,6,7,8,9,10};
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    HashSet<Integer> a = new HashSet<Integer>();
    int A[] = new int[n];
    int B[] = new int[m];;

    for(int i=0;i<n;i++)
    {
        int x = sc.nextInt();
        if(x<0 || x>11) {
            throw new Exception("Enter the digits in range 0-10");
        }
        A[i] = x;
        a.add(x);
    }

    HashSet<Integer> b = new HashSet<Integer>();
    for(int i=0;i<m;i++)
    {
        int x = sc.nextInt();
        if(x<0 || x>11) {
            throw new Exception("Enter the digits in range 0-10");
        }
        b.add(x);
        B[i] = x;
    }

    System.out.println("A: "+ a);
    System.out.println("B: "+ b);

    System.out.println("-------------------------------------------------");

    boolean freq[] = new boolean[11];
    Arrays.fill(freq, false);
    int uni[] = new int[n+m];

    long start1 = System.nanoTime();

    findunion(A,freq,n,B,m,uni);
    findintersection(A,freq,n,B,m);
    findcomplement(A,freq,n,B,m);

    long end1 = System.nanoTime();      
    System.out.println("Elapsed Time in nano seconds while using Arrays: "+ (end1-start1));

    System.out.println("-------------------------------------------------");


    // Using Set

    long start2 = System.nanoTime();

    findUnionUsingSet(a,b);
    findIntersectionUsingSet(a,b);
    findComplementUsingSet(a,b);

    long end2 = System.nanoTime();      
    System.out.println("Elapsed Time in nano seconds while using HashSet: "+ (end2-start2));  
}

    public static void findUnionUsingSet(HashSet<Integer> a, HashSet<Integer> b) {
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of A and B: ");
        System.out.println(union);
    }

    public static void findIntersectionUsingSet(HashSet<Integer> a, HashSet<Integer> b) {
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of A and B: ");
        System.out.println(intersection);
    }

    public static void findComplementUsingSet(HashSet<Integer> a, HashSet<Integer> b) {
        Set<Integer> complement = new HashSet<Integer>(a);
        complement.removeAll(b);
        System.out.print("Complement of A and B: ");
        System.out.println(complement);
    }
}