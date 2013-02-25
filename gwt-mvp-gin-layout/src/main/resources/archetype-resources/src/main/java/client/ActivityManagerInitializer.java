package ${package}.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import ${package}.client.view.AppLayout;

/**
 * This class is responsible for ActivityManager instantiations through GIN, it
 * also associate every ActivityManager with the corresponding display region
 */
public class ActivityManagerInitializer {

	@Inject
	public ActivityManagerInitializer(
			AppLayout appPanelView,
			@Named("southRegion") ActivityManager southActivityMapper,
			@Named("westRegion") ActivityManager westActivityMapper,
			@Named("eastRegion") ActivityManager eastActivityMapper,
			@Named("centerRegion") ActivityManager centerActivityManager,
			@Named("northRegion") ActivityManager northActivityManager) {
		southActivityMapper.setDisplay(appPanelView
				.getSouthContainer());
		westActivityMapper.setDisplay(appPanelView
				.getWestContainer());
		eastActivityMapper.setDisplay(appPanelView
				.getEastContainer());
		centerActivityManager.setDisplay(appPanelView
				.getCenterContainer());
		northActivityManager.setDisplay(appPanelView.getNorthContainer());
	}

}
