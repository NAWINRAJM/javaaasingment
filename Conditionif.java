
//if else

import java.util.Scanner;

//1. Write a JAVA program to find maximum between two numbers
class Maxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("The max num is : " + a);
        } else if (b > a) {
            System.out.println("The max number is: " + b);

        } else {
            System.out.println("Equal");
        }

    }
}
//2. Write a JAVA program to find maximum between three numbers.
class Maxi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c=scanner.nextInt();
        if (a > b && a>c) {
            System.out.println("The max num is : " + a);
        } else if (b>a&&b>c) {
            System.out.println("The max number is: " + b);

        }else if (c>a&&c>b){
            System.out.println("The max number is:  "+c);
        }
        else {
            System.out.println("some number are equal");
        }

    }
}
//3. Write a JAVA program to check whether a number is negative, positive or zero.
class Check1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if (a>0){
            System.out.println("positive");
        }
        else if(a<0){
            System.out.println("negative");


        }
        else{
            System.out.println("Zero");
        }

    }}
//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class Division{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if (a%5==0 && a%11==0){
            System.out.println("divisible by 5  and 11");
        }
        else {
            System.out.println("NOt divisible");
        }
    }}
//5. Write a JAVA program to check whether a number is even or odd
class Evenodd{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int a=scanner.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
//6. Write a JAVA program to check whether a year is leap year or not
class Leap{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int a = scanner.nextInt();
        if (((a % 4 == 0) && (a % 100!= 0)) || (a%400 == 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("NOt leap year");
        }

    }}
//7. Write a JAVA program to check whether a character is alphabet or not.
class Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter albhabet or number");
        char a = scanner.next().charAt(0);;
        if( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println("alphabet");
        }else {
                System.out.println("not albhabet");
            }
        }
    }
//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter albhabet: ");
        char a = scanner.next().charAt(0);
        if ((a=='a'|| a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }}
//9. Write a JAVA program to input any character and check whether it is alphabet, digit or special character.
class digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = scanner.next().charAt(0);
        if( (a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            System.out.println("alphabet");
        }
        else {
            System.out.println("Special character or digit");
        }

    }}
//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char a = scanner.next().charAt(0);
        if (a>='a'&& a<='z'){
            System.out.println("Lower case");
        }
        else if(a>='A'&& a<='Z'){
            System.out.println("uppercase case");
        }
        else {
            System.out.println("Only Alphabet");
        }
    }}
//11. Write a JAVA program to input week number and print weekday.
class Weekday{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter week number: ");
        int a=scanner.nextInt();
        if (a==1){
            System.out.println("Monday");
        }
        else if(a==2){
            System.out.println("Tuesday");

        }
        else if(a==3){
            System.out.println("wenesday");

        }
        else if(a==4){
            System.out.println("Thrusday");

        }
        else if(a==5){
            System.out.println("friday");

        }
        else if(a==6){
            System.out.println("Saturday");

        }        else if(a==7){
            System.out.println("Sunday");

        }
        else {
            System.out.println("Enter correct week number: ");
        }
    }
}
//12. Write a JAVA program to input month number and print number of days in that month.
class Month{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter week number: ");
        int a = scanner.nextInt();
        if (a==1 || a==3||a==5||a==7||a==8||a==10||a==12){
            System.out.println("31");
        }
        else if(a==2){
            System.out.println("28 or 29");
        }
        else {
            System.out.println("30");
        }
    }
    }


//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not
class TRiangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1+angle2+angle3==180) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}

class Valid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = input.nextInt();

        if (side1+side2>=side3&&side1-side2<=side3) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}

class CheckT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first angle: ");
        int angle1 = input.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = input.nextInt();
        System.out.println("Enter third angle: ");
        int angle3 = input.nextInt();

        if (angle1==angle2&&angle1==angle3) {
            System.out.println("Triangle is equilateral.");
        } else if (angle1==angle2||angle2==angle3||angle1==angle3){
            System.out.println("Triangle is isosceles.");
        } else {
            System.out.println("Triangle is scalene.");
        }
    }
}

class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter coefficient of x\u00b2: ");
        int a = input.nextInt();
        System.out.println("Enter coefficient of x: ");
        int b = input.nextInt();
        System.out.println("Enter constant: ");
        int c = input.nextInt();
        double d = (b * b) - (4 * a * c);

        if (d>0) {
            double e = Math.sqrt(d);
            double root1 = (d - b) / (2 * a);
            double root2 = -(b + d) / (2 * a);

            System.out.println("Solution 1: " + root1 + "\nSolution 2: " + root2);
        } else {
            System.out.println("Result includes complex number.");
        }
    }
}

class Profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = input.nextInt();
        System.out.print("Enter SP:");
        int sp = input.nextInt();

        if (sp>cp) {
            System.out.println("Profit");
        } else if (sp<cp) {
            System.out.println("Loss");
        } else {
            System.out.println("Neither profit nor loss");
        }
    }
}

class Subjectes {
    public static void main(String[] args) {
        String[] subjects = {"Physics", "Chemistry", "Biology", "Maths", "Computer"};
        Scanner input = new Scanner(System.in);
        double marks = 0;

        for (String i : subjects) {
            System.out.print("Enter marks in " + i + ": ");
            marks = marks + input.nextDouble();
        }

        double total = marks;
        double percentage = total / 5;
        String validity;
        validity = (percentage>100||percentage<0) ? "\nInvalid Marks!" : "";
        if (validity.equals("")) {
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage);
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");}
            else {
                System.out.println("Grade: F");
            }
        }else {
            System.out.println(validity);
        }
    }
}

class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;

        if (salary<10000) {
            hra = 0.2*salary;
            da = 0.8*salary;
        } else if (salary<=20000) {
            hra = 0.25*salary;
            da = 0.9*salary;
        } else {
            hra = 0.3*salary;
            da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}

class Electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        if (units<=50) {
            price=units*0.5;
        } else if (units<=150) {
            price=25+(units-50)*0.75;
        } else if (units<=250) {
            price=25+75+(units-150)*1.2;
        } else {
            price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}