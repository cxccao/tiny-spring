package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class OutputService {
    private HelloService helloService;

    public void output() {
        helloService.helloworld();
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
