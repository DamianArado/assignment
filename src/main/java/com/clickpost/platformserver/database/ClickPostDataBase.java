package com.clickpost.platformserver.database;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.inject.Inject;

/**
 * The type Click post data base.
 */
public class ClickPostDataBase {

    private final ClickPostDataSource dataSource_;

    /**
     * Instantiates a new Click post data base.
     *
     * @param dataSource the data source
     */
    @Inject
    public ClickPostDataBase(ClickPostDataSource dataSource) {
        dataSource_ = dataSource;
    }

    /**
     * Gets dsl context.
     *
     * @return the dsl context
     */
    public DSLContext getDslContext() {
        return DSL.using(dataSource_.getDataSource(), SQLDialect.POSTGRES);
    }
}
