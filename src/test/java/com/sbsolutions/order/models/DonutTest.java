package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class DonutTest {

  @Test
  void testDonutCreation() {
    Donut donut = new Donut();
    donut.setId("1");
    donut.setDescription("Glazed");
    donut.setPrice(new BigDecimal("1.50"));
    donut.setUrl("http://example.com/glazed.jpg");

    assertThat(donut.getId()).isEqualTo("1");
    assertThat(donut.getDescription()).isEqualTo("Glazed");
    assertThat(donut.getPrice()).isEqualTo(new BigDecimal("1.50"));
    assertThat(donut.getUrl()).isEqualTo("http://example.com/glazed.jpg");
  }

  @Test
  void testDonutAllArgsConstructor() {
    Donut donut = new Donut("1", "Glazed", new BigDecimal("1.50"), "http://example.com/glazed.jpg");

    assertThat(donut.getId()).isEqualTo("1");
    assertThat(donut.getDescription()).isEqualTo("Glazed");
    assertThat(donut.getPrice()).isEqualTo(new BigDecimal("1.50"));
    assertThat(donut.getUrl()).isEqualTo("http://example.com/glazed.jpg");
  }

  @Test
  void testEqualsAndHashCode() {
    Donut donut1 = new Donut("1", "Glazed", new BigDecimal("1.50"), "http://example.com/glazed.jpg");
    Donut donut2 = new Donut("1", "Chocolate", new BigDecimal("2.00"), "http://example.com/choco.jpg");
    Donut donut3 = new Donut("2", "Glazed", new BigDecimal("1.50"), "http://example.com/glazed.jpg");

    assertThat(donut1).isEqualTo(donut2);
    assertThat(donut1).hasSameHashCodeAs(donut2);
    assertThat(donut1).isNotEqualTo(donut3);
  }
}
