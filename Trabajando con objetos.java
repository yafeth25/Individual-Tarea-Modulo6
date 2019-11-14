


public class estudiante {
​
public static void estudiante(String[] args) {
​
     
    Persona persona = new Persona();
    persona.setNombre("Walter");
    persona.setApellido("Sanchez");
    persona.setEdad (19);
    persona.setSexo ("M");
​
System.out.println("Nombre: " + persona.getNombre() );
System.out.println("apellido: " + persona.getApellido() );
System.out.println("Edad: " + persona.getEdad() );
System.out.println("Sexo: " + persona.getSexo() );
​
}