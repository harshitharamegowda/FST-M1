fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

key_to_check = input("What are you looking for? ").strip().lower()

quantity = fruit_shop.get(key_to_check)

if quantity is not None:
    print(f"Yes, we have {quantity} {key_to_check}(s) available.")
else:
    print("No, this is not available.")
