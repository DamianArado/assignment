package com.clickpost.platformserver.config;

import com.clickpost.platformserver.filter.CORSResponseFilter;
import com.clickpost.platformserver.inject.CommonBinder;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * The type Click post resource config.
 */
public class ClickPostResourceConfig extends ResourceConfig {
    /**
     * Instantiates a new Click post resource config.
     */
    public ClickPostResourceConfig() {
        register(new CommonBinder());
        register(JacksonJaxbJsonProvider.class);
        register(MultiPartFeature.class);
        register(new CORSResponseFilter());
        packages(true, "com.clickpost.platformserver.resource", "com.fasterxml.jackson");
    }
}
