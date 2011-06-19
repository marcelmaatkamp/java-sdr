package org.jsdr;

import java.nio.ByteBuffer;

// Interface implemented by tabbed display components
public interface JsdrTab {
  public void newBuffer(ByteBuffer buf);
}
