package io.github.itzg.trynested;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "via-class")
public class ViaClassProperties {
    Nested nested = new Nested();

    public Nested getNested() {
        return nested;
    }

    public void setNested(Nested nested) {
        this.nested = nested;
    }

    public static class Nested {
        String status = "default";

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
