package messages;

import Abstract.StorageProvider;

import java.util.List;

public class Google extends StorageProvider {
    @Override
    public List<Message> getMessages() {
        return super.getMessages();
    }

    @Override
    public void setMessages(List<Message> messages) {
        super.setMessages(messages);
    }

    @Override
    public boolean save(Message message) {
        return super.save(message);
    }

    @Override
    public List<Message> retrieveAll() {
        return super.retrieveAll();
    }
}
