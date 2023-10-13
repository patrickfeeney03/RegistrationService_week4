package ie.atu.registrationservice_week4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class RegistrationController {
    private NotificationService notificationService;

    @Autowired
    public RegistrationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Map<String, String> handleRegistrationRequests(UserDetails userDetails) {
        return notificationService.notifyUser();
    }
}
