package io.aleksander.ezmi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLoader {

  public static byte[] loadStoryFile(String filePath) {
    Path path = Paths.get(filePath);
    try {
      return Files.readAllBytes(path);
    } catch (IOException expception) {
      System.out.println("Failed");
      expception.printStackTrace();
    }
    return new byte[0];
  }
}
