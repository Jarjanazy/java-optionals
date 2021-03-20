package optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@AllArgsConstructor @RequiredArgsConstructor @Getter
public class Room {
    private Desk desk;
    private final int number;

    public Optional<Desk> getDeskOpt(){
        return Optional.ofNullable(desk);
    }
}
