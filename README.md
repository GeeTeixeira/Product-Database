# Product Database
Interface of my current project. It is a work-in progress, and the code will be uploaded here when I launch its first version.
# Features
1. **Incoming Package**
    - Creates new incoming package for products.
      - Registers transportation fees, currency exchange, transportation type, and receiving date.
      - Adding Individual products (it allows the user to select an existing product in the database and add it to new package, or create new entry): 
        - Name 
        - Description
        - Quantity
        - Store (Purchased at)
        - Department (e.g. Pharmacy, Toys, Clothing, etc.)
        - Gender
        - Size
        - Price paid (in foreign currency)
        - Price for sale (if known). If left 0.00, the program will automatically set Price for sale based on a preset profit magin based on Price paid.
2. **Database View**
    - View all existing products.
        - All fields listed above.
        - Details for pricing 
            - Paid in foreign and national currency
            - Transportation fees
            - Taxes
            - Final price
    - Allows for Product editing (e.g. Details like name and description, price for sale, quantity, etc.)
    - Register sale
      - Keep track of payment method and adjusts price if fee for credit card payment is applicable. 
      - Allows to change prices and quantities for individual products.
3. **Finance Management**
    - Track of monetary value on-hand.
    - Track monthly sales.
    - Track business expenses.
    - Track total payroll on business.
    - Feature to "Close" sales, expenses, and payroll for the month.
    - Export csv spreadsheet:
      - Products on hand 
      - Current or past month finances 
      - Current sales or expenses


- Main Screen.png: This screen contains 3 buttons. Top button opens "Product search", middle button opens "Current month information+options", bottom button opens "Create new package."

- Product search.png, Product results.png: This screen allows user to view all products in the database. Once the are products listed in this interface, the user is able to view pricing details, edit product information(e.g. price, name, description, size, delete product, etc.), and generate sale.

- Current month information+options.png: This screen provides the user with information for the current month: how much are all products on hand are worth, total amount in sales, salary, and expenses. The buttons on this screen allows the user to create, view, and delete current month's expenses and view and delete sales, and to close the current month's.

- Create new package.png and New Product.png: Create new package collects information for new product arrival. In this screen, the user is able to input dolar exchange, transportation fee and method, and taxes over the proucts. new Product.png allows the user to enter product information and build the package. 
