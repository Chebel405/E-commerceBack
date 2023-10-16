package com.ServiceImpl;

import com.Entity.Produit;
import com.Repository.ProduitRepository;
import com.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;
    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit createProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }
    @Override
    public Optional<Produit> findById(Long id){
        return Optional.ofNullable(produitRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND)));
    }
    @Override
    public Produit save(Produit produit){
        return produitRepository.save(produit);
    }
    
    @Override
    public void deleteById(Long id){
        produitRepository.deleteById(id);
    }
    @Override
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit produit){
        Optional<Produit> optionalProduit = produitRepository.findById(id);
        if (optionalProduit.isPresent()){
            Produit existeProduit = optionalProduit.get();
            existeProduit.setNom(produit.getNom());
            existeProduit.setImage(produit.getImage());
            existeProduit.setPrix(produit.getPrix());
            existeProduit.setType(produit.getType());
            return produitRepository.save(existeProduit);
        }
        return produit;
    }
    


}
