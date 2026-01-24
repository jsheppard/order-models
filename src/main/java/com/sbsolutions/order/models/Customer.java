package com.sbsolutions.order.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customers")
public class Customer {

  @Id
  String id;
  String firstName;
  String middleName;
  String lastName;
  String address1;
  String address2;
  String city;
  String state;
  String zip;
  String phone;
  String email;
}
