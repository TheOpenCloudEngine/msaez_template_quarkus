forEach: Aggregate
fileName: {{namePascalCase}}Repository.java
path: {{boundedContext.name}}/{{{options.packagePath}}}
---
package {{options.package}};

import org.springframework.data.repository.JpaRepository;

public interface {{namePascalCase}}Repository extends JpaRepository<{{namePascalCase}}, {{aggregateRoot.keyFieldDescriptor.className}}>{

}