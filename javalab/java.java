import javax.swing.*;
import java.util.Scanner;

//1. Write a program to check whether a person can cast a vote or not. Condition is you must
//        be above 18 years to vote.
public class java {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        String check=(age>18)?"you are eligible for voting":"you are not eligible for voting";
        System.out.println(check);
    }
}
//2. Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.
class xyz{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle");
        double p=scanner.nextDouble();
        System.out.println("Enter rate");
        double r=scanner.nextDouble();
        System.out.println("Enter time");
        double t=scanner.nextDouble();
        double total=(p*t*r)/100;
        System.out.println("The SI is: "+total);
        System.out.println("Enter base: ");
        double b=scanner.nextDouble();
        System.out.println("Enter height: ");
        double h=scanner.nextDouble();
        double area=(b*h)/2;
        System.out.println(area);
        System.out.println("Enter lenght of edge: ");
        double e=scanner.nextDouble();
        double cube=e*e*e;
        System.out.println("THE cube is:"+cube);
        System.out.println("Enter lenght: ");
        double len=scanner.nextDouble();
        System.out.println("Enter breath:");
        double bre=scanner.nextDouble();
        System.out.println("Enter height: ");
        double hei=scanner.nextDouble();
        double cuboid=len*bre*hei;
        System.out.println("The cuboid is: "+cuboid);


    }
}
//3. Write ternary operator for the question no. 1.
class ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        String check=(age>18)?"you are eligible for voting":"you are not eligible for voting";
        System.out.println(check);
    }
}
//4. Write a program to calculate the total marks of four subjects of a student and the total
//        percentage secured. And use following conditions to generate the final result;
//        a. If equal to or more than 70 -> First Class
//        b. If more than 59 -> Upper second Class
//        c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class Xyz{
    public static void main(String[] args) {
        System.out.println("marks and percentage");
        double s = 10;
        double m = 11;
        double b = 12;
        double a = 6;
        double totalmarks = s + m + b + a;
        double percentage = totalmarks / 4;
        String grade;
        grade = (percentage >= 70.0) ? "Frist calss" : (percentage > 59 && percentage < 70) ? "upper second  class" : (percentage > 49 && percentage < 59) ? "second class" : (percentage > 39) ? "thrid class" : "fail";
        System.out.println(grade);
    }}
//1. Write a program to take student details as input and display the result?
class Bio{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a=scanner.nextLine();
        System.out.println("Enter age: ");
        int b=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter loaction: ");
        String c=scanner.nextLine();
        System.out.print("Name:"+a );
        System.out.print(" Age:"+b );
        System.out.print(" Location:"+c);
    }
}
//2. Write a program to calculate sum of four numbers taking user input.
class sum{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= scanner.nextInt();
//        System.out.println(a);
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        System.out.println("Enter a third number: ");
        int c= scanner.nextInt();
//        System.out.println(a);
        System.out.println("Enter fourth number: ");
        int d=scanner.nextInt();
        System.out.println(a+b+c+d);
    }
}
//3. Write a program to take input of the total marks of four subjects of a student and calculate
//        the total percentage secured. Then display the percentage and final result of the student;
//        a. If equal to or more than 70 -> First Class
//        b. If more than 59 -> Upper second Class
//        c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.
class marks{
    public static void main(String[] args) {
        System.out.println("marks and percentage");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        double s = scanner.nextDouble();
        System.out.println("Enter marks of second subject");
        double m = scanner.nextDouble();
        System.out.println("Enter marks of thrid subject");
        double b = scanner.nextDouble();
        System.out.println("Enter marks of fourth subject");
        double a = scanner.nextDouble();
        double totalmarks = s + m + b + a;
        double percentage = totalmarks / 4;
        String grade;
        grade = (percentage >= 70.0) ? "Frist calss" : (percentage > 59 && percentage < 70) ? "upper second  class" : (percentage > 49 && percentage < 59) ? "second class" : (percentage > 39) ? "thrid class" : "fail";
        System.out.println(grade);
    }

}
//4. Write a program to take two integer inputs from user and print sum and product of them.
class product{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        int c=a+b;
        int d=a*b;
        System.out.println("the sum is: "+c);
        System.out.println("THe product is: "+d);
}
   }
// 5. Take two integer inputs from user. First calculate the sum of two and then product.
//         Finally, calculate the division of thus obtained sum and product and print the result.
class divide{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        int c=a+b;
        int d=a*b;
        double e=c/d;
        System.out.println(e);
}}

