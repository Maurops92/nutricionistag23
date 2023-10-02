
package nutricionistag23.entidades;

import java.util.ArrayList;
import java.util.List;



public class DietaComida {

    private int idDietaComida;
    private List<Comida> comida;
    private Dieta dieta;

    public DietaComida() {
        this.comida = new ArrayList<>() ;
    }

    public DietaComida(int idDietaComida, List<Comida> comida, Dieta dieta) {
        this.idDietaComida = idDietaComida;
        this.comida = comida ;
        this.dieta = dieta;
    }

    public DietaComida(List<Comida> comida, Dieta dieta) {
        this.comida = comida;
        this.dieta = dieta;
    }
    
    

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
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
