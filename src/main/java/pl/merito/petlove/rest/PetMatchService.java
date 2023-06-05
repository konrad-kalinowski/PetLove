package pl.merito.petlove.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.merito.petlove.model.Pet;

import java.util.List;
import java.util.Optional;

@Service
public class PetMatchService {
    private final PetMatchRepository petMatchRepository;

    @Autowired
    public PetMatchService(PetMatchRepository petMatchRepository) {
        this.petMatchRepository = petMatchRepository;
    }

    public List<Pet> getPets() {
        return petMatchRepository.findAll();
    }

    public Optional<Pet> getPetById(Integer id) {
        return petMatchRepository.findById(id);
    }

    public void deletePet(Integer id) {
        petMatchRepository.deleteById(id);
    }
}
