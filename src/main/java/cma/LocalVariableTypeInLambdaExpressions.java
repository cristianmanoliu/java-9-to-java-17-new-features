package cma;

import java.util.stream.IntStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocalVariableTypeInLambdaExpressions {

  private static final Logger LOGGER = LoggerFactory.getLogger(LocalVariableTypeInLambdaExpressions.class);

  public void test() {
    IntStream.range(0, 10).forEach((var n) -> {
      LOGGER.info("Got n: {}", n);
    });
  }

}
