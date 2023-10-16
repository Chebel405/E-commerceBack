package com.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@EntityScan
@Getter
@Setter
@NoArgsConstructor
@SpringBootApplication
@Entity
public class Produit {

    private Long id;
    public String Nom;
    public String Image;
    public Double Prix;
    public String Type;


}
