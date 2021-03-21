package nonOptional;

public class FetchingService {
    public static int getCapacityOfPenHolder(Room room){
        if (room.getDesk() == null){
            return 0;
        }
        else if (room.getDesk().getPenHolder() == null){
            return 0;
        }
        else return room.getDesk().getPenHolder().getCapacity();
    }
}