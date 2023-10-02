

package nutricionistag23;

import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.entidades.Paciente;


public class Nutricionistag23 {

    
    public static void main(String[] args) {
        
        PacienteData pData= new PacienteData();
        
       /* pData.guardarPaciente(new Paciente("Dario", 12345679,"Italia 987", "381-9346418", 110.5, 90, 1.85));
        pData.guardarPaciente(new Paciente("Marcos", 12345688,"Tucuman 654", "381-2351563", 70, 72, 1.65));
        pData.guardarPaciente(new Paciente("Carina", 12345689,"Paris 123", "381-9234561", 80, 55, 1.55));
        System.out.println(pData.buscarPaciente(12345678));*/
        //System.out.println(pData.listaPaciente());
        Paciente paciente= pData.buscarPaciente(12345678);
        paciente.setPesoActual(50);
        pData.modificarPaciente(paciente);
        

    }

}
