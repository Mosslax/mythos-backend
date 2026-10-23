package net.s1lentm4ple.mythos.sdk.file;


import java.io.Serializable;
import java.util.*;

public class File implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Metadata declMeta;
    private Metadata obsvMeta;
    
    public File(String name) {
        this.name = name;
    }


}
