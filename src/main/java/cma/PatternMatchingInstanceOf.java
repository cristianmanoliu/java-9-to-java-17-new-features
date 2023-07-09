package cma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatternMatchingInstanceOf {
  private static final Logger LOGGER = LoggerFactory.getLogger(PatternMatchingInstanceOf.class);

  public void test() {
    Object obj = "x";
    if (obj instanceof String str) {
      LOGGER.info("Got str: {}", str);
    }
  }

}
