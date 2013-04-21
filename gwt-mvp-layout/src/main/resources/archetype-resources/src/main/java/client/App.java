#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import ${package}.client.application.AppController;
import ${package}.client.gin.AppGinjector;


public class App implements EntryPoint {

    private final AppGinjector injector = GWT.create(AppGinjector.class);

    public void onModuleLoad() {
        AppController appController = injector.getAppController();
        appController.start();
    }

}
