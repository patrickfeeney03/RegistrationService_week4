package ie.atu.registrationservice_week4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@FeignClient(name = "notification-service-1", url = "http://localhost:8083")
public interface NotificationService {
    @GetMapping("/notify")
    Map<String, String> notifyUser();
}
