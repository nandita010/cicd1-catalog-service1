
# Catalog Service

## Minimum-Price Query

GET `/products/min-price?price=100`

Returns products priced at or above the given minimum price.

## Products by Category

GET `/products/by-category?name=Computers`

This returns products that belongs to the
category that has been requested

Eg:
- `/products/by-category?name=Computers`
- `/products/by-category?name=Accessories`

## Create a Product

POST `/products`
returns 201 code or 400 code depending on 
whether the input was successful or not
Eg JSON request:

```json
{
  "name": "Keyboard",
  "price": 79.99,
  "categoryId": 2
}
```

