package com.miempresa.miproyecto;

import com.miempresa.lib.Validator;
import com.miempresa.miproyecto.dominio.Cliente;
import com.miempresa.miproyecto.servicios.Email;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Email email = new Email();
        Validator validator = new Validator();
        if(validator.is_email(cliente.getEmail())){
            email.send(cliente);
        }
    }
}