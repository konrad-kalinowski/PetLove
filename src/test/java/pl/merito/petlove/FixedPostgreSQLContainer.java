package pl.merito.petlove;

import org.testcontainers.containers.PostgreSQLContainer;

public class FixedPostgreSQLContainer extends PostgreSQLContainer {
    public FixedPostgreSQLContainer(String dockerImageName) {
        super(dockerImageName);
    }
    public FixedPostgreSQLContainer configurePort() {
        super.addFixedExposedPort(54321, 5432);
        return this;
    }
}
