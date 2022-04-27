package es.iespuertodelacruz.AlejandroSamuel;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


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
