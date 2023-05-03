package com.example.springmodulithmoduletests.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
class FirstModuleTestHelper {
  private static final Logger log = LoggerFactory.getLogger(FirstModuleTestHelper.class);

  public void checkSomething() {
    log.info("Checking something");
  }
}
