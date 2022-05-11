package es.iespuertodelacruz.AlejandroSamuel.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.AlejandroSamuel.model.Temporada;

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
