package com.petstore.petstore1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long>{
	
	

}
