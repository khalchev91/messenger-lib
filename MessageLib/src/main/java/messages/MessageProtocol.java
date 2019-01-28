package Interfaces;

import Abstract.Message;

public interface MessageProtocol {

    boolean send(Message message);

    boolean receive(Message message);
}
