#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.locale;

import com.google.gwt.i18n.client.Constants;

public interface AppLocale extends Constants {

    String west();

    String east();

    String north();

    String south();

    String center();

}
