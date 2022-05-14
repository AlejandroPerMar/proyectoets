package es.iespuertodelacruz.gppuerto.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

    Carrera carrera;

    @Before
    public void contructor() {
        if (carrera == null) {
            carrera = new Carrera();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", carrera);
    }
 
}
