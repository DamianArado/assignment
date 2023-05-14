package com.clickpost.platformserver.database;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.inject.Inject;

public class ClickPostDataBase {

    private final ClickPostDataSource dataSource_;

    @Inject
    public ClickPostDataBase(ClickPostDataSource dataSource) {
        dataSource_ = dataSource;
    }

    public DSLContext getDslContext() {
        return DSL.using(dataSource_.getDataSource(), SQLDialect.POSTGRES);
    }
}
