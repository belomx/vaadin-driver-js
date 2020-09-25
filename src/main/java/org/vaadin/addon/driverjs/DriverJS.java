package org.vaadin.addon.driverjs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.vaadin.addon.driverjs.model.DriverDefinition;
import org.vaadin.addon.driverjs.model.StepDefinition;
import org.vaadin.addon.driverjs.model.StepDefinitionBuilder;

import com.google.gson.Gson;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

@Tag("vaadin-driver-js")
@CssImport("driver.js/dist/driver.min.css")
@JsModule("./addon/driverjs/driver-js.js")
@NpmPackage(value = "driver.js", version = "0.9.7")
public class DriverJS extends Component implements HasStyle, HasSize {

    private static final long serialVersionUID = 1L;

    private transient List<StepDefinitionBuilder> stepBuilders = List.of();

    private transient boolean hasStepBuilderChanged = false;

    public DriverJS() {
    }

    public DriverJS(DriverDefinition driverDefinition) {
        setupDriver(driverDefinition);
    }

    public void setupDriver(DriverDefinition driverDefinition) {
        Gson gsonParser = new Gson();
        getElement().callJsFunction("createDriver", gsonParser.toJson(driverDefinition));
    }

    private void setDefinitionSteps(List<StepDefinition> steps) {
        Gson gsonParser = new Gson();
        getElement().callJsFunction("defineSteps", gsonParser.toJson(steps));
    }

    public void setStepDefinitions(StepDefinitionBuilder... stepBuilders) {
        this.stepBuilders = Arrays.asList(stepBuilders);
        hasStepBuilderChanged = true;
    }

    private Stream<StepDefinition> getStepDefinitions() {
        return stepBuilders.stream().map(StepDefinitionBuilder::build);
    }

    public void start() {
        List<StepDefinition> steps = getStepDefinitions().collect(Collectors.toList());
        if (steps.isEmpty()) {
            throw new IllegalStateException("Step definitions must be set!");
        } else if (hasStepBuilderChanged) {
            setDefinitionSteps(steps);
        }
        getElement().callJsFunction("start");
    }

}
