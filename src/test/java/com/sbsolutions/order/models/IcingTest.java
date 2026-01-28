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

  @Test
  void testEqualsAndHashCode() {
    Icing icing1 = new Icing("1", "Chocolate", "http://example.com/chocolate.jpg");
    Icing icing2 = new Icing("1", "Vanilla", "http://example.com/vanilla.jpg"); // Different data, same ID
    Icing icing3 = new Icing("2", "Chocolate", "http://example.com/chocolate.jpg");

    assertThat(icing1).isEqualTo(icing2);
    assertThat(icing1).hasSameHashCodeAs(icing2);
    assertThat(icing1).isNotEqualTo(icing3);
  }
}
