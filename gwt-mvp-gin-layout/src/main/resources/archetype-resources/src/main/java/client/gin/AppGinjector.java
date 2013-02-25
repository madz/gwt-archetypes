package ${package}.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import ${package}.client.AppController;

@GinModules(GinModule.class)
public interface AppGinjector extends Ginjector {
	AppController getAppController();
}
