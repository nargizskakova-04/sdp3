// The Adapter class
public class StandMessageAdapter implements StandMessenger {
    private Stand stand;
    private String message;

    public StandMessageAdapter(Stand stand) {
        this.stand = stand;
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        System.out.println(stand.getName() + " shouts: " + message);
    }

    @Override
    public String receiveMessage() {
        return message;
    }
}
