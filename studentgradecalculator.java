import java.util.Scanner;

public class studentgradecalculator {
     public static void calc ()
     {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the maths marks out of 100");
        int a=scan.nextInt();
        System.out.println("enter the english marks out of 100");
        int b=scan.nextInt();
        System.out.println("enter the science marks out of 100");
        int c=scan.nextInt();
        System.out.println("enter the social marks out of 100");
        int d=scan.nextInt();
        System.out.println("enter the physics marks out of 100 ");
        int e=scan.nextInt();
        int sumofmarks=a+b+c+d+e;
        double averageofmarks=sumofmarks/5;
        double grade=averageofmarks/9.5;
        System.out.println("the total marks obtained by the student:"+sumofmarks);
        System.out.println("Average percentage :"+averageofmarks);
        System.out.println("Grade of a student: "+grade);


     }
     public static void main(String[] args) {
        calc();
     }
}
