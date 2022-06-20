package com.example.demo.WebRestFull;


import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.util.List;



@RestController
@RequestMapping("/EmployeeRest")
class EmployeeRestController {

    private final EmployeeRestRepository repositoryRest;//inyeccion del repositorio

    EmployeeRestController(EmployeeRestRepository repositoryRest) {
        this.repositoryRest = repositoryRest;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/employees")
    List<EmployeeRest> all() {
        return repositoryRest.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/employees")
    EmployeeRest newEmployee(@RequestBody EmployeeRest newEmployeeRest) {
        return repositoryRest.save(newEmployeeRest);
    }

    // Single item

    @GetMapping("/employees/{id}")
    EmployeeRest ones(@PathVariable Long id) {

        return repositoryRest.findById(id)
                .orElseThrow(() -> new EmployeeRestNotFoundException(id));
        //es una excepción que se utiliza para indicar cuándo se busca un empleado pero no se encuentra.
    }

        @PutMapping("/employees/{id}")
    EmployeeRest replaceEmployee(@RequestBody EmployeeRest newEmployee, @PathVariable Long id) {

        return repositoryRest.findById(id)
                .map(employee -> {
                    employee.setName2(newEmployee.getName2());
                    employee.setRole2(newEmployee.getRole2());
                    return repositoryRest.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repositoryRest.save(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repositoryRest.deleteById(id);
    }

    //make ir Rest


    @GetMapping("/employees/{id}")
    EntityModel<EmployeeRest> one(@PathVariable Long id) {

        EmployeeRest employee = repositoryRest.findById(id) //
                .orElseThrow(() -> new EmployeeRestNotFoundException(id));

        return EntityModel.of(employee, //
                linkTo(methodOn(EmployeeRestController.class).one(id)).withSelfRel(),
                linkTo(methodOn(EmployeeRestController.class).all()).withRel("employees"));
    }
}
