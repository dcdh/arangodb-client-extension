package com.damdamdeo.arangodb.client.extension.it;

import com.arangodb.ArangoDB;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
@QuarkusTestResource(ArangodbResource.class)
public class GetVersionTest {

    @Inject
    ArangoDB arangoDB;

    @Test
    public void testVersion() {
        assertEquals("3.11.3", arangoDB.getVersion().getVersion());
    }

}
