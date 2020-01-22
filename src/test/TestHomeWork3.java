import lesson3.homework.HomeWork;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class TestHomeWork3 {

    HomeWork work;

    @Before
    public void init() {
        work = new HomeWork();
    }

    @Test
    public void testTranslate(){
        Assert.assertEquals("[x, y, c]", Arrays.toString(
                work.translate(new String[]{"a", "b", "c"},
                        new String[]{"a", "b", "d"},
                        new String[]{"x", "y", "z"})));
        Assert.assertEquals("[x, b, c]", Arrays.toString(
                work.translate(new String[]{"a", "b", "c"},
                        new String[]{"a", "e", "f"},
                        new String[]{"x", "y", "z"})));
        Assert.assertEquals("[x, y, z, f, lol]", Arrays.toString(
                work.translate(new String[]{"a", "b", "c", "d", "e", "f", "lol"},
                        new String[]{"a", "b", "e", "c", "d"},
                        new String[]{"x", "y", "z"})));
        Assert.assertEquals("[x, y, default, default, default, default]", Arrays.toString(
                work.translate(new String[]{"a", "b", "c", "x", "y", "z"},
                        new String[]{"a", "b", "d"},
                        new String[]{"x", "y", "z", "default", "123"})));
    }

    @Test
    public void testEmail() {
        Assert.assertTrue(work.isEmail("email@email.com"));
        Assert.assertTrue(work.isEmail("m.k.pupkin@host.zone.com"));
        Assert.assertTrue(work.isEmail("m.k.pupkin123@host.zone.com"));
        Assert.assertTrue(work.isEmail("89232335647@host.ea"));
        Assert.assertTrue(work.isEmail("123@127.0.0.1"));
        Assert.assertFalse(work.isEmail("Hello world"));
        Assert.assertFalse(work.isEmail(""));
        Assert.assertFalse(work.isEmail("@@@"));
        Assert.assertFalse(work.isEmail("@"));
        Assert.assertFalse(work.isEmail("12124.124124.ru"));
    }

    @Test
    public void testKOrder() {
        Assert.assertEquals(1, work.kOrderValue(new int[]{1, 0, 3}, 2));
        Assert.assertEquals(5, work.kOrderValue(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
        Assert.assertEquals(2, work.kOrderValue(new int[]{-1, -5, 9, 8, 1, 2, 5}, 4));
    }

    @Test
    public void testDict() {
        Assert.assertEquals(1,
                work.countOfWordsFromDictionaryInString("mama mila ramu", new String[]{"mama"}));
        Assert.assertEquals(4,
                work.countOfWordsFromDictionaryInString("mama mila ramu, mama, mama!, MAMA", new String[]{"mama"}));
        Assert.assertEquals(4,
                work.countOfWordsFromDictionaryInString("a, b, c, d, e, f AA BB , A, B! C", new String[]{"a", "B"}));
        Assert.assertEquals(5,
                work.countOfWordsFromDictionaryInString("a, b, c, d, e, f AA BB , A, B! C", new String[]{"a", "B", "aa"}));
    }
}
