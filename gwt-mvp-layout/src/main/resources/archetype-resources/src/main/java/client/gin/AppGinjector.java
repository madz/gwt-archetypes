#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ${package}.client.application.AppController;

@GinModules(GinModule.class)
public interface AppGinjector extends Ginjector {
    AppController getAppController();
}