//6. Ask user to give two double input for length and breadth of a rectangle and print area type
//        casted to int
class casting {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length: ");
        double a=scanner.nextDouble();
        System.out.println("Enter breath: ");
        double b=scanner.nextDouble();
        double area= a*b;
        int casted=(int)(area);
        System.out.println(casted);
    }
}
//7. Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.
class format{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = scanner.nextLine();
        System.out.println("Enter roolno.: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter field of interest: ");
        String c = scanner.nextLine();
        System.out.println("my name is "+a+" and my roll number is "+b+". My field od interest are: "+c);

    } }

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class square{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter lenght: ");
        double lenght=scanner.nextDouble();
        System.out.println("Enter width: ");
        double width=scanner.nextDouble();
        double rectangle=lenght*width;
        System.out.println("The area of square: "+rectangle);
        double perimeter=(lenght+width)*2;
        System.out.println("THE perimeter of square; "+perimeter);
        System.out.println("Enter principle");
        double p=scanner.nextDouble();
        System.out.println("Enter rate");
        double r=scanner.nextDouble();
        System.out.println("Enter time");
        double t=scanner.nextDouble();
        double total=(p*t*r)/100;
        System.out.println("The SI is: "+total);
        System.out.println("Enter base: ");
        double b=scanner.nextDouble();
        System.out.println("Enter height: ");
        double h=scanner.nextDouble();
        double area=(b*h)/2;
        System.out.println(area);
        System.out.println("Enter lenght of edge: ");
        double e=scanner.nextDouble();
        double cube=e*e*e;
        System.out.println("THE cube is:"+cube);
        System.out.println("Enter lenght: ");
        double len=scanner.nextDouble();
        System.out.println("Enter breath:");
        double bre=scanner.nextDouble();
        System.out.println("Enter height: ");
        double hei=scanner.nextDouble();
        double cuboid=len*bre*hei;
        System.out.println("The cuboid is: "+cuboid);


    }
}

//9. Write a program to find square of a number.
//        E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25
class dou{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=scanner.nextInt();
        int b=a*a;
        System.out.println("The square is: "+b);
    }
}
//        10. Take two different string input and print them in same line. E.g.-
//        INPUT : Codes
//        Dope
//        OUTPUT : CodesDope
class two{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String a = scanner.nextLine();
        System.out.println("Enter second word: ");
        String b = scanner.nextLine();
        System.out.println(a+b);

    } }

//11. Take 3 inputs from user and check :all are equal any of two are equal( use && || with ternary operator )
class check{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        System.out.println("Enter thrid number: ");
        int c= scanner.nextInt();
        String check;
        check=(a==b && a==c )?"ALl number are equal":(b==c||a==c||b==a)?"Two number are equal":"None of the number are equal.";
        System.out.println(check);
    }
}
//12. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.
class value{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= scanner.nextInt();
        System.out.println("Enter second number: ");
        int b=scanner.nextInt();
        String d=(a<50&&a<b)?"true":"false";
        System.out.println("The condition are: "+d);
    }
}
//13. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
class sub{
    public static void main(String[] args) {
        System.out.println("marks and percentage");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        double s = scanner.nextDouble();
        System.out.println("Enter marks of second subject");
        double m = scanner.nextDouble();
        System.out.println("Enter marks of thrid subject");
        double b = scanner.nextDouble();
        double totalmarks = s + m + b ;
        double percentage = totalmarks/3;
        System.out.println("the total marks: "+totalmarks+" . the percentage is: "+percentage);

    }
}

//1. Write a program to take student details as input and display the result
class Gui{
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog(null,"Enter your name ");
        String roll=JOptionPane.showInputDialog(null,"ENter your roll");
        JOptionPane.showMessageDialog(null,"name: "+name+"\nroll: "+roll);
        System.exit(0);
    }
}
//2. Write a program to calculate sum of four numbers taking user input.
class markss{
    public static void main(String[] args) {
        double m=Double.parseDouble(JOptionPane.showInputDialog("Enter first number: "));
        double p=Double.parseDouble(JOptionPane.showInputDialog("Enter second number: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Enter third number: "));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Enter fourth number: "));
        double a=m+p+b+c;
        JOptionPane.showMessageDialog(null,"The sum is: "+a);
    }}
