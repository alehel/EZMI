package io.aleksander.ezmi.zmachine;

public class Memory {
  byte[] data;

  public Memory(byte[] storyFile) {
    this.data = storyFile;
  }

  public int getByteAtAddress(int address) {
    return data[address] & 0xff;
  }
}
