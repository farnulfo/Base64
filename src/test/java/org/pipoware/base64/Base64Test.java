/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.pipoware.base64;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Franck
 */
public class Base64Test {

    public Base64Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of decodeBase64 method, of class Base64.
     */
    @Test
    public void decodeBase64() {
        System.out.println("decodeBase64");
        byte[] base64Data = null;
        byte[] expResult = null;
        byte[] result = Base64.decodeBase64(base64Data);
        assertEquals(expResult, result);
    }
    /**
     *  Test the Base64 implementation
     */
    @Test
    public void testBase64() {
        String content = "Hello World";
        String encodedContent;
        encodedContent = new String(Base64.encodeBase64(content.getBytes()));
        assertTrue("encoding hello world", encodedContent.equals("SGVsbG8gV29ybGQ="));
    }
    /**
     * Test of encodeBase64 method, of class Base64.
     */
    @Test
    public void encodeBase64() {
        System.out.println("encodeBase64");
        byte[] binaryData = null;
        byte[] expResult = null;
        byte[] result = Base64.encodeBase64(binaryData);
        assertEquals(expResult, result);
    }
/*
 *    BASE64("") = ""

   BASE64("f") = "Zg=="

   BASE64("fo") = "Zm8="

   BASE64("foo") = "Zm9v"

   BASE64("foob") = "Zm9vYg=="

   BASE64("fooba") = "Zm9vYmE="

   BASE64("foobar") = "Zm9vYmFy"

   BASE32("") = ""

   BASE32("f") = "MY======"

   BASE32("fo") = "MZXQ===="
 */
    @Test
    public void testSingletons() {
        assertEquals("AA==",new String(Base64.encodeBase64(new byte[] { (byte)0 })));
        assertEquals("AQ==",new String(Base64.encodeBase64(new byte[] { (byte)1 })));
        assertEquals("Ag==",new String(Base64.encodeBase64(new byte[] { (byte)2 })));
        assertEquals("Aw==",new String(Base64.encodeBase64(new byte[] { (byte)3 })));
        assertEquals("BA==",new String(Base64.encodeBase64(new byte[] { (byte)4 })));
        assertEquals("BQ==",new String(Base64.encodeBase64(new byte[] { (byte)5 })));
        assertEquals("Bg==",new String(Base64.encodeBase64(new byte[] { (byte)6 })));
        assertEquals("Bw==",new String(Base64.encodeBase64(new byte[] { (byte)7 })));
        assertEquals("CA==",new String(Base64.encodeBase64(new byte[] { (byte)8 })));
        assertEquals("CQ==",new String(Base64.encodeBase64(new byte[] { (byte)9 })));
        assertEquals("Cg==",new String(Base64.encodeBase64(new byte[] { (byte)10 })));
        assertEquals("Cw==",new String(Base64.encodeBase64(new byte[] { (byte)11 })));
        assertEquals("DA==",new String(Base64.encodeBase64(new byte[] { (byte)12 })));
        assertEquals("DQ==",new String(Base64.encodeBase64(new byte[] { (byte)13 })));
        assertEquals("Dg==",new String(Base64.encodeBase64(new byte[] { (byte)14 })));
        assertEquals("Dw==",new String(Base64.encodeBase64(new byte[] { (byte)15 })));
        assertEquals("EA==",new String(Base64.encodeBase64(new byte[] { (byte)16 })));
        assertEquals("EQ==",new String(Base64.encodeBase64(new byte[] { (byte)17 })));
        assertEquals("Eg==",new String(Base64.encodeBase64(new byte[] { (byte)18 })));
        assertEquals("Ew==",new String(Base64.encodeBase64(new byte[] { (byte)19 })));
        assertEquals("FA==",new String(Base64.encodeBase64(new byte[] { (byte)20 })));
        assertEquals("FQ==",new String(Base64.encodeBase64(new byte[] { (byte)21 })));
        assertEquals("Fg==",new String(Base64.encodeBase64(new byte[] { (byte)22 })));
        assertEquals("Fw==",new String(Base64.encodeBase64(new byte[] { (byte)23 })));
        assertEquals("GA==",new String(Base64.encodeBase64(new byte[] { (byte)24 })));
        assertEquals("GQ==",new String(Base64.encodeBase64(new byte[] { (byte)25 })));
        assertEquals("Gg==",new String(Base64.encodeBase64(new byte[] { (byte)26 })));
        assertEquals("Gw==",new String(Base64.encodeBase64(new byte[] { (byte)27 })));
        assertEquals("HA==",new String(Base64.encodeBase64(new byte[] { (byte)28 })));
        assertEquals("HQ==",new String(Base64.encodeBase64(new byte[] { (byte)29 })));
        assertEquals("Hg==",new String(Base64.encodeBase64(new byte[] { (byte)30 })));
        assertEquals("Hw==",new String(Base64.encodeBase64(new byte[] { (byte)31 })));
        assertEquals("IA==",new String(Base64.encodeBase64(new byte[] { (byte)32 })));
        assertEquals("IQ==",new String(Base64.encodeBase64(new byte[] { (byte)33 })));
        assertEquals("Ig==",new String(Base64.encodeBase64(new byte[] { (byte)34 })));
        assertEquals("Iw==",new String(Base64.encodeBase64(new byte[] { (byte)35 })));
        assertEquals("JA==",new String(Base64.encodeBase64(new byte[] { (byte)36 })));
        assertEquals("JQ==",new String(Base64.encodeBase64(new byte[] { (byte)37 })));
        assertEquals("Jg==",new String(Base64.encodeBase64(new byte[] { (byte)38 })));
        assertEquals("Jw==",new String(Base64.encodeBase64(new byte[] { (byte)39 })));
        assertEquals("KA==",new String(Base64.encodeBase64(new byte[] { (byte)40 })));
        assertEquals("KQ==",new String(Base64.encodeBase64(new byte[] { (byte)41 })));
        assertEquals("Kg==",new String(Base64.encodeBase64(new byte[] { (byte)42 })));
        assertEquals("Kw==",new String(Base64.encodeBase64(new byte[] { (byte)43 })));
        assertEquals("LA==",new String(Base64.encodeBase64(new byte[] { (byte)44 })));
        assertEquals("LQ==",new String(Base64.encodeBase64(new byte[] { (byte)45 })));
        assertEquals("Lg==",new String(Base64.encodeBase64(new byte[] { (byte)46 })));
        assertEquals("Lw==",new String(Base64.encodeBase64(new byte[] { (byte)47 })));
        assertEquals("MA==",new String(Base64.encodeBase64(new byte[] { (byte)48 })));
        assertEquals("MQ==",new String(Base64.encodeBase64(new byte[] { (byte)49 })));
        assertEquals("Mg==",new String(Base64.encodeBase64(new byte[] { (byte)50 })));
        assertEquals("Mw==",new String(Base64.encodeBase64(new byte[] { (byte)51 })));
        assertEquals("NA==",new String(Base64.encodeBase64(new byte[] { (byte)52 })));
        assertEquals("NQ==",new String(Base64.encodeBase64(new byte[] { (byte)53 })));
        assertEquals("Ng==",new String(Base64.encodeBase64(new byte[] { (byte)54 })));
        assertEquals("Nw==",new String(Base64.encodeBase64(new byte[] { (byte)55 })));
        assertEquals("OA==",new String(Base64.encodeBase64(new byte[] { (byte)56 })));
        assertEquals("OQ==",new String(Base64.encodeBase64(new byte[] { (byte)57 })));
        assertEquals("Og==",new String(Base64.encodeBase64(new byte[] { (byte)58 })));
        assertEquals("Ow==",new String(Base64.encodeBase64(new byte[] { (byte)59 })));
        assertEquals("PA==",new String(Base64.encodeBase64(new byte[] { (byte)60 })));
        assertEquals("PQ==",new String(Base64.encodeBase64(new byte[] { (byte)61 })));
        assertEquals("Pg==",new String(Base64.encodeBase64(new byte[] { (byte)62 })));
        assertEquals("Pw==",new String(Base64.encodeBase64(new byte[] { (byte)63 })));
        assertEquals("QA==",new String(Base64.encodeBase64(new byte[] { (byte)64 })));
        assertEquals("QQ==",new String(Base64.encodeBase64(new byte[] { (byte)65 })));
        assertEquals("Qg==",new String(Base64.encodeBase64(new byte[] { (byte)66 })));
        assertEquals("Qw==",new String(Base64.encodeBase64(new byte[] { (byte)67 })));
        assertEquals("RA==",new String(Base64.encodeBase64(new byte[] { (byte)68 })));
        assertEquals("RQ==",new String(Base64.encodeBase64(new byte[] { (byte)69 })));
        assertEquals("Rg==",new String(Base64.encodeBase64(new byte[] { (byte)70 })));
        assertEquals("Rw==",new String(Base64.encodeBase64(new byte[] { (byte)71 })));
        assertEquals("SA==",new String(Base64.encodeBase64(new byte[] { (byte)72 })));
        assertEquals("SQ==",new String(Base64.encodeBase64(new byte[] { (byte)73 })));
        assertEquals("Sg==",new String(Base64.encodeBase64(new byte[] { (byte)74 })));
        assertEquals("Sw==",new String(Base64.encodeBase64(new byte[] { (byte)75 })));
        assertEquals("TA==",new String(Base64.encodeBase64(new byte[] { (byte)76 })));
        assertEquals("TQ==",new String(Base64.encodeBase64(new byte[] { (byte)77 })));
        assertEquals("Tg==",new String(Base64.encodeBase64(new byte[] { (byte)78 })));
        assertEquals("Tw==",new String(Base64.encodeBase64(new byte[] { (byte)79 })));
        assertEquals("UA==",new String(Base64.encodeBase64(new byte[] { (byte)80 })));
        assertEquals("UQ==",new String(Base64.encodeBase64(new byte[] { (byte)81 })));
        assertEquals("Ug==",new String(Base64.encodeBase64(new byte[] { (byte)82 })));
        assertEquals("Uw==",new String(Base64.encodeBase64(new byte[] { (byte)83 })));
        assertEquals("VA==",new String(Base64.encodeBase64(new byte[] { (byte)84 })));
        assertEquals("VQ==",new String(Base64.encodeBase64(new byte[] { (byte)85 })));
        assertEquals("Vg==",new String(Base64.encodeBase64(new byte[] { (byte)86 })));
        assertEquals("Vw==",new String(Base64.encodeBase64(new byte[] { (byte)87 })));
        assertEquals("WA==",new String(Base64.encodeBase64(new byte[] { (byte)88 })));
        assertEquals("WQ==",new String(Base64.encodeBase64(new byte[] { (byte)89 })));
        assertEquals("Wg==",new String(Base64.encodeBase64(new byte[] { (byte)90 })));
        assertEquals("Ww==",new String(Base64.encodeBase64(new byte[] { (byte)91 })));
        assertEquals("XA==",new String(Base64.encodeBase64(new byte[] { (byte)92 })));
        assertEquals("XQ==",new String(Base64.encodeBase64(new byte[] { (byte)93 })));
        assertEquals("Xg==",new String(Base64.encodeBase64(new byte[] { (byte)94 })));
        assertEquals("Xw==",new String(Base64.encodeBase64(new byte[] { (byte)95 })));
        assertEquals("YA==",new String(Base64.encodeBase64(new byte[] { (byte)96 })));
        assertEquals("YQ==",new String(Base64.encodeBase64(new byte[] { (byte)97 })));
        assertEquals("Yg==",new String(Base64.encodeBase64(new byte[] { (byte)98 })));
        assertEquals("Yw==",new String(Base64.encodeBase64(new byte[] { (byte)99 })));
        assertEquals("ZA==",new String(Base64.encodeBase64(new byte[] { (byte)100 })));
        assertEquals("ZQ==",new String(Base64.encodeBase64(new byte[] { (byte)101 })));
        assertEquals("Zg==",new String(Base64.encodeBase64(new byte[] { (byte)102 })));
        assertEquals("Zw==",new String(Base64.encodeBase64(new byte[] { (byte)103 })));
        assertEquals("aA==",new String(Base64.encodeBase64(new byte[] { (byte)104 })));
    }    

