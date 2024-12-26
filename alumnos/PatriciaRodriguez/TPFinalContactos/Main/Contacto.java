package Main;

public class Contacto {
  private int idContacto;
  private String nombre;
  private String apellido;
  private String celular;
  private String correo;
  private String fechaNacimiento;
  private String domicilio;
  private String provincia;

  // Constructor sin id para los nuevos contactos
  public Contacto(String nombre, String apellido, String celular, String correo,  String fechaNacimiento, String domicilio, String provincia){
    this.nombre = nombre;
    this.apellido = apellido;
    this.celular = celular;
    this.correo = correo;
    this.fechaNacimiento = fechaNacimiento;
    this.domicilio = domicilio;
    this.provincia = provincia;
  }

  // Constructor con id para usarlo en editar y eliminar
  public Contacto(int idContacto, String nombre, String apellido, String celular, String correo, String fechaNacimiento, String domicilio, String provincia){
    this.idContacto = idContacto;
    this.nombre = nombre;
    this.apellido = apellido;
    this.celular = celular;
    this.correo = correo;
    this.fechaNacimiento = fechaNacimiento;
    this.domicilio = domicilio;
    this.provincia = provincia;
  }
  

public Contacto() {
    //TODO Auto-generated constructor stub
  }

  // Getter y setter
  public int getIdContacto() {
    return idContacto;
    }
  public String getNombre() {
    return nombre;
  }
  public String getApellido() {
    return apellido;
  }
  
  public String getCelular() {
    return celular;
  }
  public String getCorreo() {
    return correo;
  }
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public String getDomicilio() {
    return domicilio;
  }
  public String getProvincia() {
    return provincia;
  }
  
  public void setIdContacto(int idContacto) {
    this.idContacto = idContacto;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }
  public void setCorreo(String correo) {
    this.correo = correo;
  }
  public void setFechaNacimiento(String fechaNacimiento){
    this.fechaNacimiento = fechaNacimiento;
  }
  public void setDomicilio(String domicilio){
    this.domicilio = domicilio;
  }
  public void setProvincia(String provincia){
    this.provincia = provincia;
  }



  // Métodos para agregar, editar, eliminar y mostrar un contacto.
  public static void agregarContacto(Contacto nuevoContacto){
    System.out.println("¡Contacto agregado exitosamente!");
  }
  public static void editarContacto(){
    System.out.println("¡Contacto editado exitosamente!");
  }
  public static void eliminarContacto(){
    System.out.println("¡Contacto eliminado exitosamente!");
  }
  
  public String mostrarContacto(){
    return "Nombre: " + nombre + "\n" +
            "Apellido: " + apellido + "\n" +
            "Celular: " + celular + "\n" +
            "Correo electrónico: " + correo + "\n" + 
            "Fecha de nacimiento: " + fechaNacimiento + "\n" +
            "Domicilio: " + domicilio + "\n" +
            "Provincia: " + provincia + "\n";
  }

public boolean contains(Contacto contacto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
}

  

}