//3. Write a program to take input of the total marks of four subjects of a student and calculate
//        the total percentage secured. Then display the percentage and final result of the student;
//        If equal to or more than 70 -> First Class If more than 59 -> Upper second Class
//        If more than 49 -> Second class If more than 39 -> Third class and if below than 40 the result is fail.
class totaal{
    public static void main(String[] args) {
        double m=Double.parseDouble(JOptionPane.showInputDialog("Enter your math marks: "));
        double p=Double.parseDouble(JOptionPane.showInputDialog("Enter your physic marks: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Enter your social  marks: "));
        double c=Double.parseDouble(JOptionPane.showInputDialog("Enter your science  marks: "));
        double total=(p+m+b+c)/400;
        double percentage=total*100;
        String x;
        x=(percentage>69)?"Frist class":(percentage>59)?"upper second class":(percentage>49)?"Second class":(percentage>39)?"Thrid class":"Fail";
        JOptionPane.showMessageDialog(null,x);

    }
}
//4. Write a program to take two integer inputs from user and print sum and product of them
class inp{
    public static void main(String[] args) {
        int m=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int p=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int v=m+p;
        int a=m*p;
        JOptionPane.showMessageDialog(null,"The sum of nummber is: "+v);
        JOptionPane.showMessageDialog(null,"The product of number is : "+a);
    }
}
//14. Take two integer inputs from user. First calculate the sum of two then product of two.
//        Finally, calculate the division of thus obtained sum and product and print the result.
class use{
    public static void main(String[] args) {
        int m=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        int p=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int v=m+p;
        int a=m*p;
        double l=a/v;
        JOptionPane.showMessageDialog(null,"The division of product and sum: "+l);

    }
}
//5. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
class lenbre{
    public static void main(String[] args) {
        double m=Double.parseDouble(JOptionPane.showInputDialog("Enter length: "));
        double p=Double.parseDouble(JOptionPane.showInputDialog("Enter breadth: "));
        double area= m*p;
        int casted=(int)(area);
        JOptionPane.showMessageDialog(null,"The area is: "+casted);

    }
}
//6. Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.
class abcd{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("Enter name: ");
        String b=JOptionPane.showInputDialog("Enter roolno: ");
        String c=JOptionPane.showInputDialog("Enter field of interest: ");
        JOptionPane.showMessageDialog(null,"My name is "+a+" and my roolno is "+b+". My field of interest: "+c);
    }
}
//7. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
class abcde{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int p=Integer.parseInt(JOptionPane.showInputDialog("Enter lenght: "));
        int p1=Integer.parseInt(JOptionPane.showInputDialog("Enter width: "));
        double rectangle=p1*p;
        JOptionPane.showMessageDialog(null,"The area of square: "+rectangle);
        int perimeter=(p1+p)*2;
        JOptionPane.showMessageDialog(null,"THE perimeter of square; "+perimeter);
        int p2=Integer.parseInt(JOptionPane.showInputDialog("Enter principle: "));
        int p3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter rate"));
        int p4=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter time"));
        int total=(p2*p3*p4)/100;
        JOptionPane.showMessageDialog(null,"The SI is: "+total);
        int p5=Integer.parseInt(JOptionPane.showInputDialog("Enter Base: "));
        int p6=Integer.parseInt(JOptionPane.showInputDialog("Enter height: "));
        int area=(p5*p6)/2;
        JOptionPane.showMessageDialog(null , area);
        int p7=Integer.parseInt(JOptionPane.showInputDialog("Enter lenght of edge: "));
        int cube=p7*p7*p7;
        JOptionPane.showMessageDialog(null,"THE cube is:"+cube) ;
        int p8=Integer.parseInt(JOptionPane.showInputDialog("Enter lenght: "));
        int p9=Integer.parseInt(JOptionPane.showInputDialog("Enter breath:"));
        int a1=Integer.parseInt(JOptionPane.showInputDialog("Enter height: "));
        int cuboid=a1*p9*p8;
        JOptionPane.showMessageDialog(null, "The cuboid is: "+cuboid);


    }
}
//8. Write a program to find square of a number
class num{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter the number: "));
        int b=a*a;
        JOptionPane.showMessageDialog(null,b);
    }
}

//9. Take two different string input and print them in same line.
class ts{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("Enter first world: ");
        String b=JOptionPane.showInputDialog("Enter second word: ");
        JOptionPane.showMessageDialog(null,a+b);
    }
}
//10. Take 3 inputs from user and check :all are equal any of two are equal
class iin{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("ENter first number: "));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
        int c=Integer.parseInt(JOptionPane.showInputDialog("Enter thrid number: "));
        String d=(a==b&&a==c)?"All number are same":(a==b||a==c||b==c)?"Two number are same":"None of the number ae equal";
        JOptionPane.showMessageDialog(null,d);
    }
}
//11. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.?
class val{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
    int b=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
    String d=(a<50&&a<b)?"True":"False";
    JOptionPane.showMessageDialog(null,"The statement is: "+d);
}}
//12. If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
class pro{
    public static void main(String[] args) {
        double m=Double.parseDouble(JOptionPane.showInputDialog("Enter your math marks: "));
        double p=Double.parseDouble(JOptionPane.showInputDialog("Enter your physic marks: "));
        double b=Double.parseDouble(JOptionPane.showInputDialog("Enter your social  marks: "));
        double total=(p+m+b)/300;
        double percentage=total*100;
        JOptionPane.showMessageDialog(null,"The percentage is:"+percentage);
    }
}