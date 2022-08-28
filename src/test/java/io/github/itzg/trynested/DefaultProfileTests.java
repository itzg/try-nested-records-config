package io.github.itzg.trynested;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultProfileTests {
    @Autowired
    AppProperties appProperties;

    @Test
    void contextLoads() {
        assertThat(appProperties.nested())
            .isNotNull();
        assertThat(appProperties.nested().status())
            .isEqualTo("default");
    }

}
