package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Cars;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Nov 2, 2023
 */
@Repository
public interface CarsRepository extends JpaRepository<Cars, Long>{

}
