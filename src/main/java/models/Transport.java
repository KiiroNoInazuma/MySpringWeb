package models;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public abstract class Transport {
    private String model;

    @Override
    public String toString() {
        return  model;

    }
}

