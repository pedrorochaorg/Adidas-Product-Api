package com.adidas.products.products.security;

import com.adidas.products.products.models.ErrorResponse;
import com.adidas.products.products.util.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.server.ServerAuthenticationEntryPoint;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * hanles error exceptions thrown by the authentication system.
 *
 * @author pedrorocha
 **/
@Slf4j
public class AuthenticationEntryPoint implements ServerAuthenticationEntryPoint {

    @Override
    public Mono<Void> commence(ServerWebExchange exchange, AuthenticationException e) {

        if (e != null) {
            return Response.replyWith(
                    exchange.getResponse(),
                    HttpStatus.UNAUTHORIZED,
                    new ErrorResponse(e.getMessage()));
        }
        return null;
    }
}
