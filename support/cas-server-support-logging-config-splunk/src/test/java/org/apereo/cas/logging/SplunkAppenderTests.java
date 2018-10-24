package org.apereo.cas.logging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.autoconfigure.RefreshAutoConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * This is {@link SplunkAppenderTests}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@SpringBootTest(classes = RefreshAutoConfiguration.class)
@Slf4j
@ExtendWith(SpringExtension.class)
public class SplunkAppenderTests {
    @Test
    public void verifyAction() {
        try {
            LOGGER.info("Testing splunk appender");
        } catch (final Exception e) {
            throw new AssertionError(e.getMessage(), e);
        }
    }
}
