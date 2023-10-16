package demo.Configuration;


import demo.Repository.ClientRepository;
import demo.Service.ClientService;
import demo.ServiceImpl.ClientServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ClientConfiguration {
    @Bean
    public ClientService clientService(ClientRepository clientRepository){
        return new ClientServiceImpl(clientRepository);
    }
}
