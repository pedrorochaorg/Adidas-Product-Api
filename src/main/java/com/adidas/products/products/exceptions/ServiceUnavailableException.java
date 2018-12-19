package com.adidas.products.products.exceptions;

import static com.adidas.products.products.common.messages.Rest.SERVICE_UNAVAILABLE;

/**
 * Exception thrown by a rest controller when a service can't be found .
 *
 * @author pedrorocha
 **/
public class ServiceUnavailableException extends RuntimeException {

    public ServiceUnavailableException() {
        super(SERVICE_UNAVAILABLE);
    }

}
