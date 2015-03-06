package org.gaia.cdi.properties.producer;
import org.gaia.cdi.properties.ComponentConfigurator;
import org.gaia.cdi.properties.annotation.*;
import javax.enterprise.inject.*;
import javax.inject.*;
import javax.enterprise.inject.spi.*;
import javax.enterprise.context.SessionScoped;


@SessionScoped
public class ComponentProducers implements java.io.Serializable {

@Inject
private ComponentConfigurator cc;

@Produces
@AbsoluteLayoutProperties
public com.vaadin.ui.AbsoluteLayout createAbsoluteLayoutWithAbsoluteLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(AbsoluteLayoutProperties.class, ip);
}

@Produces
@AccordionProperties
public com.vaadin.ui.Accordion createAccordionWithAccordionProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(AccordionProperties.class, ip);
}

@Produces
@AudioProperties
public com.vaadin.ui.Audio createAudioWithAudioProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(AudioProperties.class, ip);
}

@Produces
@BrowserFrameProperties
public com.vaadin.ui.BrowserFrame createBrowserFrameWithBrowserFrameProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(BrowserFrameProperties.class, ip);
}

@Produces
@ButtonProperties
public com.vaadin.ui.Button createButtonWithButtonProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ButtonProperties.class, ip);
}

@Produces
@CheckBoxProperties
public com.vaadin.ui.CheckBox createCheckBoxWithCheckBoxProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(CheckBoxProperties.class, ip);
}

@Produces
@ColorPickerProperties
public com.vaadin.ui.ColorPicker createColorPickerWithColorPickerProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ColorPickerProperties.class, ip);
}

@Produces
@ColorPickerAreaProperties
public com.vaadin.ui.ColorPickerArea createColorPickerAreaWithColorPickerAreaProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ColorPickerAreaProperties.class, ip);
}

@Produces
@ComboBoxProperties
public com.vaadin.ui.ComboBox createComboBoxWithComboBoxProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ComboBoxProperties.class, ip);
}

@Produces
@CssLayoutProperties
public com.vaadin.ui.CssLayout createCssLayoutWithCssLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(CssLayoutProperties.class, ip);
}

@Produces
@CustomComponentProperties
public com.vaadin.ui.CustomComponent createCustomComponentWithCustomComponentProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(CustomComponentProperties.class, ip);
}

@Produces
@DateFieldProperties
public com.vaadin.ui.DateField createDateFieldWithDateFieldProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(DateFieldProperties.class, ip);
}

@Produces
@EmbeddedProperties
public com.vaadin.ui.Embedded createEmbeddedWithEmbeddedProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(EmbeddedProperties.class, ip);
}

@Produces
@FlashProperties
public com.vaadin.ui.Flash createFlashWithFlashProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(FlashProperties.class, ip);
}

@Produces
@FormProperties
public com.vaadin.ui.Form createFormWithFormProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(FormProperties.class, ip);
}

@Produces
@FormLayoutProperties
public com.vaadin.ui.FormLayout createFormLayoutWithFormLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(FormLayoutProperties.class, ip);
}

@Produces
@GridLayoutProperties
public com.vaadin.ui.GridLayout createGridLayoutWithGridLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(GridLayoutProperties.class, ip);
}

@Produces
@HorizontalLayoutProperties
public com.vaadin.ui.HorizontalLayout createHorizontalLayoutWithHorizontalLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(HorizontalLayoutProperties.class, ip);
}

@Produces
@HorizontalSplitPanelProperties
public com.vaadin.ui.HorizontalSplitPanel createHorizontalSplitPanelWithHorizontalSplitPanelProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(HorizontalSplitPanelProperties.class, ip);
}

@Produces
@ImageProperties
public com.vaadin.ui.Image createImageWithImageProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ImageProperties.class, ip);
}

@Produces
@InlineDateFieldProperties
public com.vaadin.ui.InlineDateField createInlineDateFieldWithInlineDateFieldProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(InlineDateFieldProperties.class, ip);
}

@Produces
@LabelProperties
public com.vaadin.ui.Label createLabelWithLabelProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(LabelProperties.class, ip);
}

