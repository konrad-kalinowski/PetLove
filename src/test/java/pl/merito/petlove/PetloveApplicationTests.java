package pl.merito.petlove;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class PetloveApplicationTests {

    private static FixedPostgreSQLContainer postgres;

    @BeforeAll
    public static void setup() {
        postgres = new FixedPostgreSQLContainer("postgres");
        postgres.configurePort().withDatabaseName("petlove");
        postgres.start();
    }

    @AfterAll
    public static void clear() {
        postgres.close();
    }

    @Test
    void contextLoads() {
        System.out.println("cos");
    }

}
