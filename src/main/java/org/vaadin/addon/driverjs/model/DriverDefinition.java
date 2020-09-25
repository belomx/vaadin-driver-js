package org.vaadin.addon.driverjs.model;

import java.io.Serializable;
import java.util.Map;

public class DriverDefinition implements Serializable {

    private static final long serialVersionUID = 153828993499106351L;
    
    private String className;                                 // className to wrap driver.js popover
    private Boolean animate;                                  // Whether to animate or not
    private Double opacity;                                   // Background opacity (0 means only popovers and without overlay)
    private Double padding;                                   // Distance of element from around the edges
    private Boolean allowClose;                               // Whether the click on overlay should close or not
    private Boolean overlayClickNext;                         // Whether the click on overlay should move next
    private String doneBtnText;                               // Text on the final button
    private String closeBtnText;                              // Text on the close button for this step
    private String stageBackground;                           // Background color for the staged behind highlighted element
    private String nextBtnText;                               // Next button text for this step
    private String prevBtnText;                               // Previous button text for this step
    private Boolean showButtons;                              // Do not show control buttons in footer
    private Boolean keyboardControl;                          // Allow controlling through keyboard (escape to close, arrow keys to move)
    private Map<String, Serializable> scrollIntoViewOptions;  // We use `scrollIntoView()` when possible, pass here the options for it if you want any
        
    /**
     * @param className default value: 'scoped-class', className to wrap driver.js popover
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withClassName(String className) {
        this.className = className;
        return this;
    }
    
    /**
     * @param animate default value: true, Whether to animate or not
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withAnimate(Boolean animate) {
        this.animate = animate;
        return this;
    }
    
    /**
     * @param opacity default value: 0.75, Background opacity (0 means only popovers and without overlay)
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withOpacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }
    
    /**
     * @param padding default value: 10, Distance of element from around the edges
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withPadding(Double padding) {
        this.padding = padding;
        return this;
    }
    
    /**
     * @param allowClose default value: true, Whether the click on overlay should close or not
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withAllowClose(Boolean allowClose) {
        this.allowClose = allowClose;
        return this;
    }
    
    /**
     * @param overlayClickNext default value: false, Whether the click on overlay should move next
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withOverlayClickNext(Boolean overlayClickNext) {
        this.overlayClickNext = overlayClickNext;
        return this;
    }
    
    /**
     * @param doneBtnText default value: 'Done', Text on the final button
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withDoneBtnText(String doneBtnText) {
        this.doneBtnText = doneBtnText;
        return this;
    }
    
    /**
     * @param closeBtnText default value: 'Close', Text on the close button for this step
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withCloseBtnText(String closeBtnText) {
        this.closeBtnText = closeBtnText;
        return this;
    }
    
    /**
     * @param stageBackground default value: '#ffffff' Background color for the staged behind highlighted element
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withStageBackground(String stageBackground) {
        this.stageBackground = stageBackground;
        return this;
    }
    
    /**
     * @param nextBtnText default value: 'Next', Next button text for this step
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withNextBtnText(String nextBtnText) {
        this.nextBtnText = nextBtnText;
        return this;
    }
    
    /**
     * @param prevBtnText default value: 'Previous', Previous button text for this step
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withPrevBtnText(String prevBtnText) {
        this.prevBtnText = prevBtnText;
        return this;
    }
    
    /**
     * @param showButtons default value: false, Do not show control buttons in footer
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withShowButtons(Boolean showButtons) {
        this.showButtons = showButtons;
        return this;
    }
    
    /**
     * @param keyboardControl default value: true, Allow controlling through keyboard (escape to close, arrow keys to move)
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withKeyboardControl(Boolean keyboardControl) {
        this.keyboardControl = keyboardControl;
        return this;
    }
    
    /**
     * @param scrollIntoViewOptions default value: {}, We use `scrollIntoView()` when possible, pass here the options for it if you want any
     * 
     * @return DriverDefinition
     */
    public DriverDefinition withScrollIntoViewOptions(Map<String, Serializable> scrollIntoViewOptions) {
        this.scrollIntoViewOptions = scrollIntoViewOptions;
        return this;
    }
    
