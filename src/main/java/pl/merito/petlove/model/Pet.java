package pl.merito.petlove.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity(name = "Pet")
public class Pet {
    public enum Species {
        DOG, CAT, FISH, HAMSTER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",
            updatable = false)
    private Integer id;
    @Column(name = "name",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true)
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "species",
            nullable = false,
            columnDefinition = "TEXT")
    private Species species;
    @Column(name = "breed",
            nullable = false,
            columnDefinition = "TEXT")
    private String breed;
    @Column(name = "age",
            nullable = false)
    private int age;
    @Column(name = "description",
            nullable = false,
            columnDefinition = "TEXT")
    private String description;
    @Column(name = "picture_urls",
            nullable = false,
            columnDefinition = "TEXT")
    private String pictureUrls;

    public Pet(String name, Species species, int age, String breed, String description, String pictureUrls) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.breed = breed;
        this.description = description;
        this.pictureUrls = pictureUrls;
    }

    public Pet() {
    }

    public Integer getId() {
        return id;
    }

    public Species getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public String getDescription() {
        return description;
    }

    public String getPictureUrls() {
        return pictureUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && Objects.equals(name, pet.name) && Objects.equals(breed, pet.breed) && Objects.equals(description, pet.description) && Objects.equals(pictureUrls, pet.pictureUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, description, pictureUrls);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", description='" + description + '\'' +
                ", pictureUrls=" + pictureUrls +
                '}';
    }
}
