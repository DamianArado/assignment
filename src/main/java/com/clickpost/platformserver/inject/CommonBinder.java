package com.clickpost.platformserver.inject;

import com.clickpost.platformserver.config.PlatformServerConfiguration;
import com.clickpost.platformserver.database.ClickPostDataBase;
import com.clickpost.platformserver.database.ClickPostDataSource;
import com.clickpost.platformserver.service.tracking.TrackingService;
import com.clickpost.platformserver.service.tracking.TrackingServiceImpl;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * The type Common binder.
 *
 * @author khanh
 * @version $Id: $Id
 */
public class CommonBinder extends AbstractBinder {

    /** {@inheritDoc} */
    @Override
    protected void configure() {
        bind(PlatformServerConfiguration.class).to(PlatformServerConfiguration.class).in(Singleton.class);
        bind(ClickPostDataSource.class).to(ClickPostDataSource.class).in(Singleton.class);
        bind(ClickPostDataBase.class).to(ClickPostDataBase.class).in(Singleton.class);
        bind(TrackingServiceImpl.class).to(TrackingService.class).in(Singleton.class);
    }
}
