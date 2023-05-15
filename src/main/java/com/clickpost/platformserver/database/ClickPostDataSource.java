package com.clickpost.platformserver.database;

import com.clickpost.platformserver.config.PlatformServerConfiguration;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.inject.Inject;
import javax.sql.DataSource;

/**
 * The type Click post data source.
 *
 * @author khanh
 * @version $Id: $Id
 */
public class ClickPostDataSource {
    private final DataSource dataSource_;

    /**
     * Instantiates a new Click post data source.
     *
     * @param platformServerConfiguration the platform server configuration
     */
    @Inject
    public ClickPostDataSource(PlatformServerConfiguration platformServerConfiguration) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(platformServerConfiguration.jdbcDriver());
        dataSource.setUrl(platformServerConfiguration.jdbcUrl());
        dataSource.setPassword(platformServerConfiguration.jdbcPassword());
        dataSource.setUsername(platformServerConfiguration.jdbcUserName());
        dataSource.setMaxTotal(50);
        dataSource_ = dataSource;
    }

    /**
     * Gets data source.
     *
     * @return the data source
     */
    public DataSource getDataSource() {
        return dataSource_;
    }
}