    @Test
    public void testTriplets() {
        assertEquals("AAAA",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)0 })));
        assertEquals("AAAB",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)1 })));
        assertEquals("AAAC",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)2 })));
        assertEquals("AAAD",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)3 })));
        assertEquals("AAAE",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)4 })));
        assertEquals("AAAF",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)5 })));
        assertEquals("AAAG",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)6 })));
        assertEquals("AAAH",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)7 })));
        assertEquals("AAAI",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)8 })));
        assertEquals("AAAJ",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)9 })));
        assertEquals("AAAK",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)10 })));
        assertEquals("AAAL",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)11 })));
        assertEquals("AAAM",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)12 })));
        assertEquals("AAAN",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)13 })));
        assertEquals("AAAO",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)14 })));
        assertEquals("AAAP",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)15 })));
        assertEquals("AAAQ",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)16 })));
        assertEquals("AAAR",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)17 })));
        assertEquals("AAAS",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)18 })));
        assertEquals("AAAT",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)19 })));
        assertEquals("AAAU",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)20 })));
        assertEquals("AAAV",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)21 })));
        assertEquals("AAAW",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)22 })));
        assertEquals("AAAX",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)23 })));
        assertEquals("AAAY",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)24 })));
        assertEquals("AAAZ",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)25 })));
        assertEquals("AAAa",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)26 })));
        assertEquals("AAAb",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)27 })));
        assertEquals("AAAc",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)28 })));
        assertEquals("AAAd",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)29 })));
        assertEquals("AAAe",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)30 })));
        assertEquals("AAAf",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)31 })));
        assertEquals("AAAg",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)32 })));
        assertEquals("AAAh",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)33 })));
        assertEquals("AAAi",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)34 })));
        assertEquals("AAAj",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)35 })));
        assertEquals("AAAk",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)36 })));
        assertEquals("AAAl",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)37 })));
        assertEquals("AAAm",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)38 })));
        assertEquals("AAAn",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)39 })));
        assertEquals("AAAo",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)40 })));
        assertEquals("AAAp",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)41 })));
        assertEquals("AAAq",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)42 })));
        assertEquals("AAAr",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)43 })));
        assertEquals("AAAs",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)44 })));
        assertEquals("AAAt",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)45 })));
        assertEquals("AAAu",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)46 })));
        assertEquals("AAAv",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)47 })));
        assertEquals("AAAw",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)48 })));
        assertEquals("AAAx",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)49 })));
        assertEquals("AAAy",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)50 })));
        assertEquals("AAAz",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)51 })));
        assertEquals("AAA0",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)52 })));
        assertEquals("AAA1",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)53 })));
        assertEquals("AAA2",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)54 })));
        assertEquals("AAA3",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)55 })));
        assertEquals("AAA4",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)56 })));
        assertEquals("AAA5",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)57 })));
        assertEquals("AAA6",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)58 })));
        assertEquals("AAA7",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)59 })));
        assertEquals("AAA8",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)60 })));
        assertEquals("AAA9",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)61 })));
        assertEquals("AAA+",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)62 })));
        assertEquals("AAA/",new String(Base64.encodeBase64(new byte[] { (byte)0, (byte)0, (byte)63 })));
    }

    @Test
    public void testKnownEncodings() {
        assertEquals("VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2dzLg==",new String(Base64.encodeBase64("The quick brown fox jumped over the lazy dogs.".getBytes())));
	//assertEquals("YmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJs\r\nYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFo\r\nIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBibGFoIGJsYWggYmxhaCBi\r\nbGFoIGJsYWg=\r\n",new String(Base64.encodeBase64Chunked("blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah".getBytes())));
        assertEquals("SXQgd2FzIHRoZSBiZXN0IG9mIHRpbWVzLCBpdCB3YXMgdGhlIHdvcnN0IG9mIHRpbWVzLg==",new String(Base64.encodeBase64("It was the best of times, it was the worst of times.".getBytes())));
        assertEquals("aHR0cDovL2pha2FydGEuYXBhY2hlLm9yZy9jb21tbW9ucw==",new String(Base64.encodeBase64("http://jakarta.apache.org/commmons".getBytes())));
        assertEquals("QWFCYkNjRGRFZUZmR2dIaElpSmpLa0xsTW1Obk9vUHBRcVJyU3NUdFV1VnZXd1h4WXlaeg==",new String(Base64.encodeBase64("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz".getBytes())));
        assertEquals("eyAwLCAxLCAyLCAzLCA0LCA1LCA2LCA3LCA4LCA5IH0=",new String(Base64.encodeBase64("{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }".getBytes())));
        assertEquals("eHl6enkh",new String(Base64.encodeBase64("xyzzy!".getBytes())));
    }
}