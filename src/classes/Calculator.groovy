package classes

class Calculator {

    static int add(int a, int b) {
        return a + b
    }

    static int sub(int a, int b) {
        return a - b
    }

    static int mul(int a, int b) {
        return a * b
    }

    static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dividor cannot be zero")
        }
        return a / b
    }

}
