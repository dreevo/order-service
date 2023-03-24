package com.polarbookshop.orderservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.net.URI;

@ConfigurationProperties(prefix = "polar")
@Component
@Slf4j
public class ClientProperties {

    @NotNull
    URI catalogServiceUri;

    private String message;

    public URI getCatalogServiceUri() {
        return catalogServiceUri;
    }

    public void setCatalogServiceUri(URI catalogServiceUri) {
        log.debug(this.getMessage());
        this.catalogServiceUri = catalogServiceUri;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
