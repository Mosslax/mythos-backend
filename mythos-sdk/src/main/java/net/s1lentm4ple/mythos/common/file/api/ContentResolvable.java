package net.s1lentm4ple.mythos.common.file.api;

import java.io.InputStream;
import java.util.List;

public interface ContentResolvable {
    public default InputStream getContent() {
        // return ContentResolverRegistry.resolve(this);
        return null;
    }
}
