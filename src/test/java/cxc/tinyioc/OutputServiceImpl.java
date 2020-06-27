package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public class OutputServiceImpl implements OutputService {
    private HelloService helloService;

    @Override
    public void output(String text) {
        helloService.helloworld(text);
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    public HelloService getHelloService() {
        return helloService;
    }
}
