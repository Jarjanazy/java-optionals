package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@Getter @AllArgsConstructor
public class Desk {
    private final PenHolder penHolder;
    private final String model;

    public Optional<PenHolder> getPenHolderOpt(){
        return Optional.ofNullable(penHolder);
    }
}
