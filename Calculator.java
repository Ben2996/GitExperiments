public class Calculator {

    public static void main (String[] args){
        double num1 = 3.14;
        double num2 = 2.71;
        System.out.println(num1 + " + " + num2 + " = " + add(num1,num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1,num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1,num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1,num2));
        System.out.println(num1 + " / 0 = " + add(num1,0));

    }
    public static double add(double a, double b){
        return a+b;
    }
    public static double subtract(double a, double b){
        return a-b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }
    public static double divide(double a, double b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Arethmetic Exeption detected");
            return -1;
        }
    }
}