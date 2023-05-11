package org.example.factories;


import org.example.composite.FileSystemItem;

public interface FileSystemFactory {
    FileSystemItem createFile(String name, int size);
    FileSystemItem createLink(String name, FileSystemItem target);
    FileSystemItem createDirectory(String name);
}
