
package Modelos;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestSubTotal {

    public TestSubTotal() {
    }
    
    @Test
    public void testSubTotal(){
        System.out.println("SubTotal");
        String codigo="001";
        Venta venta=new Venta("001", 1000, 2);
        ColeccionVentas instance=new ColeccionVentas();
        instance.Agregar(venta);
        int esperado=2000;  
        int obtenido=instance.SubTotal(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
