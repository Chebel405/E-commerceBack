package demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Entity
@Getter
@Setter
@NoArgsConstructor
@SpringBootApplication
public class Client {
    @Id
    private Long id;
    public String Nom;
    public String Prenom;
    public String mail;
    public String motDePasse;

}
