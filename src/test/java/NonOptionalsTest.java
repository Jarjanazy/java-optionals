import nonOptional.Desk;
import nonOptional.PenHolder;
import nonOptional.Room;
import org.junit.jupiter.api.Test;
import static nonOptional.FetchingService.getCapacityOfPenHolder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonOptionalsTest {
    @Test
    void givenARoomWithNoDesk_PenHolderCapacityIs0(){
        Room room = new Room(5);
        int result = getCapacityOfPenHolder(room);
        assertEquals(0, result);
    }

    @Test
    void givenARoomWithNoPenHolder_PenHolderCapacityIs0(){
        Desk desk = new Desk("cool desk");
        Room room = new Room(desk,8);
        int result = getCapacityOfPenHolder(room);
        assertEquals(0, result);
    }

    @Test
    void givenARoomWithPenHolder_PenHolderCapacityIs30(){
        PenHolder penHolder = new PenHolder(30);
        Desk desk = new Desk(penHolder, "bad desk");
        Room room = new Room(desk,6);
        int result = getCapacityOfPenHolder(room);
        assertEquals(30, result);
    }

    @Test
    void givenARoomWithPenHolder_PenHolderCapacityIs50(){
        PenHolder penHolder = new PenHolder(50);
        Desk desk = new Desk(penHolder, "meh desk");
        Room room = new Room(desk,9);
        int result = getCapacityOfPenHolder(room);
        assertEquals(50, result);
    }

}
