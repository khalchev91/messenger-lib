package Abstract;

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

    public void viewAllMessages(){}
}
