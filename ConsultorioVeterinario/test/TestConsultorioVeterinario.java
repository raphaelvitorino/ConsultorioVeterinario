/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import consultorioveterinario.Cliente;
import consultorioveterinario.Item;
import consultorioveterinario.OrdemServico;
import consultorioveterinario.Servico;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabinho
 */
public class TestConsultorioVeterinario {
    
    public TestConsultorioVeterinario() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testServico(){
        Servico servico = new Servico();
        servico.setNomeServico("Vacina");
        servico.setValor(20);     
        
        OrdemServico os = new OrdemServico();
        Cliente c = new Cliente();
        Item i = new Item();
        c.setNomeCliente("Ralph");
        os.setCliente(c);
        
        assertEquals("Ralph", c.getNomeCliente());
        assertEquals("Vacina", servico.getNomeServico()); 
        assertEquals(20, servico.getValor(), 0);
   
    }
}
