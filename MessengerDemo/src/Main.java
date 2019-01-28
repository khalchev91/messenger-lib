import messages.Message;
import messages.PhotoMessage;
import messages.TextMessage;
import phones.IPhone;
import phones.Phone;
import storageproviders.ICloud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Message> messages = new ArrayList<>();

        System.out.println("Send a message\n 1. Text Message \n 2. Photo Message");

        Scanner inputReader = new Scanner(System.in);
        IPhone iPhone = new IPhone(new ICloud());
        int messageType = inputReader.nextInt();
        inputReader.nextLine();//Java why are you the way you are :/
        if(messageType == 1){
            System.out.println("Enter text message to be sent:");
            String messageToSend = inputReader.nextLine();
            messages.add(new TextMessage(messageToSend));
        }else if(messageType == 2){
            System.out.println("Enter photo message to be sent:");
            String messageToSend = inputReader.nextLine();
            messages.add(new PhotoMessage(messageToSend));
        }else {
            System.out.println("Enter text message to be sent:");
            String messageToSend = inputReader.nextLine();
            messages.add(new TextMessage(messageToSend));
        }

        for (Message message: messages) {
            iPhone.send(message);
        }

        messages.clear();
        iPhone.viewAllMessages();
    }
}

