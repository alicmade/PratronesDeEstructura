package org.example.file;


import org.example.composite.FileSystemItem;

public class Link implements FileSystemItem {
    private String name;
    private FileSystemItem target;

    public Link(String name, FileSystemItem target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return target.getSize();
    }

    public FileSystemItem getTarget() {
        return target;
    }
}
