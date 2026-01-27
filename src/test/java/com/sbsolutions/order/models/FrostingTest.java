package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FrostingTest {

  @Test
  void testFrostingCreation() {
    Frosting frosting = new Frosting();
    frosting.setId("1");
    frosting.setDescription("Vanilla");
    frosting.setUrl("http://example.com/vanilla.jpg");

    assertThat(frosting.getId()).isEqualTo("1");
    assertThat(frosting.getDescription()).isEqualTo("Vanilla");
    assertThat(frosting.getUrl()).isEqualTo("http://example.com/vanilla.jpg");
  }

  @Test
  void testFrostingAllArgsConstructor() {
    Frosting frosting = new Frosting("1", "Vanilla", "http://example.com/vanilla.jpg");

    assertThat(frosting.getId()).isEqualTo("1");
    assertThat(frosting.getDescription()).isEqualTo("Vanilla");
    assertThat(frosting.getUrl()).isEqualTo("http://example.com/vanilla.jpg");
  }
}
