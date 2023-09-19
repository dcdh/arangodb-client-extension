package com.damdamdeo.arangodb.client.extension.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class ArangodbClientExtensionProcessor {

    private static final String FEATURE = "arangodb-client-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
