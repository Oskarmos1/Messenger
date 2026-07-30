package com.messenger.messenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessengerRepository extends JpaRepository<Message, Long> {
}
