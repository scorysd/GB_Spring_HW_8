package gb.hw.hw8;

import gb.hw.hw8.math.Fibonacci;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class AspectRunner {
    private final Fibonacci fibonacci;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
       fibonacci.Fibo(50);
       fibonacci.Fibo2(50);
    }
}
