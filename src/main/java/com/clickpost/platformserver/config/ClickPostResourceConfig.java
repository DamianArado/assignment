package com.clickpost.platformserver.config;

import com.clickpost.platformserver.filter.CORSResponseFilter;
import com.clickpost.platformserver.inject.CommonBinder;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class ClickPostResourceConfig extends ResourceConfig {
    public ClickPostResourceConfig() {
        register(new CommonBinder());
        register(JacksonJaxbJsonProvider.class);
        register(MultiPartFeature.class);
        register(new CORSResponseFilter());
        packages(true, "com.clickpost.platformserver.resource", "com.fasterxml.jackson");
    }
}
