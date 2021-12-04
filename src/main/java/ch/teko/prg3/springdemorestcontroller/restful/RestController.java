package ch.teko.prg3.springdemorestcontroller.restful;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * curl -XPOST "localhost:8080/set/name" -H "Content-type:application/json" -d '{"name":"Meier"}'
 * curl -XPOST "localhost:8080/set/vname" -H "Content-type:application/json" -d '{"vname":"Peter"}'
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private Data data;

    public RestController(Data data) {
        this.data = data;
    }

    @RequestMapping(value = "/get/name", method = RequestMethod.GET)
    public String getName() {
        return this.data.getName();
    }

    @RequestMapping(value = "/set/name", method = RequestMethod.POST)
    public void setName(@RequestBody Data data) {
        this.data.setName(data.getName());
    }
}
