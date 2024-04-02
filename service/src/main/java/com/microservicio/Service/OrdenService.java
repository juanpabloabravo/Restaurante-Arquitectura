

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenService {

    @Autowired
    private OrdenRepository ordenRepository;
    @Autowired
    private DetalleOrdenRepository detalleOrdenRepository;

    public void crearOrden(Orden orden) {
        ordenRepository.save(orden);
        for (DetalleOrden detalle : orden.getDetalles()) {
            detalle.setOrden(orden);
            detalleOrdenRepository.save(detalle);
        }
    }

    public List<Orden> obtenerTodasLasOrdenes() {
        return ordenRepository.findAll();
    }

    public Orden obtenerOrdenPorId(Long id) {
        return ordenRepository.findById(id).orElse(null);
    }

    public void actualizarEstadoOrden(Long id, String estado) {
        Orden orden = ordenRepository.findById(id).orElse(null);
        if (orden != null) {
            orden.setEstado(estado);
            ordenRepository.save(orden);
        }
    }

}

