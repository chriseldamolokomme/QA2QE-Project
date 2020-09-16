Feature:Searching Product list

#  Unregistered User
#As a unregistered user
#i want to view the product list
#so that i can select it

Scenario: Search a product
Given that you are on the home page
When you search for the product
Then you can view the product list page
