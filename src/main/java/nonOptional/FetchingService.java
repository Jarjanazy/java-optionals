package nonOptional;

public class FetchingService {
    public static String getStringDescriptionOfRoom(Room room){
        return String.format("The room's number is %s\n%s",
                room.getNumber(),
                getStringDescriptionOfDesk(room.getDesk()));
    }

    private static String getStringDescriptionOfDesk(Desk desk) {
        if (desk == null) return "";
        else return String.format("The Desk's model is %s\n%s",
                desk.getModel(),
                getStringDescriptionOfPenHolder(desk.getPenHolder()));
    }

    private static String getStringDescriptionOfPenHolder(PenHolder penHolder) {
        if (penHolder == null) return "";
        else return String.format("The pen holder's capacity is %s", penHolder.getCapacity());
    }
}
