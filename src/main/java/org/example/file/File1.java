package org.example.file;

import org.example.composite.FileSystemItem;

public class File1 implements FileSystemItem {
    private String name;
    private int size;

    public File1(String name, int size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public String getName() {
        return name;
    }
@Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

