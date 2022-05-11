package es.iespuertodelacruz.AlejandroSamuel.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.AlejandroSamuel.model.Circuito;

public class CircuitoTest {
    
    Circuito circuito;

    @Before
    public void contructor() {
        if (circuito == null) {
            circuito = new Circuito();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", circuito);
    }


}
