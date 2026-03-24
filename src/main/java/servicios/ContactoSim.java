package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContactoSim implements InterfazContactoSim {
    private Map<Integer,DatosSolicitud> solicitudes;
    private static Random RANDOM;
    private List<Entidad> entidades;

    public ContactoSim(){
        this.solicitudes = new HashMap<>();
        this.RANDOM = new Random();
        this.entidades = new ArrayList<>();
        this.entidades.add( new Entidad(1,"Entidad 1","Descripción 1"));
        this.entidades.add( new Entidad(2,"Entidad 2","Descripción 2"));
        this.entidades.add( new Entidad(3,"Entidad 3","Descripción 3"));
    }
    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        if(sol==null){
            return -1;
        }
        int token = this.RANDOM.nextInt(100000);
        solicitudes.put(token,sol);
        return token;
    }
    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return new DatosSimulation();
    }
    @Override
    public List<Entidad> getEntities() {
        return this.entidades;
    }
    @Override
    public boolean isValidEntityId() {
        return true;
    }
}
