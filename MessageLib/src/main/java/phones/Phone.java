package phones;

import messages.Message;
import messages.MessageProtocol;
import storageproviders.StorageProvider;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private StorageProvider storage;

   public Phone(){

    }

    public Phone(StorageProvider storage){
        this.storage = storage;
    }

    public StorageProvider getStorage() {
        return storage;
    }

    public void setStorage(StorageProvider storage) {
        this.storage = storage;
    }

    public void viewAllMessages(){
        for (Message message: getStorage().retrieveAll()) {
            System.out.println(message.getData());
        }
    }
}
