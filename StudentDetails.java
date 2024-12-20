import java.io.*;
import java.util.*;

class Student {
    String rollNumber;
    String name;
    String department;
//construuctor
    public Student(String rollNumber, String name, String department) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + "\nName: " + name + "\nDepartment: " + department;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
// HashMap to store student data, rollnumber as keys and StudentName as values
        Map<String, Student> studentMap = new HashMap<>();
//CSV files corresponding to Department names
        String[] Files = {"CSE.csv", "CME.csv"};
        String[] departments = {"CSE", "CME"};

        for (int i = 0; i < Files.length; i++) {
            String File = Files[i];
            String department = departments[i];

            try (BufferedReader br = new BufferedReader(new FileReader(File))) {
                String line;
//Read each line from the CSV file
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    if (data.length == 2) { 
                        String rollNumber = data[0].trim();
                        String name = data[1].trim();
                        studentMap.put(rollNumber, new Student(rollNumber, name, department));
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading the file");
            }
        }
        // 'scanner' object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number to search: ");
        String search = scanner.nextLine().trim();

        // if student found print their details else pritn Student not found
        if (studentMap.containsKey(search)) {
            System.out.println("\nStudent Details: ");
            System.out.println(studentMap.get(search));  
        } else {
            System.out.println("No student found with Roll Number: " + search);
        }

        scanner.close();
    }
}
