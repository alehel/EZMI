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

  /**
   * Get the file length of the loaded story file.
   *
   * @return an int specifying the story file length.
   */
  public int getStoryLength() {
    int version = getVersion();
    int value = memory.getWordAtAddress(MemoryAddress.STORY_LENGTH);

    // The size of the story file is, to save space, divided by a constant. The constant used depends on the version
    // of the Z-Machine used.
    if(version == 1 || version == 2 || version == 3) {
      return value * 2;
    } else if (version == 4 || version == 5) {
      return value * 4;
    } else {
      return value * 8;
    }
  }
}
