package demo.Configuration;

import demo.Repository.ProduitRepository;
import demo.Service.ProduitService;
import demo.ServiceImpl.ProduitServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProduitConfiguration {
    @Bean
    public ProduitService produitService(ProduitRepository produitRepository){
        return new ProduitServiceImpl(produitRepository);
    }
}
