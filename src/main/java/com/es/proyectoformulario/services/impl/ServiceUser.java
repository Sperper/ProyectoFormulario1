package com.es.proyectoformulario.services.impl;

import com.es.proyectoformulario.model.User;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceUser {

    // ATRIBUTOS
    private ArrayList<User> users; // Contiene todos los registros del fichero users.txt
    private GestionFicheroUser gestionUser; // gestion es un objeto para poder llamar a los métodos de GestionFicheroUser
    private ServiceLogger logger;

    private String ruta = "src/main/resources/users/users.txt";

    public ServiceUser() {
        this.users = new ArrayList<>();
        this.gestionUser = new GestionFicheroUser();
        leerFicheroUsers();
        this.logger = new ServiceLogger();
    }

    /*
    public boolean altaUser(User usuario) {
        // Longitud max de todos los campos 20
        // NO pueden contener el simbolo :
        // El idUser no está repetido

        Pattern patVerificar = Pattern.compile("\\w{1,20}");
        Matcher checkIdUser = patVerificar.matcher(usuario.getId());
        Matcher checkUser = patVerificar.matcher(usuario.getName());
        Matcher checkPass = patVerificar.matcher(usuario.getPass());

        if (checkIdUser.find()) {
            if (checkUser.find()) {
                if (checkPass.find()) {

                }
            }
        }

    }
    */
    public boolean checkUser(String idUser, String password) {
        for (int i = 0; i < this.users.size(); i++) {
            User usuario = this.users.get(i); // usuario es el elemento de la posicion i de users
            if (usuario.getId().equalsIgnoreCase(idUser) && usuario.getPass().equals(password)) {
                this.logger.registrarLog(idUser, "LOGIN", "OK");
                return true;
            }
        }
        this.logger.registrarLog(idUser, "LOGIN", "NOT OK");
        return false;
    }

    public boolean userExists(String idUser) {
        return this.users.stream().anyMatch(user -> user.getId().equalsIgnoreCase(idUser));
    }

    public String mostrarDatosUser(String idUser){
        String mostrar = "";
        for (int i = 0;i<users.size();i++) {
            if (idUser.equalsIgnoreCase(users.get(i).getId())) {
                mostrar = "IdUser: "+users.get(i).getId()+"\n"+
                        "User: "+users.get(i).getName()+"\n"+
                        "Pass: "+users.get(i).getPass()+"\n";
            }
        }
        return mostrar;
    }

    public void leerFicheroUsers() {
        this.users = gestionUser.leerFichero(this.ruta);
    }

    public void anadirFicheroUsers(User u) {
        gestionUser.anadirFichero(u, this.ruta);
    }

    public void modificarFicheroUsers() {
        gestionUser.modificarFichero(this.users, this.ruta);
    }

}
