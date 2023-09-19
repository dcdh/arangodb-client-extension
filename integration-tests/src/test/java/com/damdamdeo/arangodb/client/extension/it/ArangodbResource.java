package com.damdamdeo.arangodb.client.extension.it;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.utility.DockerImageName;

import java.util.Map;

public class ArangodbResource implements QuarkusTestResourceLifecycleManager {

    public static final String ARANGODB_DEFAULT_IMAGE = "arangodb@sha256:085b45e8c56d5d4114e409482694d40fc8d1678c6b5d98d774bab31193034d6a";

    static GenericContainer<?> server = new GenericContainer<>(
            DockerImageName.parse(ARANGODB_DEFAULT_IMAGE))
            .withEnv(Map.of("ARANGO_ROOT_PASSWORD", "somepassword"))
            .withExposedPorts(8529)
            .waitingFor(Wait.forLogMessage(".*is ready for business.*", 1));

    @Override
    public Map<String, String> start() {
        if (!server.isRunning()) {
            server.start();
        }
        return Map.of(
                "adb.arangodb.hosts", "127.0.0.1:" + server.getMappedPort(8529),
                "adb.arangodb.user", "root",
                "adb.arangodb.password", "somepassword"
        );
    }

    @Override
    public void stop() {
        server.stop();
    }
}