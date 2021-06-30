package rlog.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBatchApplication {

    // 웹 프로그램처럼 항상 돌리지는 않음
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBatchApplication.class, args);
        System.exit(SpringApplication.exit(context));
    }
}

