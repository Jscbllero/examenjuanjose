package org.example;

import org.example.Modelos.Area;
import org.example.Modelos.Beneficiario;
import org.example.Modelos.Empleado;
import org.example.Modelos.Sucursal;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Centro de informacion");
        System.out.println("**************************");

        System.out.println("\n Bienvenido");


        Scanner lea = new Scanner(System.in);
        Area area = new Area();
        Beneficiario beneficiario = new Beneficiario("Juan", "Pérez", 12345678.0, "Calle Falsa 123", 987654321, "juan.perez@example.com", LocalDate.of(1990, 5, 15), "Soltero", "3");
        /*Nomina nomina = new Nomina();*/


        /*System.out.print("Digitar id: ");
        area.setId(lea.nextLine());*/

        System.out.print("Digitar Nombre del Área: ");
        area.setNombreArea(lea.nextLine());

        System.out.println("Digitar puesto de cargo: ");
        area.setPuestoCargo(lea.nextLine());

        System.out.print("Digitar tipo de empleo: ");
        area.setTipoEmpleo(lea.nextLine());

        System.out.print("Digitar experiencia en el sector: ");
        area.setExperienciaSector(lea.nextLine());

        System.out.print("Digitar disponibilidad laboral: ");
        area.setDisponibilidadLaboral(lea.nextLine());

        System.out.print("Digitar si tiene flexibilidad en el horario: ");
        area.setFlexibilidadHorario(lea.nextLine());

        System.out.print("Digitar numero oficina: ");
        area.setNumeroOficinas(Double.valueOf(lea.nextLine()));

        System.out.print("Digitar jefe a cargo: ");
        area.setJefeCargo(lea.nextLine());

        System.out.print("Digitar tipo de sucursal: ");
        area.setTipoSucursal(lea.nextLine());

        /*System.out.print("Digitar id: ");
        beneficiario.setId(lea.nextLine());*/

        System.out.print("Digitar nombre: ");
        beneficiario.setNombre(lea.nextLine());

        System.out.print("Digitar apellido: ");
        beneficiario.setApellido(lea.nextLine());

        System.out.print("Digitar numero identificacion: ");
        beneficiario.setNumeroIdentificacion(Double.valueOf(lea.nextLine()));

        System.out.print("Digitar direccion: ");
        beneficiario.setDireccion(lea.nextLine());

        System.out.print("Digitar telefono: ");
        beneficiario.setTelefono(Integer.valueOf(lea.nextLine()));

        System.out.print("Digitar correo: ");
        beneficiario.setCorreo(lea.nextLine());

        System.out.print("Digitar fecha de nacimento: ");
        beneficiario.setFechaNacimiento(LocalDate.parse(lea.nextLine()));

        System.out.print("Digitar estado civil: ");
        beneficiario.setEstadoCivil(lea.nextLine());

        System.out.print("Digitar personas a cargo: ");
        beneficiario.setPersonasCargo(lea.nextLine());

        Area area1 = new Area();
        Area area2 = new Area("Josue","Asesor","tiempo completo","5 anos","Si","fines de semana",3D, "Rogelio B.", "pequena");

        Beneficiario beneficiario1 = new Beneficiario();
        Beneficiario beneficiario2 = new Beneficiario("Juan","Pérez",12345678.0,"Calle Falsa 123",987654321,"juan.perez@example.com",LocalDate.of(1990, 5, 15), "Soltero", "3");

        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(4l,"Maria","Avenida Siempre Viva 456",LocalDate.of(1985, 3, 22),LocalDate.of(2000, 7, 15),45673452, "casado","titulo","5 ano","comunicacion","Rafael","fines de semana", "Certificado de Excel",2500.00);

        Sucursal sucursal1 = new Sucursal();
        Sucursal sucursal2 = new Sucursal("Sucursal Centro","Calle Principal 789",123456789,"sucursal.centro@example.com","Ventas, Atención al cliente",987654321.0,"Carlos Martínez", "10",9);














    }
}