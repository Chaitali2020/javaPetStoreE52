package com.petstore.petstore1;

import java.util.List;

public interface PetService {
	
	void savePet(Pet pet);
	List<Pet> getAllPets();
	
	void deletePetById(Long id);
	Pet getPetByID(Long id);	
}
