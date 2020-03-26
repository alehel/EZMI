package io.aleksander.ezmi.zmachine;

public class Memory {
  byte[] data;

  public Memory(byte[] storyFile) {
    this.data = storyFile;
  }

  /**
   * Return the value of the byte located at the given memory address.
   *
   * @param address the address of the byte value to get.
   * @return the decimal value of the byte at the given memory address.
   */
  public int getByteAtAddress(int address) {
    return data[address] & 0xff;
  }

  /**
   * Return the value of the word located at the given memory address.
   *
   * @param address the address of the word value to get.
   * @return the decimal value of the word at the given memory address.
   */
  public int getWordAtAddress(int address) {
    // A word is a 16 bit value, which is spread accross 2 bytes. The value of a word is determined by combining the
    // bits of the 2 bytes. To illustrate, if a byte with the value of 01101011 is located at memory address n and
    // 11111111 is located at memory address n+1, the two are combined to create the 16-bit value 0110101111111111.
    return (data[address] << 8 | (data[address + 1] & 0xff)) & 0xffff;
  }
}
