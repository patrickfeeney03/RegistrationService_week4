package ie.atu.registrationservice_week4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegistrationServiceWeek4Application {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationServiceWeek4Application.class, args);
    }

}
