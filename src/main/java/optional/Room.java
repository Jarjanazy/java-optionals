package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Optional;

@AllArgsConstructor
public class Room {
    private final Desk desk;

    public Optional<Desk> getDeskOpt(){
        return Optional.ofNullable(desk);
    }
}
