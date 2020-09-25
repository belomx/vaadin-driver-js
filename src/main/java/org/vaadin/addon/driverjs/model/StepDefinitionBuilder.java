package org.vaadin.addon.driverjs.model;

import org.apache.commons.lang3.RandomStringUtils;

import com.vaadin.flow.component.Component;

public class StepDefinitionBuilder {
    
    private Component targetComponent;    
    private String stageBackground;
    
    private Popover popover = new Popover();
    
    private StepDefinitionBuilder (Component targetComponent)
    {
        this.targetComponent = targetComponent;
    }
    
    public static StepDefinitionBuilder ofComponent (Component targetComponent)
    {
        return new StepDefinitionBuilder(targetComponent);
    }
    
    public StepDefinitionBuilder withStageBackground (String stageBackground)
    {
        this.stageBackground = stageBackground;
        return this;
    }
    
    /**
     * @param className, default value: 'popover-class', className to wrap this specific step popover in addition to the general className in Driver options
     */
    public StepDefinitionBuilder withClassName(String className) {
        popover.setClassName(className);
        return this;
    }

    /**
     * @param title, default value: 'Title', Title on the popover
     */
    public StepDefinitionBuilder withTitle(String title) {
        popover.setTitle(title);
        return this;
    }

    /**
     * @param description, default value: 'Description', Body of the popover
     */
    public StepDefinitionBuilder withDescription(String description) {
        popover.setDescription(description);
        return this;
    }

    /**
     * @param showButtons, default value: false, Do not show control buttons in footer
     */
    public StepDefinitionBuilder withShowButtons(Boolean showButtons) {
        popover.setShowButtons(showButtons);
        return this;
    }

    /**
     * @param doneBtnText, default value: 'Done', Text on the last button
     */
    public StepDefinitionBuilder withDoneBtnText(String doneBtnText) {
        popover.setDoneBtnText(doneBtnText);
        return this;
    }

    /**
     * @param closeBtnText, default value: 'Close', Text on the close button
     */
    public StepDefinitionBuilder withCloseBtnText(String closeBtnText) {
        popover.setCloseBtnText(closeBtnText);
        return this;
    }

    /**
     * @param nextBtnText, default value: 'Next', Next button text
     */
    public StepDefinitionBuilder withNextBtnText(String nextBtnText) {
        popover.setNextBtnText(nextBtnText);
        return this;
    }

    /**
     * @param prevBtnText, default value: 'Previous', Previous button text
     */
    public StepDefinitionBuilder withPrevBtnText(String prevBtnText) {
        popover.setPrevBtnText(prevBtnText);
        return this;
    }

    /**
     * @return the position of the dialog
     * position can be left, left-center, left-bottom, top,
     * top-center, top-right, right, right-center, right-bottom,
     * bottom, bottom-center, bottom-right, mid-center
     */
    public StepDefinitionBuilder withPosition(StepPosition position) {
        popover.setPosition(position);
        return this;
    }
    
    public StepDefinition build ()
    {
        StepDefinition step = new StepDefinition();
        if (!targetComponent.getId().isPresent())
        {
            String uniqueId = RandomStringUtils.randomAlphabetic(12);
            targetComponent.setId(uniqueId);
        }
        String id = "#" + targetComponent.getId().get();
        step.setElement(id);
        
        if (stageBackground != null)
        {
            step.setStageBackground(stageBackground);
        }
        if (!popover.isEmpty())
        {
            step.setPopover(popover);
        }
        return step;
    }
        
}
