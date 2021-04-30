package ar.unrn.tp3.modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private String email;
    private LocalDate cumpleaños;

    public Empleado(String apellido, String nombre, String cumpleaños, String email) {


        if (validarDato(apellido)) {
            throw new RuntimeException("El apellido no puede ser vacio");
        }

        if (validarDato(nombre)) {
            throw new RuntimeException("El nombre no puede ser vacio");
        }


        if (validarDato(cumpleaños)) {
            throw new RuntimeException("la fecha no puede ser nula");
        }
        if (validarDato(email)) {
            throw new RuntimeException("El email no puede ser vacio");
        }
        //FECHA CUMPLEAÑOS LOCAL DATE

        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.cumpleaños = LocalDate.parse(cumpleaños, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    public boolean validarDato (String dato){
        return (dato.equals(""));
    }

    public boolean validadFecha (LocalDate fecha){
        return fecha == null;
    }

    public boolean cumpleaños(){
        LocalDate esHoy = LocalDate.now();
        return cumpleaños.getDayOfMonth() == esHoy.getDayOfMonth() && cumpleaños.getMonth().equals(esHoy.getMonth());
    }

    public String getEmail() {
        return email;
    }
}
