
package Modelos;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestEliminar {
    
    public TestEliminar(){
        
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="001";
        Venta venta=new Venta("001", 1000, 2);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado=true;  
        boolean obtenido=instance.Eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
