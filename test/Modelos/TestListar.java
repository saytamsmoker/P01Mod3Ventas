
package Modelos;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado=new ArrayList<>();
        ArrayList<Venta> obtenido=instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }
}
