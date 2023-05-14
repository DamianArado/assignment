package com.clickpost.platformserver.database;

import com.clickpost.platformserver.config.PlatformServerConfiguration;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.inject.Inject;
import javax.sql.DataSource;

public class ClickPostDataSource {
    private final DataSource dataSource_;

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

    public DataSource getDataSource() {
        return dataSource_;
    }
}
