package io.github.itzg.trynested;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("configured")
class ConfiguredProfileTests {
    @Autowired
    ViaRecordProperties viaRecordProperties;

    @Autowired
    ViaClassProperties viaClassProperties;

    @Test
    void viaRecord() {
        assertThat(viaRecordProperties.nested())
            .isNotNull();
        assertThat(viaRecordProperties.nested().status())
            .isEqualTo("configured");
    }

    @Test
    void viaClass() {
        assertThat(viaClassProperties.getNested())
            .isNotNull();
        assertThat(viaClassProperties.getNested().getStatus())
            .isEqualTo("configured");
    }

}
