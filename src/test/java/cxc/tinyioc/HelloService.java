package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public class HelloService {
    private String text;
    private OutputService outputService;

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
