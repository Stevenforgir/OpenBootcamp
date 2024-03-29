package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Autowired
    private NotificationService notificationService;

    public void enviarSaludo() {
        notificationService.imprimirSaludo();
    }
}
