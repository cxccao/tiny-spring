package cxc.tinyioc.io;

import java.io.InputStream;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public interface Resource {
    InputStream getInputStream() throws Exception;
}
