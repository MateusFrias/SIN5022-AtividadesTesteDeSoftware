package codigos;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PeditoTest {

    private Pedido pedido;

    @BeforeClass
    public static void setupClass(){
        System.out.println("Antes de todos os testes");
    }

    @Before
    public void setup(){
        System.out.println("Antes de cada teste");
        pedido = new Pedido();
    }

    @Test
    public void testTaxaZero(){
        float taxa = pedido.calculaTaxaDesconto(false,"",100);
        assertEquals(0,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",600);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloValorCompraNoLimite(){
        float taxa = pedido.calculaTaxaDesconto(false,"",500);
        assertEquals(15,taxa,0);
    }

    @Test
    public void testTaxa15PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"ouro",499);
        assertEquals(15,taxa,0);
    }
    
    @Test
    public void testTaxa10PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",400);
        assertEquals(10,taxa,0);
    }
    
    @Test
    public void testTaxa10PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"prata",399);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa10PelaPrimeiraCompra(){
        float taxa = pedido.calculaTaxaDesconto(true,"",399);
        assertEquals(10,taxa,0);
    }

    @Test
    public void testTaxa5PeloValorCompra(){
        float taxa = pedido.calculaTaxaDesconto(false,"",200);
        assertEquals(5,taxa,0);
    }
    
    @Test
    public void testTaxa5PeloTipoCliente(){
        float taxa = pedido.calculaTaxaDesconto(false,"bronze",199);
        assertEquals(5,taxa,0);
    }
    
}
