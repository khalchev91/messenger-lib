package storageproviders;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public abstract class StorageProvider {

    private List<Message> messages;

    public StorageProvider(){
        messages = new ArrayList<Message>();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public boolean save(Message message){
        return messages.add(message);
    }

    public List<Message> retrieveAll(){
        return messages;
    }
}
