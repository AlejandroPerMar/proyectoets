package es.iespuertodelacruz.AlejandroSamuel.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.AlejandroSamuel.model.Motor;

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
