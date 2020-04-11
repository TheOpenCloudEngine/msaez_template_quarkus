forEach: Aggregate
fileName: {{namePascalCase}}Repository.java
path: {{boundedContext.name}}/{{{options.packagePath}}}
---

package {{options.package}};

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import java.util.List;
import java.util.Optional;

@Path("{{namePlural}}")
public class {{namePascalCase}}Resource {

    private final {{namePascalCase}}Repository {{nameCamelCase}}Repository;

    public {{namePascalCase}}Resource({{namePascalCase}}Repository {{nameCamelCase}}Repository) {
        this.{{nameCamelCase}}Repository = {{nameCamelCase}}Repository;
    }

    @GET
    @Produces("application/json")
    public Iterable<{{namePascalCase}}> findAll() {
        return {{nameCamelCase}}Repository.findAll();
    }


    @DELETE
    @Path("{id}")
    public void delete(@PathParam long id) {
        {{nameCamelCase}}Repository.deleteById(id);
    }

//    @POST
//    @Produces("application/json")
//    public Fruit create(@PathParam String name, @PathParam String color) {
//        return {{nameCamelCase}}Repository.save(new Fruit(name, color));
//    }


}
