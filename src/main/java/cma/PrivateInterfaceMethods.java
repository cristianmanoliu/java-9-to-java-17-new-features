package cma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface PrivateInterfaceMethods {
  Logger LOGGER = LoggerFactory.getLogger(PrivateInterfaceMethods.class);

  default void defaultMethod() {
    LOGGER.info("Calling defaultMethod");
    privateMethod();
  }

  private void privateMethod() {
    LOGGER.info("Calling privateMethod");
  }
}
