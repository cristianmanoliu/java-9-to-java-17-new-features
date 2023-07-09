package cma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Records {
  private static final Logger LOGGER = LoggerFactory.getLogger(Records.class);

  public void test() {
    VehicleRecord v1 = new VehicleRecord("A", "T1");
    LOGGER.info("Got v1: {}", v1);
    VehicleRecord v2 = new VehicleRecord("B", "T1");
    LOGGER.info("Got v2: {}", v2);
    VehicleRecord v3 = new VehicleRecord("A", "T1");
    LOGGER.info("Got v3: {}", v3);
    LOGGER.info("{}", v1.equals(v2));
    LOGGER.info("{}", v2.equals(v3));
    LOGGER.info("{}", v1.equals(v3));

  }
}

record VehicleRecord(String code, String engineType) {}