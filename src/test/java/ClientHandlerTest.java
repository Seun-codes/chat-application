import model.ClientHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import java.net.Socket;

//@ExtendWith(MockitoExtension.class)
class ClientHandlerTest {
    
    private ClientHandler underTest;
    private  Socket socket;

    @BeforeEach
    void setUp() {
        underTest = new ClientHandler(socket);

    }

    @Test
    void broadcastMessage() {
    }

    @Test
    @Disabled
    void removedClientHandler() {
    }

    @Test
    @Disabled
    void closeEverything() {
    }
}