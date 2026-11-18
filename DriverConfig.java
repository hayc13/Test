import java.util.Map;
import java.util.Optional;
import java.util.Properties;

/** Resolves the chromedriver location without hard-coding a machine-specific path. */
public final class DriverConfig {
    public static final String PROPERTY = "webdriver.chrome.driver";
    public static final String ENV = "CHROMEDRIVER_PATH";

    private DriverConfig() {
    }

    /**
     * Returns the explicit chromedriver path: the system property wins, then the environment
     * variable. Empty means "not configured" and Selenium Manager locates a driver itself.
     */
    public static Optional<String> chromeDriverPath(Properties props, Map<String, String> env) {
        String fromProp = props.getProperty(PROPERTY);
        if (fromProp != null && !fromProp.trim().isEmpty()) {
            return Optional.of(fromProp.trim());
        }
        String fromEnv = env.get(ENV);
        if (fromEnv != null && !fromEnv.trim().isEmpty()) {
            return Optional.of(fromEnv.trim());
        }
        return Optional.empty();
    }
}
