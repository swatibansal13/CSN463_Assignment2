package assignment2;

import java.util.Scanner;
import jdk.internal.net.http.common.Log;

public class HailStoneSequence_Q6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            hailstoneSequence(n);
        }

        catch(Exception e){
            e.printStackTrace();
        }
        
    }

    public static void hailstoneSequence(int n) throws Exception{

        if(n<=0){
            throw new Exception("Please enter a positive number greater than 0.");
        }

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0)
                n = n / 2;

            else
                n = (n * 3) + 1;
        }
        System.out.println(1);
    }

}