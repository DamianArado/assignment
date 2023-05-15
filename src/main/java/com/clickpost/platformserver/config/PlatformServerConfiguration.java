package com.clickpost.platformserver.config;

import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.ClasspathLocationStrategy;

import javax.inject.Inject;

/**
 * The type Platform server configuration.
 *
 * @author khanh
 * @version $Id: $Id
 */
public class PlatformServerConfiguration {
    private static final String CONFIGURATION_FILE_NAME = "platformserver.properties";
    private final ImmutableConfiguration configuration_;

    /**
     * Instantiates a new Platform server configuration.
     *
     * @throws org.apache.commons.configuration2.ex.ConfigurationException the configuration exception
     */
    @Inject
    public PlatformServerConfiguration() throws ConfigurationException {
        Parameters parameters = new Parameters();
        FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                        .configure(parameters.properties()
                                .setLocationStrategy(new ClasspathLocationStrategy())
                                .setFileName(CONFIGURATION_FILE_NAME));
        Configuration configuration = builder.getConfiguration();
        configuration_ = ConfigurationUtils.unmodifiableConfiguration(configuration);
    }

    /**
     * Jdbc driver string.
     *
     * @return the string
     */
    public String jdbcDriver() {
        return configuration_.getString("db.jdbc.driver");
    }

    /**
     * Jdbc url string.
     *
     * @return the string
     */
    public String jdbcUrl() {
        return configuration_.getString("db.jdbc.url");
    }

    /**
     * Jdbc user name string.
     *
     * @return the string
     */
    public String jdbcUserName() {
        return configuration_.getString("db.jdbc.username");
    }

    /**
     * Jdbc password string.
     *
     * @return the string
     */
    public String jdbcPassword() {
        return configuration_.getString("db.jdbc.password");
    }

}
