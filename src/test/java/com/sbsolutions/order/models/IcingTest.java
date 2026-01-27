package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class IcingTest {

  @Test
  void testIcingCreation() {
    Icing icing = new Icing();
    icing.setId("1");
    icing.setDescription("Chocolate");
    icing.setUrl("http://example.com/chocolate.jpg");

    assertThat(icing.getId()).isEqualTo("1");
    assertThat(icing.getDescription()).isEqualTo("Chocolate");
    assertThat(icing.getUrl()).isEqualTo("http://example.com/chocolate.jpg");
  }

  @Test
  void testIcingAllArgsConstructor() {
    Icing icing = new Icing("1", "Chocolate", "http://example.com/chocolate.jpg");

    assertThat(icing.getId()).isEqualTo("1");
    assertThat(icing.getDescription()).isEqualTo("Chocolate");
    assertThat(icing.getUrl()).isEqualTo("http://example.com/chocolate.jpg");
  }
}
