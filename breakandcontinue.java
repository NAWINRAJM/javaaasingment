import java.util.Scanner;

public class breakandcontinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%5==0){
                break;
            }
            System.out.println(i);
        }

    }
}
class oddeven{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number:  ");
        int a= scanner.nextInt();
        switch (a%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("odd");
                break;
        }
    }
}
class Evenodd1{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }

}
class Prime1{
    public static void main(String[] args) {
        for(int i=1;i<=30;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
class looping{
    public static void main(String[] args) {
        int i=1;
        while (i<=10){
            if(i%2!=0){
                System.out.println(i);
                i++;
                continue;
            }
            i++;
        }
    }
}
//    Write a program to print numbers from 1 to 10
class A1{
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
    }

}
//    WAP to display even number between 10 and 30.
//    WAP to display the number of even numbers between 10 and 30.
class A2{
    public static void main(String[] args) {
        int count=0;
        for (int i=10;i<=30;i++){
            if (i%2==0){
                System.out.println(i);
                count=count+1;
            }
        }
        System.out.println("The count is: "+count);
    }
}
//    WAP to display multiplication table of a given no.
class A4{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= scanner.nextInt();
        for (int i=1;i<=10;i++){
            int b=i*a;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
//    Write a program to calculate the sum of first 10 natural number.
class A5{
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=10;i++){
            count=count+i;
        }
        System.out.println(count);
    }
}
//Write a program that prompts the user to input a positive integer. It should then  print the multiplication table of that number.
class A6{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= scanner.nextInt();
        for (int i=1;i<=10;i++){
            int b=i*a;
            System.out.println(a+"*"+i+"="+b);
        }
    }
}
//    Write a program to find the factorial value of any number entered through the keyboard.
class A7{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a= scanner.nextInt();
        int count=1;
        for (int i=2;i<=a;i++){
            count=count*i;
        }
        System.out.println(count);
    }
}
//    Two numbers are entered through the keyboard. Write a program to find the value  of one number raised to the power of another.
class A8{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int count=0;
        for(int i=1;i<=b;i++){
            count=a*a;
        }
        System.out.println(count);
    }
}
//    Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
class A9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        int count;
        int total=0;
        for(int i=a;i>0;i/=10){
            count=i%10;

            total=total*10+count;

        }
        System.out.println(total);
    }
}
//    Write a program that reads a set of integers, and then prints the sum of the even  and odd integers.
class A10{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting and ending number: ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int count =0,count1 =0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                count=count+i;
            }else {
                count1=count1+i;
            }
        }
        System.out.println("Even number sum: "+count);
        System.out.println("Odd number sum: "+count1);

    }
}
//Write a program that prompts the user to input a positive integer. It should then  output a message indicating whether the number is a
// prime number.
class Prime2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = scanner.nextInt();
        int b=0;
        int c=0;
            for(int j=2;j<a;j++){
                if(a%j==0){
                    b=1;
                    break;
                }
            }if(b==1){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }
        }
    }

//    Write a program to calculate HCF of Two given number
class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        System.out.println(c);

    }
}
//Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the
// userwhether he or she wishes to perform the operation again. If so, the loop should repeatotherwise it should terminate
class ask{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int i;
        do {
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
            System.out.println("Enter one to perform ope again: ");
             i= scanner.nextInt();
        }while (i==1);

    }
    }
//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
class enter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to stop");
        int p=0,n=0,z=0;
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        while (true){
            if (a<0){
                p=p+1;

            }if (a>0){
                n=n+1;
            }else {
                z=z+1;
            }
        }System.out.println(p);
        System.out.println(n);
        System.out.println(z);



    }
}