package Abstract;

import messages.Message;

import java.util.List;

public abstract class StorageProvider {

    public List<Message> messages;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public boolean save(Message message){
        return false;
    }

    public List<Message> retrieveAll(){
        return messages;
    }
}
