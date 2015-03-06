package org.gaia.cdi.properties.annotation;
import javax.inject.*;
import java.lang.annotation.*;
import javax.enterprise.util.*;


@Qualifier
@Target({ ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface TableProperties {

@Nonbinding
boolean buffered() default false;

@Nonbinding
double cacheRate() default 2.0;

@Nonbinding
java.lang.String caption() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
String captionKey() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean columnCollapsingAllowed() default false;

@Nonbinding
com.vaadin.ui.Table.ColumnHeaderMode columnHeaderMode() default com.vaadin.ui.Table.ColumnHeaderMode.EXPLICIT_DEFAULTS_ID;

@Nonbinding
boolean columnReorderingAllowed() default false;

@Nonbinding
java.lang.String conversionError() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
int currentPageFirstItemIndex() default 0;

@Nonbinding
java.lang.String debugId() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
java.lang.String description() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.ui.Table.TableDragMode dragMode() default com.vaadin.ui.Table.TableDragMode.NONE;

@Nonbinding
boolean editable() default false;

@Nonbinding
boolean enabled() default true;

@Nonbinding
boolean footerVisible() default false;

@Nonbinding
String height() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.server.Sizeable.Unit heightUnits() default com.vaadin.server.Sizeable.Unit.PIXELS;

@Nonbinding
float heightValue() default -1.0f;

@Nonbinding
java.lang.String id() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean immediate() default false;

@Nonbinding
Class implementation() default com.vaadin.ui.Table.class;

@Nonbinding
boolean invalidAllowed() default true;

@Nonbinding
boolean invalidCommitted() default false;

@Nonbinding
com.vaadin.ui.AbstractSelect.ItemCaptionMode itemCaptionMode() default com.vaadin.ui.AbstractSelect.ItemCaptionMode.EXPLICIT_DEFAULTS_ID;

@Nonbinding
boolean localized() default true;

@Nonbinding
boolean multiSelect() default false;

@Nonbinding
com.vaadin.shared.ui.MultiSelectMode multiSelectMode() default com.vaadin.shared.ui.MultiSelectMode.DEFAULT;

@Nonbinding
boolean newItemsAllowed() default false;

@Nonbinding
boolean nullSelectionAllowed() default true;

@Nonbinding
int pageLength() default 15;

@Nonbinding
java.lang.String primaryStyleName() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
boolean readOnly() default false;

@Nonbinding
boolean required() default false;

@Nonbinding
java.lang.String requiredError() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.ui.Table.RowHeaderMode rowHeaderMode() default com.vaadin.ui.Table.RowHeaderMode.HIDDEN;

@Nonbinding
boolean selectable() default false;

@Nonbinding
boolean sizeFull() default false;

@Nonbinding
boolean sizeUndefined() default false;

@Nonbinding
boolean sortAscending() default true;

@Nonbinding
boolean sortDisabled() default false;

@Nonbinding
boolean sortEnabled() default true;

@Nonbinding
String[] styleName() default {};

@Nonbinding
int tabIndex() default 0;

@Nonbinding
boolean validationVisible() default true;

@Nonbinding
boolean visible() default true;

@Nonbinding
String width() default org.gaia.cdi.properties.ComponentConfigurator.IGNORED_STRING;

@Nonbinding
com.vaadin.server.Sizeable.Unit widthUnits() default com.vaadin.server.Sizeable.Unit.PIXELS;

@Nonbinding
float widthValue() default -1.0f;

}