package com.sbsolutions.order.models;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CustomerTest {

  @Test
  void testCustomerCreation() {
    Customer customer = new Customer();
    customer.setId("1");
    customer.setFirstName("John");
    customer.setMiddleName("D");
    customer.setLastName("Doe");
    customer.setAddress1("123 Main St");
    customer.setAddress2("Apt 4B");
    customer.setCity("Springfield");
    customer.setState("IL");
    customer.setZip("62704");
    customer.setPhone("555-1234");
    customer.setEmail("john.doe@example.com");

    assertThat(customer.getId()).isEqualTo("1");
    assertThat(customer.getFirstName()).isEqualTo("John");
    assertThat(customer.getMiddleName()).isEqualTo("D");
    assertThat(customer.getLastName()).isEqualTo("Doe");
    assertThat(customer.getAddress1()).isEqualTo("123 Main St");
    assertThat(customer.getAddress2()).isEqualTo("Apt 4B");
    assertThat(customer.getCity()).isEqualTo("Springfield");
    assertThat(customer.getState()).isEqualTo("IL");
    assertThat(customer.getZip()).isEqualTo("62704");
    assertThat(customer.getPhone()).isEqualTo("555-1234");
    assertThat(customer.getEmail()).isEqualTo("john.doe@example.com");
  }

  @Test
  void testCustomerAllArgsConstructor() {
    Customer customer = new Customer("1", "John", "D", "Doe", "123 Main St", "Apt 4B", "Springfield", "IL", "62704", "555-1234", "john.doe@example.com");

    assertThat(customer.getId()).isEqualTo("1");
    assertThat(customer.getFirstName()).isEqualTo("John");
    assertThat(customer.getMiddleName()).isEqualTo("D");
    assertThat(customer.getLastName()).isEqualTo("Doe");
    assertThat(customer.getAddress1()).isEqualTo("123 Main St");
    assertThat(customer.getAddress2()).isEqualTo("Apt 4B");
    assertThat(customer.getCity()).isEqualTo("Springfield");
    assertThat(customer.getState()).isEqualTo("IL");
    assertThat(customer.getZip()).isEqualTo("62704");
    assertThat(customer.getPhone()).isEqualTo("555-1234");
    assertThat(customer.getEmail()).isEqualTo("john.doe@example.com");
  }

  @Test
  void testEqualsAndHashCode() {
    Customer customer1 = new Customer("1", "John", "D", "Doe", "123 Main St", "Apt 4B", "Springfield", "IL", "62704", "555-1234", "john.doe@example.com");
    Customer customer2 = new Customer("1", "Jane", "E", "Doe", "456 Elm St", "Apt 1A", "Shelbyville", "IL", "62565", "555-5678", "jane.doe@example.com");
    Customer customer3 = new Customer("2", "John", "D", "Doe", "123 Main St", "Apt 4B", "Springfield", "IL", "62704", "555-1234", "john.doe@example.com");

    assertThat(customer1).isEqualTo(customer2);
    assertThat(customer1).hasSameHashCodeAs(customer2);
    assertThat(customer1).isNotEqualTo(customer3);
  }
}
