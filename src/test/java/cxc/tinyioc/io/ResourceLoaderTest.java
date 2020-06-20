package cxc.tinyioc.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class ResourceLoaderTest {
    @Test
    public void test() throws Exception {
        ResourceLoader loader=new ResourceLoader();
        Resource resource = loader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assertions.assertNotNull(inputStream);
    }
}
