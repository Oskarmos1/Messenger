package com.messenger.messenger;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessengerController {

    private final MessengerService messengerService;

    public MessengerController(MessengerService messengerService) {
        this.messengerService = messengerService;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messengerService.getAllMessages();
    }
}