package ar.unrn.tp3.serviciomail;

import ar.unrn.tp3.modelo.Empleado;
import ar.unrn.tp3.modelo.EnviarEmailInterfase;

public class EnviarEmailTest implements EnviarEmailInterfase {

    private String email;

    public void enviarEmail (Empleado empleado){
        email = email+empleado.getEmail();
    }

    public boolean EnvioCorrecto(String mensaje){
        return this.email.contains(mensaje);
    }

}
