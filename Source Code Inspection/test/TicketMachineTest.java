/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lgd25
 */
public class TicketMachineTest {
    
    public TicketMachineTest() {
    }
    
    @Test
    public void testeInserir(){
        TicketMachine tm = new TicketMachine(2);
        try {
            tm.inserir(10);
        } catch (PapelMoedaInvalidaException ex) {
            Logger.getLogger(TicketMachineTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(tm.getSaldo(), 10);
    }
    
    
    
}
