package org.vaadin.addon.driverjs.model;

public enum StepPosition {
    
    LEFT("left"), LEFT_CENTER("left-center"), LEFT_BOTTOM("left-bottom"), TOP("top"),
    TOP_CENTER("top-center"), TOP_RIGHT("top-right"), RIGHT("right"), RIGHT_CENTER("right-center"), RIGHT_BOTTOM("right-bottom"),
    BOTTOM("bottom"), BOTTOM_CENTER("bottom-center"), BOTTOM_RIGHT("bottom-right"), MID_CENTER("mid-center");
    
    private String position;
    
    StepPosition (String position) {
        this.position = position;
    }
    
    @Override
    public String toString () {
        return position;
    }

}
