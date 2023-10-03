
package nutricionistag23.entidades;

import java.util.ArrayList;
import java.util.List;



public class DietaComida {

    private int idDietaComida;
    private List<Comida> comida;
    private Dieta dieta;
    private HorariosEnum horarios;

    public DietaComida() {
        this.comida = new ArrayList<>() ;
    }

    public DietaComida(int idDietaComida, List<Comida> comida, Dieta dieta, HorariosEnum horarios) {
        this.idDietaComida = idDietaComida;
        this.comida = comida;
        this.dieta = dieta;
        this.horarios = horarios;
    }

    public DietaComida(List<Comida> comida, Dieta dieta, HorariosEnum horarios) {
        this.comida = comida;
        this.dieta = dieta;
        this.horarios = horarios;
    }

    public HorariosEnum getHorarios() {
        return horarios;
    }

    public void setHorarios(HorariosEnum horarios) {
        this.horarios = horarios;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public List<Comida> getComida() {
        return comida;
    }

    public void setComida(List<Comida> comida) {
        this.comida = comida;
    }

    

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return comida + ", "+ dieta;
    }
    
    


}
