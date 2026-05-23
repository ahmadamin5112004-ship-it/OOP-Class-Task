
import java.util.Scanner;

public class PracticeProblem1Page27  {

    // Area of a triangle: 0.5 * base * height
    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Volume of a ball (sphere): 4/3 * pi * radius^3
    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Area of a circle: pi * radius^2
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Convert Celsius to Fahrenheit
    // C / 5 = (F - 32) / 9  =>  F = (C * 9 / 5) + 32
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Area of an equilateral triangle: (sqrt(3) / 4) * arm^2
    public static double equilateralTriangleArea(double arm) {
        return (Math.sqrt(3) / 4.0) * Math.pow(arm, 2);
    }

    // Area of a triangle using Heron's formula
    // s = (a + b + c) / 2
    public static double heronTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base and height for triangle area: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Triangle area = " + triangleArea(base, height));

        System.out.print("Enter radius for sphere volume: ");
        double radius1 = sc.nextDouble();
        System.out.println("Sphere volume = " + sphereVolume(radius1));

        System.out.print("Enter radius for circle area: ");
        double radius2 = sc.nextDouble();
        System.out.println("Circle area = " + circleArea(radius2));

        System.out.print("Enter Celsius temperature: ");
        double celsius = sc.nextDouble();
        System.out.println("Fahrenheit = " + celsiusToFahrenheit(celsius));

        System.out.print("Enter arm length for equilateral triangle area: ");
        double arm = sc.nextDouble();
        System.out.println("Equilateral triangle area = " + equilateralTriangleArea(arm));

        System.out.print("Enter sides a, b, c for Heron's formula: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println("Triangle area using Heron's formula = " + heronTriangleArea(a, b, c));

        sc.close();
    }
}

