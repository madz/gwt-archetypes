#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.util;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ${package}.client.application.widget.loading.LoadingPopUpActivity;
import ${package}.client.application.widget.loading.LoadingPopUpView;
import ${package}.client.application.widget.loading.LoadingPopUpViewImpl;

public abstract class AsyncCallbackCustom<T> implements AsyncCallback<T> {
    private LoadingPopUpView loadingView = new LoadingPopUpViewImpl();
    private LoadingPopUpActivity loadingPopUpActivity = new LoadingPopUpActivity(loadingView);

    public AsyncCallbackCustom() {
        loadingPopUpActivity.showAndSetPopupPosition();
    }

    public final void onFailure(Throwable caught) {
        onCustomFailure(caught);
    }

    public final void onSuccess(T result) {
        loadingPopUpActivity.close();
        onCustomSuccess(result);
    }

    public final void setFailMessage(String message) {
        loadingPopUpActivity.setMessage(message);
    }

    /**
     * the failure method needed to be overwritten
     *
     * @param caught
     */
    protected abstract void onCustomFailure(Throwable caught);

    /**
     * overwritten to do something with result
     *
     * @param result
     */
    protected abstract void onCustomSuccess(T result);
}