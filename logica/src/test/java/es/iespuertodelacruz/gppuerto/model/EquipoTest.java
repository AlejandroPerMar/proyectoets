package es.iespuertodelacruz.gppuerto.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.gppuerto.model.Equipo;

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
