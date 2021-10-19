package grevesz.circulartest.service;

import org.springframework.stereotype.Service;

@Service
public class Service03
{
    private final Service01 service01;

    public Service03(final Service01 service01)
    {
        this.service01 = service01;
    }

    public String getHello(final String name)
    {
        return service01.getHello(name);
    }
}
