package com.damdamdeo.arangodb.client.extension.runtime;

import com.arangodb.ArangoDB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;

public class ArangodbProducer {
    @Produces
    @ApplicationScoped
    public ArangoDB arangoDB(final ArangodbConfiguration config) {
        return new ArangoDB.Builder()
                .loadProperties(config)
                .build();
    }
}
