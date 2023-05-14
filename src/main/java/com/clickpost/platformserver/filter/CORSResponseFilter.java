package com.clickpost.platformserver.filter;

import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.MultivaluedMap;

public class CORSResponseFilter {
    public void filter(ContainerResponseContext responseContext) {
        MultivaluedMap<String, Object> headers = responseContext.getHeaders();
        headers.add("Access-Control-Allow-Origin", "*");
        headers.add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT,OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Authorization, Accept, auth-token");
    }
}
