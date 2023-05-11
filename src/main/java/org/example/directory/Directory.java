package org.example.directory;


import org.example.composite.FileSystemItem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addChild(FileSystemItem item) {
        children.add(item);
    }

    public void removeChild(FileSystemItem item) {
        children.remove(item);
    }

    public int getSize() {
        int totalSize = 0;
        for (FileSystemItem item : children) {
            totalSize += item.getSize();
        }
        return totalSize;
    }
}





