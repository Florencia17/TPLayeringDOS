package ar.unrn.tp3;

import ar.unrn.tp3.modelo.VerificarCumpleaĆ±osMail;
import ar.unrn.tp3.persistencia.RepositorioEmpleadosArchivo;
import ar.unrn.tp3.serviciomail.EnviarEmail;

public class Main {

    public static void main(String[] args) {
        new VerificarCumpleaĆ±osMail( new RepositorioEmpleadosArchivo("ArchivoDeEmpleados.txt"),
                new EnviarEmail()).verificarCumpleaĆ±osHoy();
    }
}
