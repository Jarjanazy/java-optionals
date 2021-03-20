package nonOptional;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class Desk {
    private final PenHolder penHolder;
    private final String model;
}
