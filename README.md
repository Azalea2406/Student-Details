~ **StudentDetails: A Java Application**
~ **_Project Overview:_**
* The Application allows user to store and retrieve student information based on roll numbers.
** It reads the student information from the CSV files, stores the information in a HashMap and allows the user to search for the student details by entering a roll number.

~ **_Requirements_**
*A Java Runtime Environment (JRE) or JDK installed on your system.
* CSV Files containing Data in the Format "RollNumber, Name"
** The department name is extracted from the CSV File name.

~ **_Running the Program_**
* You can run the StudentDetails.java file directly
** The program will read the student data from the CSV file and load it in its memory

~ **_Searching the Student Details_** 
*After loading, it will ask to user to "Enter Roll Number to search: " to search for the student details
**Example: Enter Roll Number to search: 160623733085
      Output:
      Student Details: 
      Roll Number: 160623733085
      Name: Ishrath Tabassum
      Department: CSE
** If no student is found with the entered roll number, it will display "No student found with Roll Number: 160623733085"

~ **_How the code works:_**
The program defines a `Student` class that holds the details of a student, such as:
   - Roll number
   - Name
   - Department (extracted from the CSV file name)
   
2. The program uses a **`HashMap`** to store student data with roll numbers as the key.

3. The program reads two CSV files (`CSE.csv`, `CME.csv`), extracts student data from them, and stores the data in the `HashMap`.

4. The program then prompts the user to enter a roll number. It searches the map for a matching student and prints the student's details if found.

5. **Output Format:**
   - If the roll number is found:
     
     Student Details:
     Roll Number: <roll number>
     Name: <student name>
     Department: <department>
     
   - If the roll number is not found:

     No student found with Roll Number: <roll number>
        

 
