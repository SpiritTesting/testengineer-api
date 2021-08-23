package com.spirit.testing.testoffice.accesspoint.user.browser;

import com.spirit.testing.testoffice.engine.AbstractEngine;
import com.spirit.testing.testoffice.engine.browser.Engine;
import com.spirit.testing.testoffice.engine.browser.EngineCommand;

public class UserEngineCommand extends EngineCommand {

    public UserEngineCommand(AbstractEngine engine) {
        super(engine);
    }

    private Engine getBrowserEngine() {
        return (Engine) super.engine;
    }

}
