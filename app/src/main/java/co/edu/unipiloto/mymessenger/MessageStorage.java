package co.edu.unipiloto.mymessenger;

import java.util.ArrayList;
import java.util.List;

public class MessageStorage {

    private static final MessageStorage instance = new MessageStorage();
    private List<Message> messages = new ArrayList<>();

    private MessageStorage() {}

    public static MessageStorage getInstance() {

        return instance;
    }

    public List<Message> getMessages() {

        return messages;
    }

    public void addMessage(Message message) {

        messages.add(message);
    }
}
