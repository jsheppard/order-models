package com.sbsolutions.order.models;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Document(collection = "customers")
public class Customer implements Serializable {

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
