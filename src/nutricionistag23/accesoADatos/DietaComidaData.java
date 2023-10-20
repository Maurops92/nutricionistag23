package nutricionistag23.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricionistag23.entidades.Comida;
import nutricionistag23.entidades.DiasEnum;
import nutricionistag23.entidades.DietaComida;
import nutricionistag23.entidades.HorariosEnum;

public class DietaComidaData {

    private Connection con = null;

    public DietaComidaData() {
        con = Conexion.conectarServidor();

    }

    public void guardarDietaComida(DietaComida dietaComida) {

        String sql = "INSERT INTO dietacomida (idComida, idDieta,horario,dia) VALUES (?,?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            ps.setString(3, dietaComida.getHorario().toString());
            ps.setString(4, dietaComida.getDia().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Comida agregada a la dieta " + dietaComida.getDieta().getNombre());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }

    public DietaComida buscarDietaComida(int idDieta, String horario, String dia) {
        ComidaData cData = new ComidaData();
        DietaData dData = new DietaData();
        String sql = "SELECT * FROM dietacomida WHERE idDieta=? AND horario=? AND dia=?";
        DietaComida dietacomida = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idDieta);
            ps.setString(2, horario);
            ps.setString(3, dia);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dietacomida = new DietaComida();
                dietacomida.setId(rs.getInt("idDietaComida"));
                dietacomida.setComida(cData.buscarComida(rs.getInt("idComida")));
                dietacomida.setDieta(dData.buscarDieta(rs.getInt("idDieta")));
                dietacomida.setHorario(HorariosEnum.valueOf(rs.getString("horario")));
                dietacomida.setDia(DiasEnum.valueOf(rs.getString("dia")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return dietacomida;
    }
    public DietaComida buscarDietaComida(int idDieta) {
        ComidaData cData = new ComidaData();
        DietaData dData = new DietaData();
        String sql = "SELECT * FROM dietacomida WHERE idDieta=?";
        DietaComida dietacomida = null;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                dietacomida = new DietaComida();
                dietacomida.setId(rs.getInt("idDietaComida"));
                dietacomida.setComida(cData.buscarComida(rs.getInt("idComida")));
                dietacomida.setDieta(dData.buscarDieta(rs.getInt("idDieta")));
                dietacomida.setHorario(HorariosEnum.valueOf(rs.getString("horario")));
                dietacomida.setDia(DiasEnum.valueOf(rs.getString("dia")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return dietacomida;
    }

    public void eliminarDietaComida(int idDieta, String horario, String dia) {
        String sql = "DELETE FROM dietacomida WHERE idDieta=? AND horario=? AND dia=?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idDieta);
            ps.setString(2, horario);
            ps.setString(3, dia);
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Consumo eliminado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Consumo no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }
    
    public void eliminarDietaComida(DietaComida dietaComida) {
        String sql = "DELETE FROM dietacomida WHERE idDietaComida=? ";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dietaComida.getId());
            if(ps.executeUpdate()==1){
                JOptionPane.showMessageDialog(null, "Consumo ya existente eliminado.");
            }else {
                JOptionPane.showMessageDialog(null, "Consumo no encontrado.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
    }
    
    public void modificarDietaComida(DietaComida dietaComida){
        String sql = "UPDATE dietaComida SET idComida=?, idDieta=?, horario=?, dia=? WHERE idDietaComida="+dietaComida.getId();
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dietaComida.getComida().getIdComida());
            ps.setInt(2, dietaComida.getDieta().getIdDieta());
            ps.setString(3, dietaComida.getHorario().toString());
            ps.setString(4, dietaComida.getDia().toString());
            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "DietaComida Modificada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "DietaComida no encontrada.");
            }
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        
    }
    
    public List<DietaComida> listarDietaComidaXDieta(int idDieta){
        List<DietaComida> listaDietaComida = new ArrayList <>();
        ComidaData cData=new ComidaData();
        DietaData dData=new DietaData();
        String sql="SELECT * FROM dietacomida WHERE idDieta="+idDieta;
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listaDietaComida.add(new DietaComida(rs.getInt("idDietaComida"), cData.buscarComida(rs.getInt("idComida")), dData.buscarDieta(rs.getInt("idDieta")), HorariosEnum.valueOf(rs.getString("Horario")), DiasEnum.valueOf(rs.getString("dia"))));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return listaDietaComida;
    }
    
    public List<DietaComida> listarDietaComidaXDia(int idDieta,String dia){
        List<DietaComida> listaDietaComida = new ArrayList <>();
        ComidaData cData=new ComidaData();
        DietaData dData=new DietaData();
        String sql="SELECT * FROM dietacomida WHERE idDieta=? AND dia=?";
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idDieta);
            ps.setString(2, dia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                listaDietaComida.add(new DietaComida(rs.getInt("idDietaComida"), cData.buscarComida(rs.getInt("idComida")), dData.buscarDieta(rs.getInt("idDieta")), HorariosEnum.valueOf(rs.getString("Horario")), DiasEnum.valueOf(rs.getString("dia"))));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }
        return listaDietaComida;
    }
    
}
