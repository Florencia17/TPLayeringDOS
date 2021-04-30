package ar.unrn.tp3;

import ar.unrn.tp3.modelo.VerificarCumpleañosMail;
import ar.unrn.tp3.persistencia.RepositorioEmpleadosArchivo;
import ar.unrn.tp3.serviciomail.EnviarEmail;

public class Main {

    public static void main(String[] args) {
        new VerificarCumpleañosMail( new RepositorioEmpleadosArchivo("ArchivoDeEmpleados.txt"),
                new EnviarEmail()).verificarCumpleañosHoy();
    }
}
