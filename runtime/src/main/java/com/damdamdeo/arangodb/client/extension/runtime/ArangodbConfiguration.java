package com.damdamdeo.arangodb.client.extension.runtime;

import com.arangodb.config.ArangoConfigProperties;
import com.arangodb.config.HostDescription;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

import java.util.List;
import java.util.Optional;

@ConfigRoot(prefix = "adb", phase = ConfigPhase.RUN_TIME)
public class ArangodbConfiguration implements ArangoConfigProperties {
    private Optional<List<HostDescription>> hosts;
    private Optional<String> user;
    private Optional<String> password;

    @Override
    public Optional<List<HostDescription>> getHosts() {
        return hosts;
    }

    @Override
    public Optional<String> getUser() {
        return user;
    }

    @Override
    public Optional<String> getPassword() {
        return password;
    }
}
