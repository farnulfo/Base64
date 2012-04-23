/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pipoware.base64;

/**
 *
 * @author Franck
 */
public class Tools {

    /** Field BIT_DIGIT */
   private final static char[] BIT_DIGIT = { '0', '1' };

   /** Field COMPARE_BITS */
   private final static byte[] COMPARE_BITS = { (byte) 0x80, (byte) 0x40,
                                                (byte) 0x20, (byte) 0x10,
                                                (byte) 0x08, (byte) 0x04,
                                                (byte) 0x02, (byte) 0x01 };

   public static String byte2bin(byte b) {
       StringBuffer sb = new StringBuffer();
       byte2bin(b, sb);
       return sb.toString();
   }

   public static void byte2bin(byte b, StringBuffer buf) {

      // test every 8 bit
      for (int i = 0; i < 8; i++) {

         //---test if bit is set
         if ((b & COMPARE_BITS[i]) != 0) {
            buf.append(BIT_DIGIT[1]);
         } else {
            buf.append(BIT_DIGIT[0]);
         }
      }
   }

}
