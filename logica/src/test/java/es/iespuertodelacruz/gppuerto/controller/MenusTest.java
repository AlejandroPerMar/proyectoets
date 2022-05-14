package es.iespuertodelacruz.gppuerto.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MenusTest {
    Menus menu;

    @Before
    public void contructor() {
        if (menu == null) {
            menu = new Menus();
        }
    }

    @Test
    public void contructorTest() {
        Assert.assertNotNull("El objeto es nulo.", menu);
    }

    @Test
    public void menuSinLoggearTest() {
        Assert.assertNotNull(menu.menuSinLoggerar());
    }

    @Test
    public void menuPostLoggearTest() {
        Assert.assertNotNull(menu.menuPostLoggerar());
    }

    @Test
    public void menuIniciarSesionTest() {
        Assert.assertNotNull(menu.menuIniciarSesion());    }

    @Test
    public void menuRegistrarseTest() {
        Assert.assertNotNull(menu.menuRegistrarse());    }

    @Test
    public void usuarioTest() {
        Assert.assertNotNull(menu.usuario());    }

    @Test
    public void contraseñaTest() {
        Assert.assertNotNull(menu.contraseña());    }

}
