package nonOptional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor @Getter @RequiredArgsConstructor
public class PenHolder {
    private Pen pen;
    private final int capacity;
}
