package io.aleksander.ezmi;

import io.aleksander.ezmi.zmachine.ZMachine;

public class App {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Please provide the absolute path of the story file as input.");
      System.exit(0);
    }

    String absolutePath = args[0];
    byte[] storyFile = FileLoader.loadStoryFile(absolutePath);

    ZMachine zMachine = new ZMachine(storyFile);

    System.out.println("Running version " + zMachine.getVersion() + " of the Z-machine.");
    System.out.println("The story file size is " + zMachine.getStoryLength());
  }
}
