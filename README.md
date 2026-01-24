# order-models

Shared domain models library for the Order Management System.

## Overview

This module contains all entity and domain model classes used across the order management system. It provides a single source of truth for data structures, eliminating code duplication between `order-data` and `order-administration`.

## Models

### Customer
Customer information entity with MongoDB @Document annotation.

**Fields:**
- `id` - Unique identifier
- `firstName` - Customer's first name
- `middleName` - Customer's middle name
- `lastName` - Customer's last name
- `address1` - Primary address line
- `address2` - Secondary address line
- `city` - City
- `state` - State
- `zip` - ZIP code
- `phone` - Phone number
- `email` - Email address

**Annotations:** `@Document(collection = "customers")`

### Donut
Donut catalog entity with validation.

**Fields:**
- `id` - Unique identifier
- `description` - Donut description (@NotBlank)
- `price` - Price (@NotBlank, BigDecimal)
- `unit` - Unit of measure (default: "USD")
- `currency` - Currency code
- `url` - Image URL

**Annotations:** `@Document(collection = "donuts")`

### Order
Order header entity.

**Fields:**
- `id` - Unique identifier
- `customerId` - Customer reference (Integer)
- `orderDate` - Order creation date
- `type` - Order type (OrderType enum, default: DELIVERY)
- `deliverDate` - Delivery date
- `approved` - Approval status (Boolean)
- `approvedDate` - Approval timestamp
- `items` - List of order items (List<Item>)

### Item
Order line item.

**Fields:**
- `id` - Unique identifier
- `orderId` - Order reference (Integer)
- `itemId` - Item reference (Integer)
- `itemType` - Item type (ItemType enum)
- `qty` - Quantity (Integer)

### Frosting
Donut frosting option.

**Fields:**
- `id` - Unique identifier
- `description` - Frosting description
- `url` - Image URL

### Icing
Donut icing option.

**Fields:**
- `id` - Unique identifier
- `description` - Icing description
- `url` - Image URL

### OrderType (Enum)
Order fulfillment types:
- `PICKUP` - Customer pickup
- `DELIVERY` - Home delivery
- `STANDARD` - Standard order

### ItemType (Enum)
Item classification types (currently empty, extensible).

## Package Structure

All models are in the package:
```
com.sbsolutions.order.models
```

## Dependencies

All dependencies use `provided` scope, meaning they must be supplied by consuming modules:

- **Spring Data MongoDB** - For `@Document`, `@Id` annotations
- **Lombok** - For `@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`, `@RequiredArgsConstructor`
- **Jakarta Validation API** - For `@NotBlank` validation

## Usage

### Add as Dependency

In your module's `pom.xml`:

```xml
<dependency>
    <groupId>com.sbsolutions</groupId>
    <artifactId>order-models</artifactId>
</dependency>
```

(Version is managed by parent POM)

### Import Models

```java
import com.sbsolutions.order.models.Customer;
import com.sbsolutions.order.models.Order;
import com.sbsolutions.order.models.Donut;
import com.sbsolutions.order.models.Item;
import com.sbsolutions.order.models.OrderType;
// etc.
```

### Example Usage

```java
Customer customer = new Customer();
customer.setFirstName("John");
customer.setLastName("Doe");
customer.setEmail("john@example.com");

Order order = new Order();
order.setCustomerId(customer.getId());
order.setType(OrderType.DELIVERY);
order.setOrderDate(new Date());

Item item = new Item();
item.setItemId(123);
item.setQty(2);
order.setItems(List.of(item));
```

## Building

```bash
mvn clean install
```

This creates: `target/order-models-1.0.0-SNAPSHOT.jar`

## Design Philosophy

- **Lightweight:** All dependencies are `provided` scope
- **Framework-agnostic:** Models can be used with any persistence framework
- **Annotation-friendly:** Supports Spring Data MongoDB and JPA
- **Validation-ready:** Includes Jakarta Validation annotations where needed
- **Lombok-powered:** Reduces boilerplate with `@Data` and constructor annotations

## Notes

- MongoDB `@Document` annotations are present but ignored by non-MongoDB consumers (like order-administration using JPA)
- All fields use wrapper types (Integer, Boolean) to allow null values
- BigDecimal is used for monetary values (price)
- Date fields use `java.util.Date` (consider migrating to `java.time` API)