    /**
     * @return the className 
     */
    public String getClassName() {
        return className;
    }
    /**
     * @param className default value: 'scoped-class', className to wrap driver.js popover
     */
    public void setClassName(String className) {
        this.className = className;
    }
    /**
     * @return the animate
     */
    public Boolean getAnimate() {
        return animate;
    }
    /**
     * @param animate default value: true, Whether to animate or not
     */
    public void setAnimate(Boolean animate) {
        this.animate = animate;
    }
    /**
     * @return the opacity
     */
    public Double getOpacity() {
        return opacity;
    }
    /**
     * @param opacity default value: 0.75, Background opacity (0 means only popovers and without overlay)
     */
    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }
    /**
     * @return the padding
     */
    public Double getPadding() {
        return padding;
    }
    /**
     * @param padding default value: 10, Distance of element from around the edges
     */
    public void setPadding(Double padding) {
        this.padding = padding;
    }
    /**
     * @return the allowClose
     */
    public Boolean getAllowClose() {
        return allowClose;
    }
    /**
     * @param allowClose default value: true, Whether the click on overlay should close or not
     */
    public void setAllowClose(Boolean allowClose) {
        this.allowClose = allowClose;
    }
    /**
     * @return the overlayClickNext
     */
    public Boolean getOverlayClickNext() {
        return overlayClickNext;
    }
    /**
     * @param overlayClickNext default value: false, Whether the click on overlay should move next
     */
    public void setOverlayClickNext(Boolean overlayClickNext) {
        this.overlayClickNext = overlayClickNext;
    }
    /**
     * @return the doneBtnText
     */
    public String getDoneBtnText() {
        return doneBtnText;
    }
    /**
     * @param doneBtnText default value: 'Done', Text on the final button
     */
    public void setDoneBtnText(String doneBtnText) {
        this.doneBtnText = doneBtnText;
    }
    /**
     * @return the closeBtnText
     */
    public String getCloseBtnText() {
        return closeBtnText;
    }
    /**
     * @param closeBtnText default value: 'Close', Text on the close button for this step
     */
    public void setCloseBtnText(String closeBtnText) {
        this.closeBtnText = closeBtnText;
    }
    /**
     * @return the stageBackground
     */
    public String getStageBackground() {
        return stageBackground;
    }
    /**
     * @param stageBackground default value: '#ffffff' Background color for the staged behind highlighted element
     */
    public void setStageBackground(String stageBackground) {
        this.stageBackground = stageBackground;
    }
    /**
     * @return the nextBtnText
     */
    public String getNextBtnText() {
        return nextBtnText;
    }
    /**
     * @param nextBtnText default value: 'Next', Next button text for this step
     */
    public void setNextBtnText(String nextBtnText) {
        this.nextBtnText = nextBtnText;
    }
    /**
     * @return the prevBtnText
     */
    public String getPrevBtnText() {
        return prevBtnText;
    }
    /**
     * @param prevBtnText default value: 'Previous', Previous button text for this step
     */
    public void setPrevBtnText(String prevBtnText) {
        this.prevBtnText = prevBtnText;
    }
    /**
     * @return the showButtons
     */
    public Boolean getShowButtons() {
        return showButtons;
    }
    /**
     * @param showButtons default value: false, Do not show control buttons in footer
     */
    public void setShowButtons(Boolean showButtons) {
        this.showButtons = showButtons;
    }
    /**
     * @return the keyboardControl
     */
    public Boolean getKeyboardControl() {
        return keyboardControl;
    }
    /**
     * @param keyboardControl default value: true, Allow controlling through keyboard (escape to close, arrow keys to move)
     */
    public void setKeyboardControl(Boolean keyboardControl) {
        this.keyboardControl = keyboardControl;
    }
    /**
     * @return the scrollIntoViewOptions
     */
    public Map<String, Serializable> getScrollIntoViewOptions() {
        return scrollIntoViewOptions;
    }
    /**
     * @param scrollIntoViewOptions default value: {}, We use `scrollIntoView()` when possible, pass here the options for it if you want any
     */
    public void setScrollIntoViewOptions(Map<String, Serializable> scrollIntoViewOptions) {
        this.scrollIntoViewOptions = scrollIntoViewOptions;
    }

}
