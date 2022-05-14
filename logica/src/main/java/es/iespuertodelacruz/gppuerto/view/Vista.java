package es.iespuertodelacruz.gppuerto.view;

import java.util.Scanner;

import es.iespuertodelacruz.gppuerto.controller.Menus;

public class Vista {

    public static void main(String[] args) {
        Menus menu = new Menus();
        String nombre;
        String contraseña;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(menu.menuSinLoggerar());
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                System.out.println("Busqueda por piloto");
                // Hay que poner los metodos para buscar por piloto
                    break;
                case "2":
                System.out.println("Busqueda por vehiculo");
                // Hay que poner los metodos para buscar por vehiculo
                    break;
                case "3":
                System.out.println("Busqueda por carrera");
                // Hay que poner los metodos para buscar por carrera
                    break;
                case "4":
                System.out.println("Busqueda por circuito");
                // Hay que poner los metodos para buscar por circuito
                    break;
                case "5":
                System.out.println("Busqueda por temporada");
                // Hay que poner los metodos para buscar por temporada
                    break;
                case "6":
                System.out.println(menu.menuIniciarSesion());
                System.out.println(menu.usuario());
                nombre = sc.nextLine();
                System.out.println(menu.contraseña());
                contraseña = sc.nextLine();
                if (nombre.equals("admin") && contraseña.equals("1234")){
                    System.out.println("Incio correcto");
                }
                    break;
                case "7":
                System.out.println(menu.menuRegistrarse());
                System.out.println(menu.usuario());
                nombre  = sc.nextLine();
                System.out.println(menu.contraseña());
                contraseña = sc.nextLine();
                if (nombre.equals("admin") && contraseña.equals("1234")){
                    System.out.println("Resgistro correcto");
                }
                    break;
                default:
                    break;
            }

        }
    }
}
