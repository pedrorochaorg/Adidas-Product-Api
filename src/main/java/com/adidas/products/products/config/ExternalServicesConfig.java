package com.adidas.products.products.config;

import com.adidas.products.products.config.models.ServiceConfig;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration class to load external services configurations.
 *
 * @author pedrorocha
 **/
@Data
@ToString
@Slf4j
@Configuration
@PropertySource("classpath:application.yaml")
@ConfigurationProperties(prefix = "spring")
public class ExternalServicesConfig {

    private List<ServiceConfig> externalServices;

    /**
     * Log's the current property values in the output log.
     */
    @PostConstruct
    public void log() {
        log.debug("ExternalServicesConfig: {}", externalServices.toString());
    }

    public ServiceConfig getService(String id) {
        if (id == null) {
            return null;
        }
        Optional<ServiceConfig> serviceOptional = externalServices.stream()
                .filter(item -> item.getName().equals(id))
                .findFirst();

        
        return serviceOptional.get();
    }
}
