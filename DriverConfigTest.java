import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.junit.Test;

public class DriverConfigTest {
    @Test
    public void emptyWhenNothingConfigured() {
        assertFalse(DriverConfig.chromeDriverPath(new Properties(), Collections.emptyMap()).isPresent());
    }

    @Test
    public void propertyWinsOverEnv() {
        Properties p = new Properties();
        p.setProperty(DriverConfig.PROPERTY, "/a/driver");
        Map<String, String> env = new HashMap<>();
        env.put(DriverConfig.ENV, "/b/driver");
        assertEquals("/a/driver", DriverConfig.chromeDriverPath(p, env).get());
    }

    @Test
    public void fallsBackToEnvAndIgnoresBlank() {
        Properties p = new Properties();
        p.setProperty(DriverConfig.PROPERTY, "  ");
        Map<String, String> env = new HashMap<>();
        env.put(DriverConfig.ENV, "/b/driver");
        assertEquals("/b/driver", DriverConfig.chromeDriverPath(p, env).get());
    }
}
