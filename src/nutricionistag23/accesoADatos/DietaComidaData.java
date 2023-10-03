package nutricionistag23.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import nutricionistag23.entidades.Comida;
import nutricionistag23.entidades.DietaComida;

public class DietaComidaData {

    private Connection con = null;

    public DietaComidaData() {
        con = Conexion.conectarServidor();

    }
    
    public void guardarDietaComida (DietaComida dietaComida){
        
        String sql = "INSERT INTO dietacomida (idComida, idDieta,horario) VALUES (?,?,?)";
        
        try (PreparedStatement ps = con.prepareStatement(sql)){
            
            for (Comida comida: dietaComida.getComida()){
                ps.setInt(1,comida.getIdComida());
                ps.executeUpdate();
            }
            JOptionPane.showMessageDialog(null, "Comidas Agregadas");
            
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        
    }
    
    
    
    

}
