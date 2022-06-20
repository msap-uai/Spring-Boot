package com.example.demo.WebRPC;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
//Los repositorios Spring Data JPA son interfaces con métodos que admiten la creación,
// lectura, actualización y eliminación de registros en un almacén de datos de back-end.
//Hay múltiples implementaciones de repositorio además de JPA. Puede usar Spring Data MongoDB,
// Spring Data GemFire, Spring Data Cassandra, etc. Para este tutorial, nos quedaremos con JPA.