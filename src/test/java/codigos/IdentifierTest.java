package codigos;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IdentifierTest {

    @Test
    public void testClasse(){ new Identifier(); }

    @Test
    public void testIDValido1(){
        Assert.assertEquals(true,Identifier.validaIdentificador("abc"));
    }
    
    @Test
    public void testIDValido2(){
        Assert.assertEquals(true,Identifier.validaIdentificador("a"));
    }
    
    @Test
    public void testIDValido3(){
        Assert.assertEquals(true,Identifier.validaIdentificador("abcdef"));
    }

    @Test
    public void testIDInvalido1(){
        Assert.assertEquals(false,Identifier.validaIdentificador(""));
    }
    
    @Test
    public void testIDInvalido2(){
        Assert.assertEquals(false,Identifier.validaIdentificador("abcdefg"));
    }
    
    @Test
    public void testIDValido4(){
        Assert.assertEquals(true,Identifier.validaIdentificador("ppp6"));
    }
    
    @Test
    public void testIDValido5(){
        Assert.assertEquals(true,Identifier.validaIdentificador("zzttgg"));
    }
    
    @Test
    public void testIDValido6(){
        Assert.assertEquals(true,Identifier.validaIdentificador("a98877"));
    }
    
    @Test
    public void testIDInvalido3(){
        Assert.assertEquals(false,Identifier.validaIdentificador("abcde#"));
    }
    
    @Test
    public void testIDInvalido4(){
        Assert.assertEquals(false,Identifier.validaIdentificador(null));
    }
    
    @Test
    public void testIDInvalido5(){
        Assert.assertEquals(false,Identifier.validaIdentificador("6ppp"));
    }

}
