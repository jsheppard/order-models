package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

class RollTest {

  @Test
  void testRollCreation() {
    Roll roll = new Roll();
    roll.setId("roll-1");
    roll.setDescription("Cinnamon Roll");
    roll.setPrice(new BigDecimal("2.75"));
    roll.setUrl("http://example.com/cinnamon-roll.jpg");

    assertThat(roll.getId()).isEqualTo("roll-1");
    assertThat(roll.getDescription()).isEqualTo("Cinnamon Roll");
    assertThat(roll.getPrice()).isEqualTo(new BigDecimal("2.75"));
    assertThat(roll.getUrl()).isEqualTo("http://example.com/cinnamon-roll.jpg");
  }

  @Test
  void testEqualsAndHashCode() {
    Roll roll1 = new Roll();
    roll1.setId("roll-1");
    roll1.setDescription("Cinnamon Roll");

    Roll roll2 = new Roll();
    roll2.setId("roll-1");
    roll2.setDescription("Another Roll"); // Description differs, but ID is same

    Roll roll3 = new Roll();
    roll3.setId("roll-2");
    roll3.setDescription("Cinnamon Roll");

    // Since we are using @EqualsAndHashCode(of = {"id"}, callSuper = true),
    // and Donut uses @EqualsAndHashCode(of = {"id"}),
    // equality should primarily depend on ID if that's what the superclass enforces,
    // BUT callSuper=true means it also checks super.equals().
    // Donut's equals checks ID.
    // So if ID is same, they are equal.

    assertThat(roll1).isEqualTo(roll2);
    assertThat(roll1).hasSameHashCodeAs(roll2);
    assertThat(roll1).isNotEqualTo(roll3);
  }
}
