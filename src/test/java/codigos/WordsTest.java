package codigos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordsTest {

    private Words words;

    @Before
    public void setup(){
        System.out.println("Antes de cada teste");
        words = new Words();
    }

    @Test
    public void testv1() throws Exception {
        assertEquals(-1,words.countWords(null));
    }

    @Test
    public void testv2() throws Exception {
        assertEquals(0,words.countWords("um"));
    }

    @Test
    public void testv3() throws Exception {
        assertEquals(0,words.countWords("rato"));
    }

    @Test
    public void testv4() throws Exception {
        assertEquals(0,words.countWords("sapo"));
    }

    @Test
    public void testv5() throws Exception {
        assertEquals(0,words.countWords("rato sapo"));
    }

    @Test
    public void testv6() throws Exception {
        assertEquals(1,words.countWords("andar"));
    }

    @Test
    public void testv7() throws Exception {
        assertEquals(1,words.countWords("rato andar"));
    }

    @Test
    public void testv8() throws Exception {
        assertEquals(1,words.countWords("sapos"));
    }

    @Test
    public void testv9() throws Exception {
        assertEquals(1,words.countWords("sapo sapos"));
    }

    @Test
    public void testv10() throws Exception {
        assertEquals(2,words.countWords("andar sapos"));
    }

    @Test
    public void testv11() throws Exception {
        assertEquals(0,words.countWords("r s"));
    }

    @Test
    public void testv12() throws Exception {
        assertEquals(0,words.countWords("s r"));
    }

    @Test
    public void testv13() throws Exception {
        assertEquals(0,words.countWords("t u"));
    }


}
