package es.iespuertodelacruz.gppuerto.controller;

public class Menus {

    public Menus(){}

    public String menuSinLoggerar() {

        String menu = "" +
                "1. Buscar por piloto\n" +
                "2. Buscar por vehiculo\n" +
                "3. Buscar por carrera\n" +
                "4. Buscar por circuito\n" +
                "5. Buscar por temporada\n" +
                "6. Iniciar Sesion \n" +
                "6. Registrarse \n";
        return menu;
    }

    public String menuPostLoggerar() {
        String menu = "" +
                "1. Buscar por piloto\n" +
                "2. Buscar por vehiculo\n" +
                "3. Buscar por carrera\n" +
                "4. Buscar por circuito\n" +
                "5. Buscar por temporada\n" +
                "6. Cerrar Sesion \n";
        return menu;
    }

    public String menuIniciarSesion() {            
        return  "Inicie sesión:\n";
    }

    public String menuRegistrarse() {
        return  "Registre a su nuevo usuario:\n";
    }

    public String usuario() {
        return "Inserte su usuario\n";
    }

    public String contraseña() {
        return "Inserte su contraseña\n";
    }

}
