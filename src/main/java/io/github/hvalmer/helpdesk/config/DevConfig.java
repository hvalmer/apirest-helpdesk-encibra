package io.github.hvalmer.helpdesk.config;

import io.github.hvalmer.helpdesk.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${spring.jpa.hibernate.dll-auto}")
    private  String value;

    public boolean instanciaDB(){
        if (value.equals("create")){
                this.dbService.instanciaDB();
        }
        return false;
    }
}
