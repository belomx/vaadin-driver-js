package org.vaadin.addon.driverjs.model;

import java.io.Serializable;

public class StepDefinition implements Serializable {

    private static final long serialVersionUID = 7900093876218349206L;    
    
    private String element;
    private String stageBackground;
    
    private Popover popover;
    
    
    /**
     * @return the element Query selector string or Node to be highlighted
     */
    public String getElement() {
        return element;
    }

    /**
     * @param set Query selector string or Node to be highlighted
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * @return the stageBackground
     */
    public String getStageBackground() {
        return stageBackground;
    }

    /**
     * @param stageBackground the stageBackground to set
     */
    public void setStageBackground(String stageBackground) {
        this.stageBackground = stageBackground;
    }

    /**
     * @return the popover
     */
    public Popover getPopover() {
        return popover;
    }

    /**
     * @param popover the popover to set
     */
    public void setPopover(Popover popover) {
        this.popover = popover;
    }

}
