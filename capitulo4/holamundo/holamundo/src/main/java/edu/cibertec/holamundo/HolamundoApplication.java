package edu.cibertec.holamundo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HolamundoApplication implements CommandLineRunner {

        @Autowired
        HolaMundoService holaMundoService;
        
        
    
	public static void main(String[] args) {
		SpringApplication.run(HolamundoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        holaMundoService.saludar();
    }

}
