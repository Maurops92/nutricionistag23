package nutricionistag23.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricionistag23.entidades.Paciente;

public class PacienteData {

    private Connection con = null;

    public PacienteData() {
        con = Conexion.conectarServidor();

    }

    public void guardarPaciente(Paciente paciente) {

        String sql = "INSERT INTO paciente (nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, estatura)"
                + "VALUES (?,?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setDouble(6, paciente.getPesoDeseado());
            ps.setDouble(7, paciente.getEstatura());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente ingresado correctamente.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos.");
        }

    }

    public Paciente buscarPacienteXDni(int dni) {
        Paciente paciente = null;

        String sql = "SELECT * FROM paciente WHERE dni = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(dni);
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstatura(rs.getDouble("estatura"));
                paciente.setIdPaciente(rs.getInt("idPaciente"));

            } else {
                JOptionPane.showMessageDialog(null, "El paciente no se encontró");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return paciente;

    }
    
    public Paciente buscarPacienteXId(int id) {
        Paciente paciente = null;

        String sql = "SELECT * FROM paciente WHERE idPaciente = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(id);
                paciente.setDni(rs.getInt("dni"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoDeseado(rs.getDouble("pesoDeseado"));
                paciente.setEstatura(rs.getDouble("estatura"));

            } else {
                JOptionPane.showMessageDialog(null, "El paciente no se encontró");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return paciente;

    }

    public List<Paciente> listaPaciente() {
        List<Paciente> listaPacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listaPacientes.add(new Paciente(rs.getString("nombre"), rs.getInt("dni"), rs.getString("domicilio"),
                        rs.getString("telefono"), rs.getDouble("pesoActual"), rs.getDouble("pesoDeseado"), rs.getDouble("estatura")));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return listaPacientes;

    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET nombre=?,dni=?,domicilio=?,telefono=?,pesoActual=?,pesoDeseado=?,estatura=? WHERE dni=" + paciente.getDni();
        if (paciente.equals(buscarPacienteXDni(paciente.getDni()))) {
            JOptionPane.showMessageDialog(null, "No hubo modificacion");
        } else {
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, paciente.getNombre());
                ps.setInt(2, paciente.getDni());
                ps.setString(3, paciente.getDomicilio());
                ps.setString(4, paciente.getTelefono());
                ps.setDouble(5, paciente.getPesoActual());
                ps.setDouble(6, paciente.getPesoDeseado());
                ps.setDouble(7, paciente.getEstatura());
                if (ps.executeUpdate() == 1) {
                    JOptionPane.showMessageDialog(null, "Modificación exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "Paciente no encontrado");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + e.getMessage());
            }
        }

    }

}
