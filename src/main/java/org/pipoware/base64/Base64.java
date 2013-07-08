package org.pipoware.base64;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author Franck
 */
public class Base64 {

  /*
  Value Encoding  Value Encoding  Value Encoding  Value Encoding
  0 A            17 R            34 i            51 z
  1 B            18 S            35 j            52 0
  2 C            19 T            36 k            53 1
  3 D            20 U            37 l            54 2
  4 E            21 V            38 m            55 3
  5 F            22 W            39 n            56 4
  6 G            23 X            40 o            57 5
  7 H            24 Y            41 p            58 6
  8 I            25 Z            42 q            59 7
  9 J            26 a            43 r            60 8
  10 K            27 b            44 s            61 9
  11 L            28 c            45 t            62 +
  12 M            29 d            46 u            63 /
  13 N            30 e            47 v
  14 O            31 f            48 w         (pad) =
  15 P            32 g            49 x
  16 Q            33 h            50 y
   */
  private static byte[] base64Alphabet = {
    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
    'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
    'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
    'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'
  };

  static public byte[] encodeBase64(byte[] binaryData) {
    // null case
    if (binaryData == null) {
      return null;
    }

    if (binaryData.length == 0) {
      return new byte[]{};
    }

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    /*
    // only 8 bit
    if(binaryData.length == 1) {
    base64oneByte(bos, binaryData[0]);
    } else if (binaryData.length == 2) {
    base64twoByte(bos, binaryData[0], binaryData[1]);
    } else if (binaryData.length == 3) {
    base64threeByte(bos, binaryData[0], binaryData[1], binaryData[2]);
    }
     */

    int mod = binaryData.length % 3;
    for (int i = 0; i < binaryData.length - mod; i += 3) {
      base64threeByte(bos, binaryData[i], binaryData[i + 1], binaryData[i + 2]);
    }

    if (mod != 0) {
      if (mod == 1) {
        base64oneByte(bos, binaryData[binaryData.length - 1]);
      } else if (mod == 2) {
        base64twoByte(bos, binaryData[binaryData.length - 2], binaryData[binaryData.length - 1]);
      }
    }


    return bos.toByteArray();

  }

  static public byte[] decodeBase64(byte[] base64Data) {
    return null;
  }

  private static void base64oneByte(ByteArrayOutputStream bos, byte one) {
    // get the 6 first bits with right shifting and masking
    int tmp = (one >> 2) & 0x3F;
    String s = Tools.byte2bin((byte) tmp);

    bos.write(base64Alphabet[(one >> 2) & 0x3F]);

    // get the last 2 bits with masking then left shifting to get 6 bits
    tmp = (one & 0x03) << 4;
    s = Tools.byte2bin((byte) tmp);

    bos.write(base64Alphabet[(one & 0x03) << 4]);
    bos.write('=');
    bos.write('=');
  }

  private static void base64twoByte(ByteArrayOutputStream bos, byte one, byte two) {
    // get the 6 first bits with right shifting and masking
    bos.write(base64Alphabet[(one >> 2) & 0x3F]);

    // get the last 2 bits with masking then left shifting to get 6 bits
    int i1 = (one & 0x03) << 4;
    // get the first 4 bits then left shifting
    int i2 = (two & 0xF0) >>> 4;
    int i3 = i1 | i2;
    bos.write(base64Alphabet[i3]);

    int i4 = (two & 0x0F) << 2;

    bos.write(base64Alphabet[i4]);

    bos.write('=');
  }

  private static void base64threeByte(ByteArrayOutputStream bos, byte one, byte two, byte three) {

    /*
    System.out.println(
    Tools.byte2bin(binaryData[0]) + ":" +
    Tools.byte2bin(binaryData[1]) + ":" +
    Tools.byte2bin(binaryData[2]));
     */

    // get the 6 first bits with right shifting and masking
    int tmp = (one >> 2) & 0x3F;
    String s = Tools.byte2bin((byte) tmp);

    bos.write(base64Alphabet[(one >> 2) & 0x3F]);

    // get the last 2 bits with masking then left shifting to get 6 bits
    int i1 = (one & 0x03) << 4;
    // get the first 4 bits then left shifting
    int i2 = (two & 0xF0) >>> 4;
    int i3 = i1 | i2;
    bos.write(base64Alphabet[i3]);

    int i4 = (two & 0x0F) << 2;

    // 0xC0 = 1100_0000
    int i5 = (three & 0xC0) >> 6;

    int i6 = i4 | i5;

    bos.write(base64Alphabet[i6]);

    // 0x3F = 0011_1111
    int i7 = three & 0x3F;
    bos.write(base64Alphabet[i7]);
  }
}
