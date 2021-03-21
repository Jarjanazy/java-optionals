package nonOptional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor @Getter @RequiredArgsConstructor
public class PenHolder {
    private final int capacity;
}
