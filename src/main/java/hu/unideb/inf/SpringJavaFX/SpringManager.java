package hu.unideb.inf.SpringJavaFX;

import hu.unideb.inf.SpringJavaFX.frontend.Manager;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class SpringManager implements Manager {
    private ConfigurableApplicationContext ctx;

    @Override
    public void startBackend() {
         ctx = SpringApplication.run(SpringJavaFxApplication.class);
    }

    @Override
    public void stopBackend() {
        ctx.stop();
    }
}
