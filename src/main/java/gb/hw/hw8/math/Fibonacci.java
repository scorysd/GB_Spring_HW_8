package gb.hw.hw8.math;

import gb.hw.hw8.aspect.Timer;
import org.springframework.stereotype.Component;

@Component
@Timer
public class Fibonacci {

    public int Fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }

    public int Fibo2(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
