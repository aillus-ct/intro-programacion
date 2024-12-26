package Main.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Main.Contacto;

public class ContactoQuerys {

    //private int idContacto;
        // metodo para insertar un contacto
        public void insertarContacto(Contacto contacto){
            String insertSQL = "INSERT INTO Contactos (nombre, apellido, celular, correo, fechaNacimiento, nombreProvincia, domicilio ) VALUES (?, ?, ?, ?, ?, ?, ?)";
    
            try (Connection conexion1 = Conexion1.obtenerConexion1()){
    
                PreparedStatement insertStmt = conexion1.prepareStatement(insertSQL); {
                //insertStmt.setInt(0, contacto.getIdContacto());
                insertStmt.setString(1, contacto.getNombre());
                insertStmt.setString(2, contacto.getApellido());
                insertStmt.setString(3, contacto.getCelular());
                insertStmt.setString(4, contacto.getCorreo());
                insertStmt.setString(5, contacto.getFechaNacimiento());
                insertStmt.setString(6, contacto.getProvincia());
                insertStmt.setString(7, contacto.getDomicilio());
    
                int rowsInserted = insertStmt.executeUpdate();
                System.out.println(rowsInserted);
                if (rowsInserted > 0){
                    System.out.println("El contacto se insertó correctamente");
                    } 
                }
                } catch (Exception e){
                e.printStackTrace();
            }
            
    }
        // metodo para actualizar un contacto
        public void actualizarContacto(Contacto contacto){
            String updateSQL = "UPDATE Contactos SET nombre = ?, apellido = ?, celular = ?, correo = ?, fechaNacimiento = ?, nombreProvincia = ?, domicilio = ? WHERE idContacto = ?";
            
            try (Connection conexion1 = Conexion1.obtenerConexion1()){
                PreparedStatement updateStmt = conexion1.prepareStatement(updateSQL);
                updateStmt.setString(1, contacto.getNombre());
                updateStmt.setString(2, contacto.getApellido());
                updateStmt.setString(3, contacto.getCelular());
                updateStmt.setString(4, contacto.getCorreo());
                updateStmt.setString(5, contacto.getFechaNacimiento());
                updateStmt.setString(6, contacto.getProvincia());
                updateStmt.setString(7, contacto.getDomicilio());
                updateStmt.setInt(8, contacto.getIdContacto());
                System.out.println(updateStmt.toString());
                int rowsUpdated = updateStmt.executeUpdate();
                System.out.println("Fila actualizada: " + rowsUpdated);
                if (rowsUpdated > 0){
                    System.out.println("El contacto se actualizó correctamente");
                } else {
                     System.out.println("No se pudo actualizar el contacto");
                }
            } catch (SQLException e){
                System.out.println("Error en la actualización: " + e.getMessage());
                e.printStackTrace();
            } 
            
        }
        // metodo para eliminar un contacto
        public void eliminarContacto(int idContacto){
            String deleteSQL = "DELETE FROM Contactos WHERE idContacto = ?";
            
            try (Connection conexion1 = Conexion1.obtenerConexion1()){
                if (conexion1 == null || conexion1.isClosed()) {
                    System.out.println("No se pudo establecer la conexión con la base de datos.");
                    return;
                }
                System.out.println("Conexión establecida.");
            
                PreparedStatement deleteStmt = conexion1.prepareStatement(deleteSQL);
                deleteStmt.setInt(1, idContacto);

                System.out.println("Ejecutando consulta: " + deleteSQL);
                System.out.println("ID proporcionado: " + idContacto);
    
                int rowsDeleted = deleteStmt.executeUpdate();
                System.out.println("Fila eliminada: " + rowsDeleted);
                
                if (rowsDeleted > 0){
                    System.out.println("El contacto se eliminó correctamente");
                } else {
                        System.out.println("El contacto no existe");
                }
            } catch (Exception e){
                 e.printStackTrace();
            }
        }
        // metodo para traer todos los contactos
        public List<Contacto> obtenerTodosLosContactos(){
            List<Contacto> contactos = new ArrayList<>();
    
            String selectSQL = "SELECT * FROM Contactos";
            try {
                Connection conexion1 = Conexion1.obtenerConexion1();
                Statement statement = conexion1.createStatement();
                ResultSet resultSet = statement.executeQuery(selectSQL);
    
                while (resultSet.next()){
                    //int idContacto = resultSet.getInt("idContacto");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String celular = resultSet.getString("celular");
                    String correo = resultSet.getString("correo");
                    String fechaNacimiento = resultSet.getString("fechaNacimiento");
                    String domicilio = resultSet.getString("domicilio");
                    String provincia = resultSet.getString("nombreProvincia");
    
                    Contacto contacto = new Contacto(0, nombre, apellido, celular, correo, fechaNacimiento, domicilio, provincia);
                contactos.add(contacto);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return contactos;
        }
    
        // verificar que no exista el celular o correo en la base antes de guardar
        public boolean existeContacto(String celular, String correo){
            String selectSQL = "SELECT COUNT(*) FROM Contactos WHERE celular = ? OR correo = ?";

            try (Connection conexion1 = Conexion1.obtenerConexion1();
                PreparedStatement selectStmt = conexion1.prepareStatement(selectSQL)){
                    selectStmt.setString(1, celular);
                    selectStmt.setString(2, correo);

                    try (ResultSet resultSet = selectStmt.executeQuery()){
                        if (resultSet.next()){
                            return resultSet.getInt(1) > 0;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
                    
            }
                return false;
        }
            
        // verificar la carga inicial de listaContactos para ver si no esta mal sincronizada
        public List<Contacto> cargarContactos() {
            System.out.println("Inicia la carga de contactos desde la base");
            List<Contacto> listaContactos = new ArrayList<>();
            String queryCarga = "SELECT idContacto, nombre, apellido, celular, correo, fechaNacimiento, domicilio, nombreProvincia FROM Contactos";
            try (Connection conexion1 = Conexion1.obtenerConexion1()){
                PreparedStatement stmt = conexion1.prepareStatement(queryCarga);
                ResultSet resultSet = stmt.executeQuery();

                while (resultSet.next()) {
                    int idContacto = resultSet.getInt("idContacto");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String celular = resultSet.getString("celular");
                    String correo = resultSet.getString("correo");
                    String fechaNacimiento = resultSet.getString("fechaNacimiento");
                    String domicilio = resultSet.getString("domicilio");
                    String provincia = resultSet.getString("nombreProvincia");
                    Contacto contacto = new Contacto();
                    contacto.setIdContacto(idContacto); // Faltaba configurar el ID
                    contacto.setNombre(nombre);
                    contacto.setApellido(apellido);
                    contacto.setCelular(celular);
                    contacto.setCorreo(correo);
                    contacto.setFechaNacimiento(fechaNacimiento);
                    contacto.setDomicilio(domicilio);
                    contacto.setProvincia(provincia);
                   
                    listaContactos.add(contacto);
                }
                System.out.println("Contactos cargados desde la base " + listaContactos.size());
                for (Contacto c : listaContactos) {
                    System.out.println("ID: " + c.getIdContacto() + ", Nombre: " + c.getNombre() + ", Celular: " + c.getCelular()
                    + ", Correo: " + c.getCorreo() + ", Fecha de nacimiento: " + c.getFechaNacimiento()
                    + ", Domicilio : " + c.getDomicilio() + ", nombreProvincia: " + c.getProvincia());    
                } 
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                    return listaContactos;
        }
        
        
     }
    
        


             
          

