package jgu.weka.api.impl;

import jgu.weka.api.ApiService;
import jgu.weka.api.NotFoundException;
import org.apache.commons.io.IOUtils;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-09-11T12:03:46.572Z")
public class ApiImpl extends ApiService {

    @Override
    public Response apiApiJsonGet(SecurityContext securityContext, UriInfo ui) throws NotFoundException, IOException {

        InputStream in = new URL( ui.getBaseUri() + "swagger.json" ).openStream();
        String jsonContent;
        try {
            jsonContent = new String(IOUtils.toString(in, "UTF-8"));
        } finally {
            IOUtils.closeQuietly(in);
        }

        return Response.ok(jsonContent).build();
    }
}