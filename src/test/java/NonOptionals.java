import nonOptional.Desk;
import nonOptional.FetchingService;
import nonOptional.PenHolder;
import nonOptional.Room;
import org.junit.jupiter.api.Test;

import static nonOptional.FetchingService.getStringDescriptionOfRoom;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonOptionals {
    @Test
    void givenARoomWithNoDesk_GetItsStringRepresentation(){
        Room room = new Room(5);
        String result = getStringDescriptionOfRoom(room);
        assertEquals("The room's number is 5\n", result);
    }

    @Test
    void givenARoomWithDeskAndNoPenHolder_GetItsStringRepresentation(){
        Desk desk = new Desk("cool Desk");
        Room room = new Room(desk,3);
        String result = getStringDescriptionOfRoom(room);
        assertEquals("The room's number is 3\nThe Desk's model is cool Desk\n", result);
    }

    @Test
    void givenARoomWithDeskAndPenHolder_GetItsStringRepresentation(){
        PenHolder penHolder = new PenHolder(20);
        Desk desk = new Desk(penHolder, "bad Desk");
        Room room = new Room(desk,8);
        String result = getStringDescriptionOfRoom(room);
        assertEquals("The room's number is 8\nThe Desk's model is bad Desk\nThe pen holder's capacity is 20", result);
    }

}
