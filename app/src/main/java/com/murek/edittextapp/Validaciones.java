package com.murek.edittextapp;

public class Validaciones {

    public static boolean validarNombre(String nombre) {
        return nombre != null && !nombre.isEmpty() && nombre.length() > 3;
    }

    public static boolean validarPassword(String password) {
        if (password.isEmpty()) {
            return false;
        }
        if (password.length() <= 3) {
            return false;
        }
        return true;
    }
}

