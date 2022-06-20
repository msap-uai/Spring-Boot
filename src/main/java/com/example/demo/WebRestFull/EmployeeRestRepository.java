package com.example.demo.WebRestFull;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRestRepository extends JpaRepository<EmployeeRest, Long> {

}