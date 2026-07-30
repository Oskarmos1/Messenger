package com.messenger.messenger;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MessengerService {

    private final MessengerRepository messengerRepository;

    public MessengerService(MessengerRepository messengerRepository) {
        this.messengerRepository = messengerRepository;
    }

    public List<Message> getAllMessages() {
        return messengerRepository.findAll();
    }
}
