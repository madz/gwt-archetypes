#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.util;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

/**
 * @param <T> - type of an activity
 * @author Madz
 *         This class will implement the code splitting
 */
public class ActivityAsyncProxy<T> implements ActivityCustom {

    @Inject
    private AsyncProvider<T> provider;
    private boolean canceled = false;
    private ActivityCustom activity;
    protected Place place;

    @Override
    public String mayStop() {
        if (activity != null)
            return activity.mayStop();
        return null;
    }

    @Override
    public void onCancel() {
        if (activity != null) {
            activity.onCancel();
        } else {
            canceled = true;
        }
    }

    @Override
    public void onStop() {
        if (activity != null) {
            activity.onStop();
        } else {
            canceled = true;
        }
    }

    @Override
    public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
        provider.get(new AsyncCallbackCustom<T>() {

            @Override
            public void onCustomSuccess(T result) {
                // Do not starts loaded activity if it has been canceled
                if (!canceled) {
                    activity = (ActivityCustom) result;
                    activity.setPlace(place);
                    activity.start(panel, eventBus);
                }
            }

            @Override
            public void onCustomFailure(Throwable caught) {
                this.setFailMessage("There was something wrong in downloading your request " + caught.getLocalizedMessage());
            }
        });
    }

    @Override
    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }
}
