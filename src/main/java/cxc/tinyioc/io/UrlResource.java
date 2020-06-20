package cxc.tinyioc.io;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws Exception {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
