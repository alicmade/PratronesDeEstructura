package org.example.file;


import org.example.composite.FileSystemItem;

public class File1 implements FileSystemItem {
    private String name;
    private int size;

    public File1(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

