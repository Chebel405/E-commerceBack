package com.Controller;

import com.Entity.Produit;
import com.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produits")
@CrossOrigin(origins = "http://localhost:3000")
public class ProduitController {
    @Autowired
    private final ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping("")
    public List<Produit> findAll() {
        return produitService.findAll();
    }
    @GetMapping("")
    public Optional<Produit> findById(@PathVariable Long id) { return produitService.findById(id);

    }
    @PostMapping("/")
    public Produit createProduit(@RequestBody Produit produit ){
        return produitService.createProduit(produit);
    }

    @PutMapping("/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit produit ){
        return produitService.updateProduit(id, produit);
    }
    @PostMapping("")
    public Produit save(@RequestBody Produit produit){
        return produitService.save(produit);
    }

    @DeleteMapping("/{id}")
    public void deleteProduit(@PathVariable Long id){
        produitService.deleteById(id);}
}
