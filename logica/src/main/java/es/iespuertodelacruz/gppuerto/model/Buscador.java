package es.iespuertodelacruz.gppuerto.model;

import java.util.ArrayList;

public class Buscador {
    Usuario usuario;
    ArrayList<Piloto> pilotos; 
    ArrayList<Equipo> equipos; 
    ArrayList<Vehiculo> vehiculos; 
    ArrayList<Circuito> circuitos;
    ArrayList<Carrera> carreras;
    ArrayList<Temporada> temporadas;

    /**
     * Constructor de la clase con 0 parametros
     */
    public Buscador() {
        usuario = null;
        pilotos = new ArrayList<>(); 
        equipos = new ArrayList<>(); 
        vehiculos = new ArrayList<>(); 
        carreras = new ArrayList<>();
        temporadas = new ArrayList<>();
        circuitos = new ArrayList<>();
    }

    /**
     * Metodo para iniciar sesion en la aplicacion
     * @param nombreUsuario El nombre del usuario
     * @param contrasena La contrasena del usuario
     */
    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        String[] usuarios = accederUsuarios();
        for (String strUsuario : usuarios) {
            String[] datosUsuario = strUsuario.split(";");
            if(datosUsuario[0].equals(nombreUsuario) && datosUsuario[1].equals(contrasena)) {
                this.usuario = new Usuario(nombreUsuario, contrasena);
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo para registrar un usuario en caso de que no exista
     */
    public boolean registrarse(String nombreUsuario, String contrasena) {
        String[] usuarios = accederUsuarios();
        for (String strUsuario : usuarios) {
            String[] datosUsuario = strUsuario.split(";");
            if(datosUsuario[0].equals(nombreUsuario)) {
                return false;
            }
        }
        String ficheroUsuarios = "";
        for (String strUsuarios : usuarios) {
            ficheroUsuarios += strUsuarios + "\n";
        }
        ficheroUsuarios += nombreUsuario + ";" + contrasena;
        escribirUsuarios(ficheroUsuarios);
        return true;
    }

    /**
     * Metodo para devolver los usuarios en diferentes Strings
     * @return Array de Strings con los usuarios
     */
    public String[] accederUsuarios() {
        GestorFichero gf = new GestorFichero("/tmp/usuarios.csv");
        String strUsuarios = gf.leerFichero();
        String[] splUsuarios = strUsuarios.split("\n");
        return splUsuarios;
    }

    /**
     * Metodo para escribir los usuarios en el fichero 
     * @param contenidoUsuarios
     * @return
     */
    public boolean escribirUsuarios(String contenidoUsuarios) {
        try {
            GestorFichero gf = new GestorFichero("/tmp/usuarios.csv");
            gf.escribirFichero(contenidoUsuarios);
        }catch(Exception ex) {
            return false;
        }
        return true;
    }

    /**
     * Metodo para obtener todos los posibles resultados de la busqueda del usuario.
     * Se compara el parametro de busqueda del usuario con el resultado de la suma del nombre y apellido 
     * del piloto. En caso de que esa suma contenga el parametro de busqueda, el piloto se incluira en el ArrayList resultado.
     * @param nombre del piloto
     * @return ArrayList con las busquedas coincidentes
     */
    public ArrayList<Piloto> buscarPiloto(String nombre) {
        nombre = nombre.toLowerCase();
        ArrayList<Piloto> posiblesResultados = new ArrayList<>();
        for (Piloto piloto : pilotos) {
            if((piloto.getNombre().toLowerCase() + " " + piloto.getApellido().toLowerCase()).contains(nombre)) {
                posiblesResultados.add(piloto);
            }
        }
        if(posiblesResultados.size() > 0) {
            return posiblesResultados;
        } else {
            return null;
        }
    }

    /**
     * Metodo para obtener todos los posibles resultados de la busqueda del usuario.
     * Se compara el parametro de busqueda del usuario con el nombre del equipo. 
     * En caso de que el nombre contenga con el parametro de busqueda, el equipo se incluira en el ArrayList resultado.
     * @param nombre del equipo
     * @return ArrayList con las busquedas coincidentes
     */
    public ArrayList<Equipo> buscarEquipo(String nombre) {
        nombre = nombre.toLowerCase();
        ArrayList<Equipo> posiblesResultados = new ArrayList<>();
        for (Equipo equipo : equipos) {
            if(equipo.nombre.contains(nombre)) {
                posiblesResultados.add(equipo);
            }
        }
        if(posiblesResultados.size() > 0) {
            return posiblesResultados;
        } else {
            return null;
        }
    }

    /**
     * Metodo para obtener todos los posibles resultados de la busqueda del usuario.
     * Se compara el parametro de busqueda del usuario con el anio de la temporada. 
     * En caso de que el parametro de busqueda coincida con el anio, la temporada se incluira en el ArrayList resultado.
     * @param anio de la temporada
     * @return ArrayList con las busquedas coincidentes
     */
    public ArrayList<Temporada> buscarTemporada(int anio) {
        ArrayList<Temporada> posiblesResultados = new ArrayList<>();
        for (Temporada temporada : temporadas) {
            if(temporada.getAnio() == anio) {
                posiblesResultados.add(temporada);
            }
        }
        if(posiblesResultados.size() > 0) {
            return posiblesResultados;
        } else {
            return null;
        }
    }

    /**
     * Metodo para obtener todos los posibles resultados de la busqueda del usuario.
     * Se compara el parametro de busqueda del usuario con el nombre del circuito. 
     * En caso de que el parametro de busqueda coincida con el nombre, el circuito se incluira en el ArrayList resultado.
     * @param nombre del circuito
     * @return ArrayList con las busquedas coincidentes
     */
    public ArrayList<Circuito> buscarCircuito(String nombre) {
        nombre = nombre.toLowerCase();
        ArrayList<Circuito> posiblesResultados = new ArrayList<>();
        for (Circuito circuito : circuitos) {
            if(circuito.getNombre().contains(nombre)) {
                posiblesResultados.add(circuito);
            }
        }
        if(posiblesResultados.size() > 0) {
            return posiblesResultados;
        } else {
            return null;
        }
    }

    /**
     * Metodo para obtener todos los posibles resultados de la busqueda del usuario.
     * Se compara el parametro de busqueda del usuario con el nombre del vehiculo. 
     * En caso de que el parametro de busqueda coincida con el nombre, el vehiculo se incluira en el ArrayList resultado.
     * @param nombre del vehiculo
     * @return ArrayList con las busquedas coincidentes
     */
    public ArrayList<Vehiculo> buscarVehiculo(String nombre) {
        nombre = nombre.toLowerCase();
        ArrayList<Vehiculo> posiblesResultados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if(vehiculo.getNombre().contains(nombre)) {
                posiblesResultados.add(vehiculo);
            }
        }
        if(posiblesResultados.size() > 0) {
            return posiblesResultados;
        } else {
            return null;
        }
    }
}
