package mk.ukim.finki.wp.lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Lab4Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab4Application.class, args);
    }
}
