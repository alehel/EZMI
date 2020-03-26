package io.aleksander.ezmi;

public class App 
{
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("Please provide the absolute path of the story file as input.");
            System.exit(0);
        }

        String absolutePath = args[0];
        byte[] bytes = FileLoader.loadFile(absolutePath);
        int version = bytes[0x00] & 0xff;
        System.out.println("File is based on Z-Machine version: " + version);
    }
}
