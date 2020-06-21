package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class OutputService {
    private HelloService helloService;

    public void output(String text) {
        helloService.helloworld(text);
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
