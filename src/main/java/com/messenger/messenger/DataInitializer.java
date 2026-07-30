package com.messenger.messenger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final MessengerRepository messengerRepository;

    public DataInitializer(MessengerRepository messengerRepository) {
        this.messengerRepository = messengerRepository;
    }

    @Override
    public void run(String... args) {
        messengerRepository.saveAll(List.of(
            createMessage("Alice", "Hey, how are you?", LocalDateTime.now().minusHours(3)),
            createMessage("Bob", "I'm good, thanks! You?", LocalDateTime.now().minusHours(2)),
            createMessage("Alice", "Doing great! Want to catch up later?", LocalDateTime.now().minusHours(1)),
            createMessage("Bob", "Sure, sounds good!", LocalDateTime.now())
        ));
    }

    private Message createMessage(String sender, String content, LocalDateTime timeSent) {
        Message message = new Message();
        message.setSender(sender);
        message.setContent(content);
        message.setTimeSent(timeSent);
        return message;
    }
}
