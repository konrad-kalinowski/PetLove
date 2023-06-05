package pl.merito.petlove.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.merito.petlove.model.Pet;

public interface PetMatchRepository extends JpaRepository<Pet, Integer> {
}
