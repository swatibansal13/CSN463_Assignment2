package assignment2;

import java.util.ArrayList;

public class Q4 {

    public static void main(String[] args) {
        smallestInt();
    }

    public static void smallestInt() {
        int num=1;
        int sum=1;
        while(num<Integer.MAX_VALUE){
            if(sum==num*num){
                System.out.println("Answer is: "+num);
            }
            num+=1;
            sum+=num;
        }
        System.out.println("Final loop, number: "+num);
    }

}