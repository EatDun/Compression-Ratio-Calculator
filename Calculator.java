import java.util.Scanner;
import java.lang.Math;

class HelloWorld {
    
    public static double psiaConvert (double psig) {
        return psig + 14.6959493895238;
    }
    
    public static double crCalculator (double d, double s) {
        return d / s;
    }
    
    public static void main(String[] args) {
        
        Scanner press1 = new Scanner(System.in);
        System.out.println("Please enter discharge pressure");
        double disPress = press1.nextDouble();
        
        Scanner press2 = new Scanner(System.in);
        System.out.println("\nPlease enter suction pressure");
        double sucPress = press2.nextDouble();
        
        double disPressAdj = psiaConvert(disPress);
        double sucPressAdj = psiaConvert(sucPress);
        
        double cr = crCalculator(disPressAdj, sucPressAdj);
        
        System.out.println("\nThe compression ratio is " + cr);
    }
}
