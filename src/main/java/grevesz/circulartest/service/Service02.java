package grevesz.circulartest.service;

import org.springframework.stereotype.Service;

@Service
public class Service02
{
    private final Service03 service03;

    public Service02(final Service03 service03)
    {
        this.service03 = service03;
    }

    public String getHello(final String name)
    {
        return service03.getHello(name);
    }
}
