package ch.teko.prg3.springdemorestcontroller.restful;

import org.springframework.stereotype.Component;

@Component
public class Data {
    private String name;
    private String vorname;

    public Data() {
        this.name = "Hans Muster";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
