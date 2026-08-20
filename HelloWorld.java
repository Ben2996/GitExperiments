public class HelloWorld {
	public static void main (String[] agrs){
		System.out.println("Hello, World!");
	}
    public static void mummy(int n){
        for(int count = 0; count != n; count++){
            System.out.println("Are you my mummy?");
        }
    }
	public static boolean isWhole(double num){
        return (num%1 == 0);
    }
	public static double circleArea(double rad){
        return (Math.PI*Math.pow(rad, 2));
    }
	public static void chickenTaco(){
        for(int i = 1; i>20; i++){
            for(int j = 1; j>i;j++){
                System.out.print("Chicken ");
            }
            System.out.println("Taco");
        }
    }
}