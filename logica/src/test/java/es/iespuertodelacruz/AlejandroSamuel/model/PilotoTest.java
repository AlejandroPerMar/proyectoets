package es.iespuertodelacruz.AlejandroSamuel.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import es.iespuertodelacruz.AlejandroSamuel.model.Piloto;


public class PilotoTest {
    
        
   Piloto piloto;
    
   @Before
   public void contructor(){
       if(piloto == null){
        piloto = new Piloto();
       }
   }

   @Test
   public void contructorTest() {
       Assert.assertNotNull("El objeto es nulo.",piloto);
   }



}
