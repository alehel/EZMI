package io.aleksander.ezmi.zmachine;

public class ZMachine {
  Memory memory;

  /**
   * Initialize a Z-Machine and load into its memory the provided story file.
   *
   * @param storyFile a byte[] array containing a story file.
   */
  public ZMachine(byte[] storyFile) {
    memory = new Memory(storyFile);
  }

  /**
   * Get the Z-Machine version for the loaded story file.
   *
   * @return an int specifying the Z-machine version.
   */
  public int getVersion() {
    return memory.getByteAtAddress(MemoryAddress.VERSION);
  }
}
