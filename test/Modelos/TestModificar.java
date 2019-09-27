package Modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author saita
 */
public class TestModificar {

    public TestModificar() {
    }

    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Venta venta = new Venta("001", 1000, 2);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean esperado = true;
        venta = new Venta("001", 1000, 4);
        boolean obtenido = instance.Modificar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
