import Abstract.Phone;
import Abstract.StorageProvider;

public class IPhone extends Phone {

    public IPhone(){
        super();
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
