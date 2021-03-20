package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Getter @AllArgsConstructor @RequiredArgsConstructor
public class Desk {
    private PenHolder penHolder;
    private final String model;

    public Optional<PenHolder> getPenHolderOpt(){
        return Optional.ofNullable(penHolder);
    }
}
