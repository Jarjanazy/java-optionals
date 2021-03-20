package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@AllArgsConstructor @RequiredArgsConstructor @Getter
public class PenHolder {
    private Pen pen;
    private final int capacity;

    public Optional<Pen> getPenOpt(){
        return Optional.ofNullable(pen);
    }
}
