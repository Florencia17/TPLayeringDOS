package ar.unrn.tp3.serviciomail;

import ar.unrn.tp3.modelo.Empleado;
import ar.unrn.tp3.modelo.EnviarEmailInterfase;

public class EnviarEmail implements EnviarEmailInterfase {
    @Override
    public void enviarEmail(Empleado empleado) {
        try {
            new Email(empleado.getEmail(), "Felicitaciones", "¡Feliz cumpleaños!").enviar();
        }catch (SmtpException e){
            throw new RuntimeException(" ");
        }
    }
}
