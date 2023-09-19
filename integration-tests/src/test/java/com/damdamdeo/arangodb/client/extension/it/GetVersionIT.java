package com.damdamdeo.arangodb.client.extension.it;

import io.quarkus.test.junit.QuarkusIntegrationTest;

@QuarkusIntegrationTest
// test is never executed while doing "mvn clean install verify -P native" ... WHY ???
public class GetVersionIT extends GetVersionTest {
}
