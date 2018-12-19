package com.adidas.products.products.config.models;

import com.adidas.products.products.config.enums.ServiceAuthConfigType;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Modular object to store Service Authentication Config values used for configurations purposes.
 *
 * @author pedrorocha
 **/
@Data
@ToString(callSuper = true)
@AllArgsConstructor
public class ServiceAuthConfig implements Serializable {

    private Boolean enabled;
    private String username;
    private String password;
    private String token;
    private ServiceAuthConfigType type;


    /**
     * Simplified constructor.
     */
    public ServiceAuthConfig() {
    }


}
