package classes

import static classes.Calculator.*

class CalcDemo {
    static void main(String[] args) {
        println add(4, 3)
        println sub(4, 3)
        println mul(4, 3)
        println div(8, 2)

        try {
            println div(8, 0)
        } catch (ArithmeticException e) {
            assert e.getMessage() == "Dividor cannot be zero"
        }

    }
}
