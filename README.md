This project demonstrates the use of [type-safe configuration properties in Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.external-config.typesafe-configuration-properties) declared with `@ConfigurationProperties` on a `record` that has a nested `record`. The `@DefaultValue` on the nested field ensures that even if a nested property, such as `via-record.nested.status`, isn't externally configured then the value of `nested()` will not be null for users of `ViaRecordProperties`. 

```java
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
```