//Using (instance) Method reference create and apply add and subtract method
//and using (Static) Method reference create and apply multiplication method for the functional interface created.

@FunctionalInterface
interface FuncInterface {
    void print(int x, int y);
}
 class FunctionalInterfaceEx {

    private void add(int i, int i1) {
        System.out.println("Addition via non-static : " + (i + i1));
    }

    private static void multiply(int x, int y) {
        System.out.println("Multiplication via static : " + (x * y));
    }

    private void subtract(int i, int i1) {
        System.out.println("Subtraction via non-static : " + (i - i1));
    }

    public static void main(String args[]) {
        FuncInterface funcInterface = FunctionalInterfaceEx::multiply;
        funcInterface.print(10, 20);
        funcInterface = new FunctionalInterfaceEx()::add;
        funcInterface.print(10, 20);
        funcInterface = new FunctionalInterfaceEx()::subtract;
        funcInterface.print(100, 20);
    }
}

