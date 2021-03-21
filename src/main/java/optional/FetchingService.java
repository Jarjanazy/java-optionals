package optional;

public class FetchingService {
    public static int getCapacityOfPenHolder(Room room){
        return room.
            getDeskOpt().
            flatMap(Desk::getPenHolderOpt).
            map(PenHolder::getCapacity).
            orElse(0);
    }
}
