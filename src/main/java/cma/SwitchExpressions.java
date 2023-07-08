package cma;

import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwitchExpressions {
  private static final Logger LOGGER = LoggerFactory.getLogger(SwitchExpressions.class);

  public void test() {
    int days = 0;
    Month month = Month.APRIL;

    days = switch (month) {
      case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
      case FEBRUARY -> 28;
      case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
      default -> throw new IllegalStateException();
    };
    LOGGER.info("Got days: {}", days);
  }
}
