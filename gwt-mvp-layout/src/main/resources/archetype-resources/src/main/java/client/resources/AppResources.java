#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface AppResources extends ClientBundle {
    //CSS
    @Source("css/app.css")
    AppStyle mercadoStyle();

    //Images
    @Source("images/ajax-loader.gif")
    ImageResource ajax_loader();

}