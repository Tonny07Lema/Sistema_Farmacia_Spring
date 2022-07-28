package ups.edu.ec.Sistema_Farmacia_S;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SistemaFarmaciaSApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(SistemaFarmaciaSApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SistemaFarmaciaSApplication.class, args);
    }

}
