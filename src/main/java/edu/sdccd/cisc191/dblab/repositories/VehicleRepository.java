package edu.sdccd.cisc191.dblab.repositories;

import edu.sdccd.cisc191.dblab.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository extends CrudRepository<Vehicle, String> {

}
