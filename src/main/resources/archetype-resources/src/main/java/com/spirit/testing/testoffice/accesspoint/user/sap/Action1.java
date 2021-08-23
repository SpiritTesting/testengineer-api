package com.spirit.testing.testoffice.accesspoint.user.browser;

import com.spirit.testing.testoffice.engine.AbstractEngine;
import com.spirit.testing.testoffice.engine.TcdlParameters;
import com.spirit.testing.testoffice.engine.TcdlResult;
import com.spirit.testing.testoffice.engine.VariableHandler;

public class Action1 extends UserEngineCommand {

  public Action1(AbstractEngine engine) {
    super(engine);
  }

  @Override
  protected boolean executeAction(Object component, TcdlParameters tcdlParam, TcdlResult tcdlResult,
                                  VariableHandler handler) throws Exception {
    return false;
  }

}
