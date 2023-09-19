package com.damdamdeo.arangodb.client.extension.deployment;

import com.damdamdeo.arangodb.client.extension.runtime.ArangodbProducer;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class ArangodbClientExtensionProcessor {

    private static final String FEATURE = "arangodb-client-extension";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem createArangodbProvider() {
        return new AdditionalBeanBuildItem(ArangodbProducer.class);
    }
}
