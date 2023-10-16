package demo.Service;

import demo.Entity.Produit;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;
@ComponentScan
public interface ProduitService {
     List<Produit> findAll();

    Optional<Produit> findById(Long id);

    Produit createProduit(Produit produit);

    Produit updateProduit(Long id, Produit produit);

    Produit save(Produit produit);

    void deleteById(Long id);
}
