package es.iespuertodelacruz.AlejandroSamuel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TemporadaTest {

    Temporada temporada;
    
    @Before
    public void contructor(){
        if(temporada == null){
            temporada = new Temporada();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.",temporada);
    }


}
