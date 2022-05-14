package es.iespuertodelacruz.gppuerto.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.gppuerto.model.Vehiculo;

public class VehiculoTest {
    
   Vehiculo vehiculo;
    
    @Before
    public void contructor(){
        if(vehiculo == null){
            vehiculo = new Vehiculo();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.",vehiculo);
    }


}

