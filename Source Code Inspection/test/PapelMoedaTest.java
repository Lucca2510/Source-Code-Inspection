/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31520731
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @Test
    public void testarValor(){
        PapelMoeda p = new PapelMoeda(10,1);
        assertEquals(p.getValor(),10);
    }
    
    @Test
    public void testarQuantidade(){
        PapelMoeda p = new PapelMoeda(10,1);
        assertEquals(p.getQuantidade(),1);
    }
    
    @Test
    public void testarSetValor(){
        PapelMoeda p = new PapelMoeda(10,1);
        p.setValor(1);
        assertEquals(p.getValor(),1);
    }
    
    @Test 
    public void testarSetQuantidade(){
        PapelMoeda p = new PapelMoeda(10,5);
        p.setQuantidade(1);
        assertEquals(p.getQuantidade(),1);
    }
}
