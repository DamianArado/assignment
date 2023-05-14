package com.clickpost.platformserver.config;

import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.ClasspathLocationStrategy;

import javax.inject.Inject;

public class PlatformServerConfiguration {
    private static final String CONFIGURATION_FILE_NAME = "platformserver.properties";
    private final ImmutableConfiguration configuration_;

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

    public String jdbcDriver() {
        return configuration_.getString("db.jdbc.driver");
    }

    public String jdbcUrl() {
        return configuration_.getString("db.jdbc.url");
    }

    public String jdbcUserName() {
        return configuration_.getString("db.jdbc.username");
    }

    public String jdbcPassword() {
        return configuration_.getString("db.jdbc.password");
    }

}
