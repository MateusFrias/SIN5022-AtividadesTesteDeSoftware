package codigos;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class ContaCorrenteTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void saqueZero() throws Exception{
        //caso de teste v2
        thrown.expect(Exception.class);
        thrown.expectMessage("Valor invalido");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(0);
    }

    @Test
    public void testv1() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,100);
        assertEquals(90,conta.saque(10),0);
    }

    @Test
    public void testv3() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Valor invalido");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(-10);
    }

    @Test
    public void testv4() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,100);
        assertEquals(-100,conta.saque(200),0);
    }

    @Test
    public void testv5() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,100);
        assertEquals(-50,conta.saque(150),0);
    }

    @Test
    public void testv6() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Saldo Insuficiente");
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.saque(201);
    }

    @Test
    public void testv7() throws Exception {
        ContaCorrente conta = new ContaCorrente(-90,100);
        assertEquals(-100,conta.saque(10),0);
    }

    @Test
    public void testv8() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,0);
        assertEquals(0,conta.saque(100),0);
    }

    @Test
    public void testSetSaldo() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.setSaldo(200);
    }

    @Test
    public void testSetLimite() throws Exception {
        ContaCorrente conta = new ContaCorrente(100,100);
        conta.setLimite(200);
    }

    @Test
    public void testGetSaldo() throws Exception {
        ContaCorrente conta = new ContaCorrente(-90,100);
        assertEquals(-90,conta.getSaldo(),0);
    }

    @Test
    public void testGetLimite() throws Exception {
        ContaCorrente conta = new ContaCorrente(-90,100);
        assertEquals(100,conta.getLimite(),0);
    }







}
