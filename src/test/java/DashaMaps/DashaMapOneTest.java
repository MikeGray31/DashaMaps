package DashaMaps;

import org.junit.Assert;
import org.junit.Test;

public class DashaMapOneTest {
    @Test
    public void sizeTest() {
        DashaMapOne dashaMap = new DashaMapOne();
        dashaMap.set("i", 1);
        dashaMap.set("me", 2);
        dashaMap.set("our", 8);
        dashaMap.set("yours", 5);
        Long actual = dashaMap.size();
        Long expected = 4L;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest1() {
        DashaMapOne dashaMap = new DashaMapOne();
        dashaMap.set("apples", 245);
        dashaMap.set("google", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        Assert.assertFalse(dashaMap.isEmpty());
    }

    @Test
    public void isEmptyTest2() {
        DashaMapOne dashaMap = new DashaMapOne();
        Assert.assertTrue(dashaMap.isEmpty());
    }

    @Test
    public void bucketSizeTest1() {
        DashaMapOne dashaMap = new DashaMapOne();
        dashaMap.set("apples", 24);
        Assert.assertTrue(dashaMap.bucketSize("a"));
    }

    @Test
    public void bucketSizeTest2() {
        DashaMapOne dashaMap = new DashaMapOne();
        Assert.assertFalse(dashaMap.bucketSize("a"));
    }

    @Test
    public void toStringTest() {
        DashaMapOne dashaMap = new DashaMapOne();
        dashaMap.set("hello", 245);
        dashaMap.set("Mike", 345);
        dashaMap.set("lamp", 23);
        dashaMap.set("anagram", 33);
        String actual = dashaMap.toString();
        String expected = "a:\n" +
                "   anagram : 33\n" +
                "b:\n" +
                "c:\n" +
                "d:\n" +
                "e:\n" +
                "f:\n" +
                "g:\n" +
                "h:\n" +
                "   hello : 245\n" +
                "i:\n" +
                "j:\n" +
                "k:\n" +
                "l:\n" +
                "   lamp : 23\n" +
                "m:\n" +
                "   Mike : 345\n" +
                "n:\n" +
                "o:\n" +
                "p:\n" +
                "q:\n" +
                "r:\n" +
                "s:\n" +
                "t:\n" +
                "u:\n" +
                "v:\n" +
                "w:\n" +
                "x:\n" +
                "y:\n" +
                "z:\n";
        Assert.assertEquals(expected, actual);
    }

}
