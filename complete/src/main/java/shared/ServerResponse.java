package shared;

import server.User;

public class ServerResponse extends TimedResponse<User> {
    public ServerResponse(String startingThread) {
        super(startingThread);
    }
}
