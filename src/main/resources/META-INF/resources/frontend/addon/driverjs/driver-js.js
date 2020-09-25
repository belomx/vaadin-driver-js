import { LitElement } from 'lit-element';
import  Driver from 'driver.js';

class VaadinDriverJS extends LitElement {  	

    static get is() {
        return 'vaadin-driver-js';
    }

    static get properties() {

        return {
	        driver: Object,

            driverDefinition: Object,
            
            /*
            className: String,                // className to wrap driver.js popover
            animate: Boolean,                 // Whether to animate or not
            opacity: Number,                  // Background opacity (0 means only popovers and without overlay)
            padding: Number,                  // Distance of element from around the edges
            allowClose: Boolean,              // Whether the click on overlay should close or not
            overlayClickNext: Boolean,        // Whether the click on overlay should move next
            doneBtnText: String,              // Text on the final button
            closeBtnText: String,             // Text on the close button for this step
            stageBackground: String,          // Background color for the staged behind highlighted element
            nextBtnText: String,              // Next button text for this step
            prevBtnText: String,              // Previous button text for this step
            showButtons: Boolean,             // Do not show control buttons in footer
            keyboardControl: Boolean,         // Allow controlling through keyboard (escape to close, arrow keys to move)
            scrollIntoViewOptions: Object,     // We use `scrollIntoView()` when possible, pass here the options for it if you want any
            onHighlightStarted (Element) {} // Called when element is about to be highlighted
            onHighlighted (Element) {}      // Called when element is fully highlighted
            onDeselected (Element) {}       // Called when element has been deselected
            onReset (Element) {}            // Called when overlay is about to be cleared
            onNext (Element) {}             // Called when moving to next step on any step
            onPrevious (Element)  {}        // Called when moving to previous step on any step
            */            

            stepDefinition: Array
            /*
            stepDefinition = {
               element: '#some-item',      // Query selector string or Node to be highlighted
               stageBackground: '#ffffff', // This will override the one set in driver
               popover: {                  // There will be no popover if empty or not given
               className: 'popover-class', // className to wrap this specific step popover in addition to the general className in Driver options
               title: 'Title',             // Title on the popover
               description: 'Description', // Body of the popover
               showButtons: false,         // Do not show control buttons in footer
               doneBtnText: 'Done',        // Text on the last button
               closeBtnText: 'Close',      // Text on the close button
               nextBtnText: 'Next',        // Next button text
               prevBtnText: 'Previous',    // Previous button text
               onNext: () => {},           // Called when moving to next step from current step
               onPrevious: () => {}        // Called when moving to previous step from current step
            }
            */
        }
    }

    constructor() {
        super();
        this.driverDefinition = null;
        this.stepDefinition = [];
        this.driver = new Driver();
    }

    createDriver (driverDefinitionJson) {
	    this.driverDefinition = JSON.parse(driverDefinitionJson);
	    this.driver = new Driver(this.driverDefinition)
    }

    defineSteps (stepDefinitionJson) {
	    this.stepDefinition = JSON.parse(stepDefinitionJson);
	    this.driver.defineSteps(this.stepDefinition);
    }

    start () {
        this.driver.start();
    }   

}

customElements.define('vaadin-driver-js', VaadinDriverJS);
