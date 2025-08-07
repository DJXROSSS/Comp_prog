
public class calculator {

    public int plus(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        int result = calc.plus(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
