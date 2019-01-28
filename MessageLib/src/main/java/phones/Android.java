import Abstract.Phone;
import Abstract.StorageProvider;

public class Android extends Phone {

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
}
