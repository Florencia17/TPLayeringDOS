package ar.unrn.tp3.modelo;

import java.util.List;

public class VerificarCumpleañosMail {

    private final RepositorioEmpleado repositorioEmpleado;
    private final EnviarEmailInterfase enviarMail;

    public VerificarCumpleañosMail(RepositorioEmpleado repositorioEmpleadoA, EnviarEmailInterfase enviarMailA){
        repositorioEmpleado= repositorioEmpleadoA;
        enviarMail= enviarMailA;
    }

    public void verificarCumpleañosHoy(){
        List<Empleado> empleadosList;

        empleadosList = repositorioEmpleado.recuperarListaEmpleados();
        for (Empleado empleado : empleadosList){
            if (empleado.cumpleaños()){
                enviarMail.enviarEmail(empleado);
            }
        }
    }
}
