package es.iespuertodelacruz.gppuerto.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuscadorTest {

    Buscador buscador;

    @Before
    public void contructor() {
        if (buscador == null) {
            buscador = new Buscador();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", buscador);
    }

    @Test
    public void iniciarSesion() {
        Assert.assertFalse("El método no ha funcionado",buscador.iniciarSesion("", ""));
    }

    @Test
    public void registrarseTest() {
        Assert.assertTrue("El método no ha funcionado",buscador.registrarse("usuario", "1234"));
    }

    @Test
    public void accederUsuariosTest() {
        Assert.assertNotNull("El método no ha funcionado",buscador.accederUsuarios());
    }

    @Test
    public void escribirUsuariosTest() {
        Assert.assertTrue("El método no ha funcionado",buscador.escribirUsuarios("Prueba usuarios"));
     }

    @Test
    public void buscarPilotoTest() {
        
    }

    @Test
    public void buscarEquipoTest() {

    }

    @Test
    public void buscarTemporadaTest() {

    }

    @Test
    public void buscarCircuitoTest() {

    }

    @Test
    public void buscarCampeonTest() {

    }

    @Test
    public void buscarVehiculoTest() {

    }
}
