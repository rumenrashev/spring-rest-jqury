package spring.rest.qjuery.demo.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import spring.rest.qjuery.demo.data.Person;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/rest")
    public List<Person> get(){
        List<Person> list = List.of(
                new Person("Rumen","Rashev") ,
                new Person("Teodora","Yordanova"));
        return list;
    }

}
