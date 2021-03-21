package nonOptional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @AllArgsConstructor @RequiredArgsConstructor
public class Room {
    private Desk desk;
    private final int number;
}
