package org.example.tapestry.components.ui.dialog;

import org.apache.tapestry.MarkupWriter;
import org.apache.tapestry.annotations.BeginRender;

public class WizardStep1 {
    private String message = "Wizard step 1 component.";

    @BeginRender
    void renderMessage(MarkupWriter writer) {
        writer.write(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
