package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/22.
 */
public class HelloServiceImpl implements HelloService {
    private String text;
    private OutputService outputService;

    @Override
    public void helloworld(String text) {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