@Produces
@LinkProperties
public com.vaadin.ui.Link createLinkWithLinkProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(LinkProperties.class, ip);
}

@Produces
@ListSelectProperties
public com.vaadin.ui.ListSelect createListSelectWithListSelectProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ListSelectProperties.class, ip);
}

@Produces
@MenuBarProperties
public com.vaadin.ui.MenuBar createMenuBarWithMenuBarProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(MenuBarProperties.class, ip);
}

@Produces
@NativeButtonProperties
public com.vaadin.ui.NativeButton createNativeButtonWithNativeButtonProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(NativeButtonProperties.class, ip);
}

@Produces
@NativeSelectProperties
public com.vaadin.ui.NativeSelect createNativeSelectWithNativeSelectProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(NativeSelectProperties.class, ip);
}

@Produces
@OptionGroupProperties
public com.vaadin.ui.OptionGroup createOptionGroupWithOptionGroupProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(OptionGroupProperties.class, ip);
}

@Produces
@PanelProperties
public com.vaadin.ui.Panel createPanelWithPanelProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(PanelProperties.class, ip);
}

@Produces
@PasswordFieldProperties
public com.vaadin.ui.PasswordField createPasswordFieldWithPasswordFieldProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(PasswordFieldProperties.class, ip);
}

@Produces
@PopupDateFieldProperties
public com.vaadin.ui.PopupDateField createPopupDateFieldWithPopupDateFieldProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(PopupDateFieldProperties.class, ip);
}

@Produces
@ProgressIndicatorProperties
public com.vaadin.ui.ProgressIndicator createProgressIndicatorWithProgressIndicatorProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(ProgressIndicatorProperties.class, ip);
}

@Produces
@RichTextAreaProperties
public com.vaadin.ui.RichTextArea createRichTextAreaWithRichTextAreaProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(RichTextAreaProperties.class, ip);
}

@Produces
@SelectProperties
public com.vaadin.ui.Select createSelectWithSelectProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(SelectProperties.class, ip);
}

@Produces
@SliderProperties
public com.vaadin.ui.Slider createSliderWithSliderProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(SliderProperties.class, ip);
}

@Produces
@TabSheetProperties
public com.vaadin.ui.TabSheet createTabSheetWithTabSheetProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TabSheetProperties.class, ip);
}

@Produces
@TableProperties
public com.vaadin.ui.Table createTableWithTableProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TableProperties.class, ip);
}

@Produces
@TextAreaProperties
public com.vaadin.ui.TextArea createTextAreaWithTextAreaProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TextAreaProperties.class, ip);
}

@Produces
@TextFieldProperties
public com.vaadin.ui.TextField createTextFieldWithTextFieldProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TextFieldProperties.class, ip);
}

@Produces
@TreeProperties
public com.vaadin.ui.Tree createTreeWithTreeProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TreeProperties.class, ip);
}

@Produces
@TreeTableProperties
public com.vaadin.ui.TreeTable createTreeTableWithTreeTableProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TreeTableProperties.class, ip);
}

@Produces
@TwinColSelectProperties
public com.vaadin.ui.TwinColSelect createTwinColSelectWithTwinColSelectProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(TwinColSelectProperties.class, ip);
}

@Produces
@UploadProperties
public com.vaadin.ui.Upload createUploadWithUploadProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(UploadProperties.class, ip);
}

@Produces
@VerticalLayoutProperties
public com.vaadin.ui.VerticalLayout createVerticalLayoutWithVerticalLayoutProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(VerticalLayoutProperties.class, ip);
}

@Produces
@VerticalSplitPanelProperties
public com.vaadin.ui.VerticalSplitPanel createVerticalSplitPanelWithVerticalSplitPanelProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(VerticalSplitPanelProperties.class, ip);
}

@Produces
@VideoProperties
public com.vaadin.ui.Video createVideoWithVideoProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(VideoProperties.class, ip);
}

@Produces
@WindowProperties
public com.vaadin.ui.Window createWindowWithWindowProperties(final InjectionPoint ip) throws Exception {
	return cc.getComponent(WindowProperties.class, ip);
}



}