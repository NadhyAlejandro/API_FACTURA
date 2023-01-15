package facturacion.api_factura.factura;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {

    public List<Factura> findAll();
    
}