// Interface for Stand communication
public interface StandMessenger {
    void sendMessage(String message);

    String receiveMessage();
}
