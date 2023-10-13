package ie.atu.registrationservice_week4;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;


@FeignClient(name = "notification-service-1", url = "http://localhost:8083")
public interface NotificationService {
    @PostMapping("/notify")
    Map<String, String> notifyUser(@RequestBody UserDetails userDetails);
}
