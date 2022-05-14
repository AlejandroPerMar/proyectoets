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
        Assert.assertFalse("El método no ha funcionado", buscador.iniciarSesion("", ""));
    }

    @Test
    public void registrarseTest() {
        Assert.assertTrue("El método no ha funcionado", buscador.registrarse("usuario", "1234"));
    }

    @Test
    public void accederUsuariosTest() {
        Assert.assertNotNull("El método no ha funcionado", buscador.accederUsuarios());
    }

    @Test
    public void escribirUsuariosTest() {
        Assert.assertTrue("El método no ha funcionado", buscador.escribirUsuarios("Prueba usuarios"));
    }

    @Test
    public void buscarPilotoTest() {
        Assert.assertNotNull(buscador.buscarPiloto("Fernando Alonso"));
    }

    @Test
    public void buscarPilotoNotTest() {
        Assert.assertNull(buscador.buscarPiloto("Juan Enrique"));
    }

    @Test
    public void buscarEquipoTest() {
        Assert.assertNotNull(buscador.buscarPiloto("Alpine"));
    }

    @Test
    public void buscarEquipoNotTest() {
        Assert.assertNull(buscador.buscarEquipo("Citroen"));
    }

    @Test
    public void buscarTemporadaTest() {
        Assert.assertNotNull(buscador.buscarTemporada(2022));
    }

    @Test
    public void buscarTemporadaNotTest() {
        Assert.assertNull(buscador.buscarTemporada(2030));
    }

    @Test
    public void buscarCircuitoTest() {
        Assert.assertNotNull(buscador.buscarCircuito("Monza"));
    }

    @Test
    public void buscarCircuitoNotTest() {
        Assert.assertNull(buscador.buscarCircuito("Tenerife"));
    }

    @Test
    public void buscarVehiculoTest() {
        Assert.assertNotNull(buscador.buscarVehiculo("W13"));
    }

    @Test
    public void buscarVehiculoNotTest() {
        Assert.assertNull(buscador.buscarCircuito("Clio"));

    }
}
