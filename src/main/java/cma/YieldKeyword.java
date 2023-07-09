package cma;

import java.time.Month;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YieldKeyword {
  private static final Logger LOGGER = LoggerFactory.getLogger(YieldKeyword.class);

  public void test() {
    int days = 0;
    Month month = Month.APRIL;

    days = switch (month) {
      case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
        System.out.println(month);
        yield 31;
      }
      case FEBRUARY -> {
        System.out.println(month);
        yield 28;
      }
      case APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
        System.out.println(month);
        yield 30;
      }
      default -> throw new IllegalStateException();
  };

    LOGGER.info("Got days: {}", days);
}
}