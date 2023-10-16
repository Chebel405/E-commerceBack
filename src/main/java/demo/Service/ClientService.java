package demo.Service;

import demo.Entity.Client;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;
@ComponentScan
public interface ClientService {
    Client createClient(Client client);

    List<Client> findAll();

    Optional<Client> findById(Long id);

    Client updateClient(Long id, Client client);

    Client save(Client client);

    void deleteClient(Long id);
}
