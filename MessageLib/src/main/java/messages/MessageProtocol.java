package messages;

import messages.Message;

public interface MessageProtocol {

    boolean send(Message message);

    boolean receive(Message message);
}
