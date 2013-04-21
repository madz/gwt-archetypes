#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.gin;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import ${package}.client.application.AppController;
import ${package}.client.application.AppControllerImpl;
import ${package}.client.application.AppLayout;
import ${package}.client.application.AppLayoutImpl;
import ${package}.client.application.center.*;
import ${package}.client.application.east.*;
import ${package}.client.application.north.*;
import ${package}.client.application.south.*;
import ${package}.client.application.west.*;
import ${package}.client.application.widget.error.ErrorPlaceActivity;
import ${package}.client.application.widget.error.ErrorPlaceView;
import ${package}.client.application.widget.error.ErrorPlaceViewImpl;
import ${package}.client.application.widget.error.ErrorPlacetActivityProvider;
import ${package}.client.locale.AppLocale;
import ${package}.client.place.AppPlaceHistoryMapper;
import ${package}.client.resources.AppResources;
import ${package}.client.resources.AppStyle;

import java.util.logging.Logger;

public class GinModule extends AbstractGinModule {
    public static Logger logger = Logger.getLogger(GinModule.class.getName());

    @Override
    protected void configure() {

        // Application EventBus
        bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

        // Application Controller
        bind(AppController.class).to(AppControllerImpl.class).in(
                Singleton.class);

        // Places
        bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(
                Singleton.class);

        // Internationalization
        bind(AppLocale.class).in(Singleton.class);

        // Resources
        bind(AppResources.class).in(Singleton.class);

        // Views
        bind(AppLayout.class).to(AppLayoutImpl.class).in(Singleton.class);

        bind(CenterView.class).to(CenterViewImpl.class).in(Singleton.class);
        bind(NorthView.class).to(NorthViewImpl.class).in(Singleton.class);
        bind(SouthView.class).to(SouthViewImpl.class).in(Singleton.class);
        bind(WestView.class).to(WestViewImpl.class).in(Singleton.class);
        bind(EastView.class).to(EastViewImpl.class).in(Singleton.class);

        // Activities
        bind(CenterActivity.class).toProvider(CenterActivityProvider.class).in(
                Singleton.class);
        bind(NorthActivity.class).toProvider(NorthActivityProvider.class).in(
                Singleton.class);
        bind(SouthActivity.class).toProvider(SouthActivityProvider.class).in(
                Singleton.class);
        bind(WestActivity.class).toProvider(WestActivityProvider.class).in(
                Singleton.class);
        bind(EastActivity.class).toProvider(EastActivityProvider.class).in(
                Singleton.class);

        //error
        bind(ErrorPlaceActivity.class).toProvider(ErrorPlacetActivityProvider.class).in(
                Singleton.class);
        bind(ErrorPlaceView.class).to(ErrorPlaceViewImpl.class).in(Singleton.class);

    }

    // CSS Style Injection
    @Provides
    @Singleton
    AppStyle createStyle(AppResources resources) {
        AppStyle style = resources.mercadoStyle();
        style.ensureInjected();
        return style;
    }

    @Provides
    @Singleton
    @Named("northRegion")
    public ActivityManager getTopRegionActivityMapper(
            NorthActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @Provides
    @Singleton
    @Named("southRegion")
    public ActivityManager getBottomRegionActivityMapper(
            SouthActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @Provides
    @Singleton
    @Named("westRegion")
    public ActivityManager getLeftSideRegionActivityMapper(
            WestActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @Provides
    @Singleton
    @Named("eastRegion")
    public ActivityManager getRightSideRegionActivityMapper(
            EastActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @Provides
    @Singleton
    @Named("centerRegion")
    public ActivityManager getMainTopContentRegionActivityMapper(
            CenterActivityMapper activityMapper, EventBus eventBus) {
        return new ActivityManager(activityMapper, eventBus);
    }

    @SuppressWarnings("deprecation")
    @Provides
    @Singleton
    public PlaceController getPlaceController(EventBus eventBus) {
        return new PlaceController(eventBus);
    }

    @Provides
    @Singleton
    public PlaceHistoryHandler getHistoryHandler(
            PlaceController placeController, PlaceHistoryMapper historyMapper,
            EventBus eventBus) {
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
                historyMapper);
        return historyHandler;
    }
}
