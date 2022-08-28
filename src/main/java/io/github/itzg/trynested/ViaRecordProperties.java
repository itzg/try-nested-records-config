package io.github.itzg.trynested;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties(prefix = "via-record")
public record ViaRecordProperties(
    @DefaultValue
    Nested nested
) {

    public record Nested(
        @DefaultValue("default")
        String status
    ) {

    }
}
