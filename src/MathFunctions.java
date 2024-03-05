public class MathFunctions {
    static double Pi = 3.14159265359;
    static double e = 2.71828182846;

    static double doiraningYuzi(double radius) {
        return Pi * Math.pow(radius, 2);
    }

    static double eDarajasi(int n) {
        return Math.pow(e, n);
    }

    static double geron(int a, int b, int c) {
        float p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
