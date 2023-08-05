package models;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
public class Driver {
    private String name;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    @Qualifier("transport1")
    @Autowired
    private Transport transport;

    public void getReadyTransport() {
        System.out.println(name + " поехал на " + transport.getModel());

    }

}
