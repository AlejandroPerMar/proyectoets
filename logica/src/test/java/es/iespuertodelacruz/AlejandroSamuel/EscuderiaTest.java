package es.iespuertodelacruz.AlejandroSamuel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EscuderiaTest {
    
    Escuderia escuderia;

    @Before
    public void contructor() {
        if (escuderia == null) {
            escuderia = new Escuderia();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", escuderia);
    }


}
