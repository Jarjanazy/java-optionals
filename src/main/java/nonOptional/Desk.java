package nonOptional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor @AllArgsConstructor
public class Desk {
    private PenHolder penHolder;
    private final String model;
}
