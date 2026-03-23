package servicios;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoSim implements InterfazContactoSim {
    @Override
    public int solicitarSimulation(DatosSolicitud sol) {
        return 0;
    }

    @Override
    public DatosSimulation descargarDatos(int ticket) {
        return null;
    }

    @Override
    public List<Entidad> getEntities() {
        return List.of();
    }

    @Override
    public boolean isValidEntityId() {
        return false;
    }
}
