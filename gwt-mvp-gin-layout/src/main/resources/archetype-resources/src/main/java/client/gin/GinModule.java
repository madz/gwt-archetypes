package ${package}.client.gin;

import java.util.logging.Logger;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.storage.client.Storage;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import ${package}.client.AppController;
import ${package}.client.AppControllerImpl;
import ${package}.client.activities.CenterActivity;
import ${package}.client.activities.EastActivity;
import ${package}.client.activities.NorthActivity;
import ${package}.client.activities.SouthActivity;
import ${package}.client.activities.WestActivity;
import ${package}.client.mappers.CenterActivityMapper;
import ${package}.client.mappers.EastActivityMapper;
import ${package}.client.mappers.NorthActivityMapper;
import ${package}.client.mappers.SouthActivityMapper;
import ${package}.client.mappers.WestActivityMapper;
import ${package}.client.place.AppPlaceHistoryMapper;
import ${package}.client.provider.CenterActivityProvider;
import ${package}.client.provider.EastActivityProvider;
import ${package}.client.provider.NorthActivityProvider;
import ${package}.client.provider.SouthActivityProvider;
import ${package}.client.provider.WestActivityProvider;
import ${package}.client.view.AppLayout;
import ${package}.client.view.AppLayoutImpl;
import ${package}.client.view.CenterView;
import ${package}.client.view.CenterViewImpl;
import ${package}.client.view.EastView;
import ${package}.client.view.EastViewImpl;
import ${package}.client.view.NorthView;
import ${package}.client.view.NorthViewImpl;
import ${package}.client.view.SouthView;
import ${package}.client.view.SouthViewImpl;
import ${package}.client.view.WestView;
import ${package}.client.view.WestViewImpl;

public class GinModule extends AbstractGinModule {
	public static Logger logger = Logger.getLogger(GinModule.class.getName());

	@Override
	protected void configure() {
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

		// Places
		bind(PlaceHistoryMapper.class).to(AppPlaceHistoryMapper.class).in(
				Singleton.class);

		// Application EventBus
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		// Application Controller
		bind(AppController.class).to(AppControllerImpl.class).in(
				Singleton.class);

	}

	@Provides
	@Singleton
	Storage createStorage() {
		return Storage.getSessionStorageIfSupported();
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
