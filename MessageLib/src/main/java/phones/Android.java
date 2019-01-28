package phones;

import messages.Message;
import messages.MessageProtocol;
import storageproviders.StorageProvider;

public class Android extends Phone implements MessageProtocol {

    public Android() {
        super();
    }

    public Android(StorageProvider storage) {
        super(storage);
    }

    @Override
    public StorageProvider getStorage() {
        return super.getStorage();
    }

    @Override
    public void setStorage(StorageProvider storage) {
        super.setStorage(storage);
    }

    @Override
    public void viewAllMessages() {
        super.viewAllMessages();
    }


    public boolean send(Message message) {

        return getStorage().save(message);
    }

    public boolean receive(Message message) {

        return getStorage().retrieveAll().add(message);
    }
}
