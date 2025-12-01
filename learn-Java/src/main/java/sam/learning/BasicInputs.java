package sam.learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicInputs {
    public static void main(String[] args) throws Exception{
        bufferFunction();
    }

    public static void scannerFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Name is " + name);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        System.out.println("Salary is: " + salary);
    }

    public static void bufferFunction() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name: ");
        String name = br.readLine();
        System.out.println("Name is :" + name);

        System.out.println("Enter age:");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Age is :" + age);

        System.out.println("Enter your salary");
        double salary = Double.parseDouble(br.readLine());
        System.out.println("Salary is: " + salary);

    }

}

