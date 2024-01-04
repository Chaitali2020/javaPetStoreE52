package com.petstore.petstore1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetServiceLogic implements PetService{
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public void savePet(Pet pet) {
		// TODO Auto-generated method stub
		this.petRepository.save(pet);
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return this.petRepository.findAll();
	}

	@Override
	public Pet getPetByID(Long id) {
		return this.petRepository.findById(id).orElse(null);
	}
	
	@Override
	public void deletePetById(Long id) {
		this.petRepository.deleteById(id);
	}
}
