

Part C:
Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

mainscreen.html: line 14- Changed webpage to reflect customized shop.
mainscreen.html: line 19- Changed name of the shop.
mainscreen.html: line 21- Changed name of parts for the shop.
mainscreen.html: line 53- Changed name of products for the shop.



Part D Changes:
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

About.html: lines 1-17: inserted default html layout with bootstrap insertion.
About.html: lines 19-20: Added "About Us" title with description.
About.html: lines 22-26: Added reference that links back to mainscreen.
AboutController.java: lines 1-3: Imported packages for controller.
AboutController.java: lines 5-11: Created controller class with a mapping that returns that "About" page.
mainscreen.html: line 20: Created button that takes us to the "About" page.




Part E Changes:
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

BootStrapData.java: lines 44-70: Created parts for inhouse inventory.
BootStrapData.java: lines 76-84: Created if statement that check if the parts are already in the table to avoid duplicates.
BootStrapData.java: lines 112-116: Created products for product inventory.
BootStrapData.java: lines 118-125: Created condtion that checks if the products are already saved in the table to avoid duplicate products.



Part F Changes:
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

mainscreen.html: line 86: Created Buy Now button.
BuyProductController.java: lines 1-16: Imported necessary packages for controller.
BuyProductController.java: lines 20-28: Created BuyProduct controller that request buy now url.
BuyProductController.java: lines 30-35: Created conditional that decrements inventory everytime the Buy Now button is clicked.
BuyProductController.java: lines 35-44: Conditional also returns success or error url/page based on how many products are left.
errorPage.html: lines 1-14: Inserted default html layout with bootstrap insertion.
errorPage.html: lines 15-26: Added Error title with message if user attempts to buy product with no inventory left.
successPage.html: lines 1-14: Inserted default html layout with bootstrap insertion. Page will also redirect back to main screen.
successPage.html: lines 15-26: Added Success title with message if user attempts to buy product with enough inventory. Page will also redirect back to main screen.


Part G Changes:
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

mainscreen.html: lines 39-40: Added Minimum and Maximum title/description to the table.
mainscreen.html: lines 50-51: Added Minimum and Maximum parts to the table.
Part.java: lines 34-41: Declared minimum and maximum values with messages that will display when the user triggers an error.
Part.java: lines 58-64: Added values to constructor that will set attributes to its given parameters.
Part.java: lines 71-72: Added minimum and maximum parameters and set it equal to its attribute.
Part.java: lines 119-123: Created setter methods to update minimum and maximum values and getter methods to return their values.
Part.java: lines 130-132: Created boolean to set constraints for minimum and maximum values. 
application.properties: line 6: Changed spring.datasource.url to spring.datasource.url=jdbc:h2:file:~/Bernard-Java-WGU.mv.db.
InhousePartForm.html: lines 26-28: Added minimum and maximum text field options for the Inhouse form.
InhousePartForm.html: lines 30-34: Added condition that will return an error if it triggered through any of the text fields in the Inhouse form.
OutsourcedPartForm.html: lines 26-32: Added minimum and maximum text field options for the Outsourced parts form as well as error conditions that could be triggered by the user through each field.
BootStrapData.java: lines 57-58, 66-67, 74-75, 83-84, 92-93: Set minimum and maximum values for each part that was listed.



Part H Changes:
Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

AddInhousePartController.java: lines 41-44: Set condition to return a warning message if the inventory added by the user is greater than max inventory limit allowed in the Inhouse.
AddInhousePartController.java: lines 46-49: Set condition to return a warning message if the inventory added by the user is below the minimum inventory limit allowed in the Inhouse.
AddOutsourcedPartController.java: lines 44-47: Set condition to return a warning message if the inventory added by the user is greater than max inventory limit allowed in the Outsourced.
AddOutsourcedPartController.java: lines 49-52: Set condition to return a warning message if the inventory added by the user is below the minimum inventory limit allowed in the Outsourced.
EnufPartsValidator.java: line 36: Displayed error message for low inventory when adding and updating products lowers the part inventory below the minimum.
ValidEnufParts.java: line 20: Added additional message for when there are not enough parts.


Part I Changes:
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

PartTest.java: lines 153-160: Created unit test for minimum inventory field with random value declared for the test.
PartTest.java: lines 162-169: Created unit test for maximum inventory field with random value set to test.



Part J Changes:
Remove the class files for any unused validators in order to clean your code.

DeletePartValidator.java: DELETED AS THERE WERE NO USAGES REPORTED
EnufPartsValidator.java: Usages found
PriceProductValidator.java: Usages found
ValidDeletePart.java: Usages found
ValidEnufParts.java: Usages found
ValidProductPrice.java: Usages found
