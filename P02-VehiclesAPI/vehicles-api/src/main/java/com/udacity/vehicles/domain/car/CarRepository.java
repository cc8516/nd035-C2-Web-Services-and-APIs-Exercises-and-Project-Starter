package com.udacity.vehicles.domain.car;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
