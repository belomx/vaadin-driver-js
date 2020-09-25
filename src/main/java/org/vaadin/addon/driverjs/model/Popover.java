package org.vaadin.addon.driverjs.model;

import java.io.Serializable;

public class Popover implements Serializable {
    
    private static final long serialVersionUID = 7900093876218349207L;
    
    private String className;    // className to wrap this specific step popover in addition to the general className in Driver options
    private String title;        // Title on the popover
    private String description;  // Body of the popover
    private Boolean showButtons; // Do not show control buttons in footer
    private String doneBtnText;  // Text on the last button
    private String closeBtnText; // Text on the close button
    private String nextBtnText;  // Next button text
    private String prevBtnText;  // Previous button text
    private String position;
    
    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }
    /**
     * @param className, default value: 'popover-class', className to wrap this specific step popover in addition to the general className in Driver options
     */
    public void setClassName(String className) {
        this.className = className;
    }
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    /**
     * @param title, default value: 'Title', Title on the popover
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description, default value: 'Description', Body of the popover
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the showButtons
     */
    public Boolean getShowButtons() {
        return showButtons;
    }
    /**
     * @param showButtons, default value: false, Do not show control buttons in footer
     */
    public void setShowButtons(Boolean showButtons) {
        this.showButtons = showButtons;
    }
    /**
     * @return the doneBtnText
     */
    public String getDoneBtnText() {
        return doneBtnText;
    }
    /**
     * @param doneBtnText, default value: 'Done', Text on the last button
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
     * @param closeBtnText, default value: 'Close', Text on the close button
     */
    public void setCloseBtnText(String closeBtnText) {
        this.closeBtnText = closeBtnText;
    }
    /**
     * @return the nextBtnText
     */
    public String getNextBtnText() {
        return nextBtnText;
    }
    /**
     * @param nextBtnText, default value: 'Next', Next button text
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
     * @param prevBtnText, default value: 'Previous', Previous button text
     */
    public void setPrevBtnText(String prevBtnText) {
        this.prevBtnText = prevBtnText;
    }
    /**
     * @return the position of the dialog
     * position can be left, left-center, left-bottom, top,
     * top-center, top-right, right, right-center, right-bottom,
     * bottom, bottom-center, bottom-right, mid-center
     */
    public String getPosition() {
        return position;
    }
    /**
     * @param position the position to set
     */
    public void setPosition(StepPosition position) {
        this.position = position.toString();
    }
    
    public boolean isEmpty ()
    {
        return className == null 
                && title == null 
                && description == null 
                && showButtons == null 
                && doneBtnText == null 
                && closeBtnText == null 
                && nextBtnText == null 
                && prevBtnText == null 
                && position == null;
    }

}
