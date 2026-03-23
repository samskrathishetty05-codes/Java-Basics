package sam.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ComputeMethods {
    ComputeMethods() {}
    public void findMissingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int totalNumbers = sc.nextInt();
        System.out.println("Enter the data:");
        ArrayList<Integer> inputList = new ArrayList<>();
        for(int i=0; i< totalNumbers; i++) {
            inputList.add(sc.nextInt());
        }

        int result = totalNumbers;

        for(int i=0; i<totalNumbers; i++) {
           result ^= i ^ inputList.get(i);
        }

        System.out.println("Missing number:" + result);
    }

    public void singleNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int totalNumbers = sc.nextInt();
        System.out.println("Enter the data:");
        ArrayList<Integer> inputList = new ArrayList<>();
        for(int i=0; i< totalNumbers; i++) {
            inputList.add(sc.nextInt());
        }

        int res = 0;
        for(int num: inputList) {
            res ^= num;
        }
        System.out.println("single number:" + res);
    }

    public void twoUniqueNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array:");
        int totalNumbers = sc.nextInt();
        System.out.println("Enter the data:");
        ArrayList<Integer> inputList = new ArrayList<>();
        for(int i=0; i< totalNumbers; i++) {
            inputList.add(sc.nextInt());
        }

        int res = 0;
        for(int num: inputList) {
            res ^= num;
        }
        int diff = res & (-res);

        int a=0, b=0;

        for(int num: inputList) {
            if((num&diff) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }

        int[] result = new int[] {a,b};

        System.out.println("two unique numbers:" + Arrays.toString(result));

    }


    void findDiffBetweenTwoStrings() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st string");
        String first = sc.next();

        System.out.println("Enter 2nd string");
        String second = sc.next();

        int result = 0;

        for(char c: first.toCharArray()) {
            result ^= c;
        }

        for(char c: second.toCharArray()) {
            result ^= c;
        }

        System.out.println("Difference between 2 string is " + (char)result );
    }

}
