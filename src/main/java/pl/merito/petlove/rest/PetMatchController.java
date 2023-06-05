package pl.merito.petlove.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.merito.petlove.model.Pet;

import java.util.List;

@RestController
@RequestMapping("/match")
public class PetMatchController {
    private final PetMatchService petMatchService;

    public PetMatchController(PetMatchService petMatchService) {
        this.petMatchService = petMatchService;
    }

    @GetMapping
    public List<Pet> getMatches() {
       return petMatchService.getPets();
    }


}
