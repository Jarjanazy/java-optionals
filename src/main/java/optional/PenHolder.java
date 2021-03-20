package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
public class PenHolder {
    private final Pen pen;

    public Optional<Pen> getPenOpt(){
        return Optional.ofNullable(pen);
    }
}
