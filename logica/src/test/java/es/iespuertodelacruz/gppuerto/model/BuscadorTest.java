package es.iespuertodelacruz.gppuerto.model;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuscadorTest {

    Buscador buscador;

    @Before
    public void before() {
        if (buscador == null) {
            buscador = new Buscador();
            assertNotNull("La instancia de division es nula", buscador);
        }
    }

    @Test
    public void constructorTest() {
        Assert.assertNotNull("El objeto es nulo.", buscador);
    }

    @Test
    public void iniciarSesionCondicional1Test() {
        Assert.assertTrue("El método no ha funcionado", buscador.iniciarSesion("prueba", "prueba", "/usuariosTest.csv"));
    }

    @Test
    public void iniciarSesionCondicional2Test() {
        Assert.assertFalse("El método no deberia haber encontrado este usuario", buscador.iniciarSesion("esteusuarionoesta", "estacontrasenanoesta", "/usuariosTest.csv"));
    }

    @Test
    public void registrarseCondicional1Test() {
        Assert.assertTrue("Deberia haber agregado al usuario, comprueba si existe o no", buscador.registrarse("esteusuarionoexiste", "1234", "/usuariosTest.csv"));
    }

    @Test
    public void registrarseCondicional2Test() {
        Assert.assertFalse("No deberia haber agregado al usuario, ya existe", buscador.registrarse("prueba", "1234", "/usuariosTest.csv"));
    }

    @Test
    public void buscarPilotoCondicional1Test() {
        Piloto piloto = new Piloto("Fernando Alonso", "Diaz", 40, "Espana", null);
        buscador.pilotos.add(piloto);
        Assert.assertNotNull("No deberia haber devuelto nulo, este piloto existe", buscador.buscarPiloto("Fernando Alonso"));
    }

    @Test
    public void buscarPilotoCondicional2Test() {
        Assert.assertNull("Deberia haber devuelto nulo, este piloto no esta agregado a los pilotos de buscador", buscador.buscarPiloto("Juan Enrique"));
    }

    @Test
    public void buscarEquipoCondicional1Test() {
        Equipo equipo = new Equipo("Scuderia Ferrari", "Italia");
        buscador.equipos.add(equipo);
        Assert.assertNotNull("No deberia haber devuelto nulo, este equipo existe", buscador.buscarEquipo("Ferrari"));
    }

    @Test
    public void buscarEquipoCondicional2Test() {
        Assert.assertNull("Deberia haber devuelto nulo, este equipo no esta agregado a los equipos de buscador", buscador.buscarEquipo("Citroen"));
    }

    @Test
    public void buscarTemporadaCondicional1Test() {
        Temporada temporada = new Temporada(2012);
        buscador.temporadas.add(temporada);
        Assert.assertNotNull("No deberia haber devuelto nulo, esta temporada existe", buscador.buscarTemporada(2012));
    }

    @Test
    public void buscarTemporadaCondicional2Test() {
        Assert.assertNull("Deberia haber devuelto nulo, esta temporada no esta agregada a las temporadas de buscador", buscador.buscarTemporada(2030));
    }

    @Test
    public void buscarCircuitoCondicional1Test() {
        Circuito circuito = new Circuito("Autodromo Nazionale di Monza", "Italia", 5.793);
        buscador.circuitos.add(circuito);
        Assert.assertNotNull("No deberia dar nulo, Monza esta incluido en los circuitos de buscador", buscador.buscarCircuito("Monza"));
    }

    @Test
    public void buscarCircuitoCondicional2Test() {
        Assert.assertNull("Deberia dar nulo, no hay ningun circuito relacionado con Tenerife en los circuitos de buscador", buscador.buscarCircuito("Tenerife"));
    }

    @Test
    public void buscarVehiculoCondicional1Test() {
        Vehiculo vehiculo = new Vehiculo("Mercedes-AMG F1 W13 E Performance", null, true, true, false);
        buscador.vehiculos.add(vehiculo);
        Assert.assertNotNull("No deberia dar nulo, el W13 esta incluido en los vehiculos de buscador", buscador.buscarVehiculo("W13"));
    }

    @Test
    public void buscarVehiculoCondicional2Test() {
        Assert.assertNull("Deberia dar nulo, no hay ningun coche de F1 llamado Clio en los vehiculos de buscador", buscador.buscarCircuito("Clio"));
    }
}
