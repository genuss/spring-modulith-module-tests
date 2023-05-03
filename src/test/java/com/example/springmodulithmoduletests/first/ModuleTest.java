package com.example.springmodulithmoduletests.first;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest(mode = ApplicationModuleTest.BootstrapMode.STANDALONE)
class ModuleTest {

  @Autowired FirstModuleTestHelper helper;

  @Test
  void checkingModularity() {
    Assertions.assertThatCode(() -> helper.checkSomething()).doesNotThrowAnyException();
  }
}
