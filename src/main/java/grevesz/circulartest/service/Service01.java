package grevesz.circulartest.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service01
{
    // @Autowired
    private final Service02 service02;

    public Service01(final Service02 service02)
    {
        this.service02 = service02;
    }

    private String callGetHello(final String name)
    {
        return service02.getHello(name);
    }

    public String getHello(final String name)
    {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") final String name)
    {
        return callGetHello(name);
    }
}
