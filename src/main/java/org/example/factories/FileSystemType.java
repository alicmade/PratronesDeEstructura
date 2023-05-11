package org.example.factories;


import org.example.directory.Directory;
import org.example.file.File1;
import org.example.composite.FileSystemItem;

import org.example.file.Link;

public class FileSystemType implements FileSystemFactory {
    @Override
    public FileSystemItem createFile(String name, int size) {
        return new File1(name, size);
    }
    @Override
    public FileSystemItem createLink(String name, FileSystemItem target) {
        return new Link(name, target);
    }
    @Override
    public FileSystemItem createDirectory(String name) {
        return new Directory(name);
    }
}
