# Sales Data Analysis Program 1 

## Description
You need to create a program that reads a `.csv` file containing sales data and loads it into a list of **Sale** objects. Follow the project guidelines (Do not use primitive types like `int` and `double` for attributes and methods; use wrapper types like `Integer` and `Double` instead).

### Steps:
1. **Download the CSV file**:
   - Download the sales data `.csv` file from the following link:
     [CSV Database](https://gist.github.com/acenelio/e4e169691ee5aef2c56c87bc22a54379)

2. **Data Analysis Requirements**:
   - After reading the data, perform the following analyses:
     1. **Top Five Sales of 2016**: Display the top five sales from 2016 with the highest average price. Sort the sales in descending order by average price.
     2. **Total Sales by Seller "Logan" in Months 1 and 7**: Calculate the total amount sold by the seller "Logan" in the months 1 and 7 of any year.
    
      ![image](https://github.com/user-attachments/assets/8ae915ef-e396-4f4f-86f5-0a07f6e5bcbb)



3. **Implementation Details**:
   - Use **Stream** and **lambda expressions** to extract the results from the original list.
   - Implement the `toString` method in the `Sale` class to facilitate displaying the results.

4. **Error Handling**:
   - If the file reading fails, handle the exception and display a user-friendly message as shown in the example.
   
### Class Structure:
1. **Sale Class**:
 - Attributes: `Integer id`, `Double price`, `String date`, `String seller`, etc.
 - Methods: 
   - `toString()` to display a readable format of the sale data.
   - `duration()` to calculate or return additional information if needed.

2. **Stream and Lambda Operations**:
 - Use Java **Streams** to filter, sort, and perform calculations on the sales data.
 - Use **Lambda expressions** for concise and readable code.

### Technologies Used:
- Java (or another suitable programming language)
- File reading,
- Exception Handling 
- Java Streams and Lambdas

### Actor:
Matheus Accorsi
