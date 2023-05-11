package org.example.app;


import org.example.composite.FileSystemItem;
import org.example.directory.Directory;
import org.example.factories.FileSystemFactory;
import org.example.factories.FileSystemType;
import org.example.file.Link;

public class Main {
        public static void main(String[] args) {
            // Crear una instancia de FileSystemFactory
            FileSystemFactory factory = new FileSystemType();

            // Crear un archivo
            FileSystemItem file = factory.createFile("archivo.txt", 100);

            // Crear un directorio
            FileSystemItem directory = factory.createDirectory("directorio");

            // Crear un enlace al archivo
            FileSystemItem link = factory.createLink("enlace_archivo", file);

            // Agregar el archivo y el enlace al directorio
            ((Directory) directory).addChild(file);
            ((Directory) directory).addChild(link);

            // Obtener información del archivo
            System.out.println("Nombre del archivo: " + file.getName());
            System.out.println("Tamaño del archivo: " + file.getSize() + " bytes");

            // Obtener información del enlace
            System.out.println("Nombre del enlace: " + link.getName());
            System.out.println("Tamaño del enlace: " + link.getSize() + " bytes");
            System.out.println("Objetivo del enlace: " + ((Link) link).getTarget().getName());

            // Obtener información del directorio
            System.out.println("Nombre del directorio: " + directory.getName());
            System.out.println("Tamaño del directorio: " + directory.getSize() + " bytes");
        }
    }


