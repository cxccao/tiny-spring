package cxc.tinyioc;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public class HelloService {
    private String text;
    public void helloworld() {
        System.out.println(text);
    }

    public void setText(String text) {
        this.text = text;
    }
}
