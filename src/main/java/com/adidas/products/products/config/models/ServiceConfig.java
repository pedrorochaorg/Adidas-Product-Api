package com.adidas.products.products.config.models;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Modular object to store ApiKey values used for configurations purposes.
 *
 * @author pedrorocha
 **/
@Data
@ToString(callSuper = true)
@AllArgsConstructor
public class ServiceConfig implements Serializable {

    private String name;
    private String url;
    private ServiceAuthConfig auth;


    /**
     * Simplified constructor.
     */
    public ServiceConfig() {
    }


}
