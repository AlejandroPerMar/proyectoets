package es.iespuertodelacruz.AlejandroSamuel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EquipoTest {
    
    Equipo equipo;

    @Before
    public void contructor() {
        if (equipo == null) {
            equipo = new Equipo();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", equipo);
    }


}
