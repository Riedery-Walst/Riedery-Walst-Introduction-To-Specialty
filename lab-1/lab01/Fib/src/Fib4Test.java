import static org.junit.jupiter.api.Assertions.*;

class Fib4Test {

    @org.junit.jupiter.api.Test
    void fib4() {
        assertEquals(6765,Fib4.fib4(20));
        assertEquals(5,Fib4.fib4(5));
        assertEquals(2,Fib4.fib4(3));
    }


}