

package nutricionistag23;

import nutricionistag23.accesoADatos.ComidaData;
import nutricionistag23.accesoADatos.PacienteData;
import nutricionistag23.entidades.Comida;
import nutricionistag23.entidades.Paciente;


public class Nutricionistag23 {

    
    public static void main(String[] args) {
        
        PacienteData pData= new PacienteData();
        ComidaData cData= new ComidaData();
        //pData.guardarPaciente(new Paciente("Marcos", 78912348,"alemania 987", "381-9789789", 75, 90, 1.55));
        /*pData.guardarPaciente(new Paciente("Marcos", 12345688,"Tucuman 654", "381-2351563", 70, 72, 1.65));
        pData.guardarPaciente(new Paciente("Carina", 12345689,"Paris 123", "381-9234561", 80, 55, 1.55));
        System.out.println(pData.buscarPaciente(12345678));*/
        //System.out.println(pData.listaPaciente());
        //Paciente paciente= pData.buscarPaciente(12345678);
        //paciente.setPesoActual(50);
        //pData.modificarPaciente(paciente);
        
        //cData.guardaComida(new Comida("Merluza", "filet de merluza de 400 gr", 200));
        //cData.borrarComida(1);
        System.out.println( cData.buscarComida(2));
    }

}
