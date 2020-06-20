package cxc.tinyioc.io;

import java.net.URL;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class ResourceLoader {
    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
