import ar.unrn.tp3.modelo.Empleado;
import ar.unrn.tp3.modelo.VerificarCumpleañosMail;
import ar.unrn.tp3.persistencia.RepositorioEmpleadosArchivoDeTest;
import ar.unrn.tp3.serviciomail.EnviarEmailTest;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class VerificarCumpleañosTest {

  @Test
    public void verificarCumpleañosHoyTest(){

      LocalDate fecha;
      VerificarCumpleañosMail verificarCumpleañosMail;
      EnviarEmailTest enviarEmailTest= new EnviarEmailTest();
      List<Empleado> empleados = new ArrayList<>();
      empleados.add(new Empleado("Malacarne", "Florencia", FechaActual(), "flormalacarne@gmail.com"));
      empleados.add(new Empleado("Garcia", "Martina", FechaActual(), "martina10garcia@gmail.com"));
      verificarCumpleañosMail = new VerificarCumpleañosMail(new RepositorioEmpleadosArchivoDeTest(empleados), enviarEmailTest);
      verificarCumpleañosMail.verificarCumpleañosHoy();

      assertTrue(enviarEmailTest.EnvioCorrecto("flormalacarne@gmail.com"));
    }

    public String FechaActual(){
      return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }
}
