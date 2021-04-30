package ar.unrn.tp3.persistencia;

import ar.unrn.tp3.modelo.Empleado;
import ar.unrn.tp3.modelo.RepositorioEmpleado;

import java.util.List;

public class RepositorioEmpleadosArchivoDeTest implements RepositorioEmpleado {

    private List<Empleado> empleados;

    public RepositorioEmpleadosArchivoDeTest(List<Empleado> empleados){
        this.empleados= empleados;
    }

    public List<Empleado> recuperarListaEmpleados(){
        return empleados;
    }


}
