package net.s1lentm4ple.mythos.common.file.entity;

import java.io.Serializable;
import java.util.*;
import lombok.Getter;


@Getter
public class File implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;
    private final String mimeType;
    private final Map<String, Object> metadata = new HashMap<>();

    private File(String name, String mimeType) {
        this.name = name;
        this.mimeType = mimeType;
    }

    public static File of(String name, String mimeType) {
        return new File(name, mimeType);
    }

    public File addMetadata(String key, Object value) {
        this.metadata.put(key, value);
        return this;
    }

    public File removeMetadata(String key) {
        this.metadata.remove(key);
        return this;
    }

    public File removeMetadata(String key, Object value) {
        this.metadata.remove(key, value);
        return this;
    }

    public Object queryMetadata(String key) {
        return this.metadata.get(key);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("File[ ")
            .append("name=\"").append(name).append("\"").append(" , ")
            .append("mimeType=\"").append(mimeType).append("\"")
            .append(" ]");
        return sb.toString();
    }
}
