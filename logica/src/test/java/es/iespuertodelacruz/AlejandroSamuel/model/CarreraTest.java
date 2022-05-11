package es.iespuertodelacruz.AlejandroSamuel.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.AlejandroSamuel.model.Carrera;

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
