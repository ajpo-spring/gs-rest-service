package shared;

public class ClientResponse extends TimedResponse<ServerResponse> {
    public ClientResponse(String startingThread) {
        super(startingThread);
    }
}
