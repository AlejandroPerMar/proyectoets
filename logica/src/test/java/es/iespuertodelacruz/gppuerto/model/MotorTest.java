package es.iespuertodelacruz.gppuerto.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.gppuerto.model.Motor;

public class MotorTest {

    Motor motor;

    @Before
    public void contructor() {
        if (motor == null) {
            motor = new Motor();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", motor);
    }

}
