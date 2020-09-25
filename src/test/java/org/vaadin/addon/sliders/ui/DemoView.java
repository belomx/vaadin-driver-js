package org.vaadin.addon.sliders.ui;

import org.vaadin.addon.driverjs.DriverJS;
import org.vaadin.addon.driverjs.model.StepDefinitionBuilder;
import org.vaadin.addon.driverjs.model.StepPosition;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@SuppressWarnings("serial")
@Route("")
public class DemoView extends VerticalLayout {
    private Button sliderValue = null;
    private DriverJS driver;

    public DemoView() {
        Anchor sourceLink = new Anchor("https://github.com/belomx/vaadin-driver-js", " (source code on GitHub)");
        sourceLink.setTarget("_blank");

        HorizontalLayout titleBox = new HorizontalLayout();
        titleBox.setAlignItems(Alignment.BASELINE);
        H3 title = new H3("Vaadin Driver JS, ported to Vaadin v17");
        title.setId("title-id");
        titleBox.add(title, sourceLink);
        add(titleBox);

        Label label = new Label("A label :)");
        label.setWidth("100px");
        add(label);

        Label anotherline = new Label("Another label ;)");
        anotherline.setWidth("100px");
        add(anotherline);

        driver = new DriverJS();
        driver.setStepDefinitions(StepDefinitionBuilder.ofComponent(title).withTitle("Title for the Popover").withDescription("Description for it"),
                StepDefinitionBuilder.ofComponent(label).withTitle("This the first label"),
                StepDefinitionBuilder.ofComponent(anotherline).withTitle("las one!").withPosition(StepPosition.RIGHT));

        sliderValue = new Button("Open driver tour");
        sliderValue.addClickListener(e -> driver.start());

        add(sliderValue);

        add(driver);
    }

    @Override
    public void onAttach(AttachEvent event) {
        super.onAttach(event);
        sliderValue.clickInClient();
    }
}
