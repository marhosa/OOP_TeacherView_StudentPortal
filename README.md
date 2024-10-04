# Student_Professor_Admin_System
Beginner Simple Java OOP Project where you are a teacher that can add and remove your own students and courses.
took me 8hrs to code and debug... well mostly debug.
Methods Description are generated with document generator.

Everything here is unique and no AI generators are made (except sa documentation katamad gawin lol).

How to use:
---

1.) [Download](https://github.com/marhosa/OOP_TeacherView_StudentPortal/archive/refs/heads/main.zip) source code


2.) Go To OOPMIDTERMSLAB -> src -> Main and run Main.java

Some Stuff to Note:
---


Algorithms
---
Unoptimized, but can be improved.

Search Algorithm Used is Linear Search.

Sort Algorithm Used is Bubble Sort.

Main.java
---


**STATIC METHODS**

---

**studentExists(int SN, List<Student> students)**

- Parameters:
  - `SN`: Student number (int).
  - `students`: List of `Student` objects (List<Student>).
  
- Description: Checks if a student with the given student number (`SN`) exists in the `students` list. Returns `true` if the student is found, otherwise returns `false`.

---

**listStudents(List<Student> students)**

- Parameters:
  - `students`: List of `Student` objects (List<Student>).
  
- Description: Outputs the unique identifier (Student Number) and name (First Name and Last Name) of each student in the `students` list. No return type.

---

**listSubject(List<Subject> subjects)**

- Parameters:
  - `subjects`: List of `Subject` objects (List<Subject>).
  
- Description: Outputs the unique identifier (Subject Code) and name of each subject in the `subjects` list. No return type.

---

**listsubmenu()**

- Parameters: None.
  
- Description: Displays a description of available options for modifying a subject. No parameters and no return type.

---

**spacer(int x)**

- Parameters:
  - `x`: Number of newlines to output (int).
  
- Description: Outputs `x` number of newlines to clean up the terminal display. No return type.

---

**printMainMenu()**

- Parameters: None.
  
- Description: Displays the main menu in the terminal. No parameters and no return type.

---

**generateStudentNum(int x)**

- Parameters:
  - `x`: Index or sequential identifier of the student (int).
  
- Description: Returns a student number based on the provided index `x`. Student numbers of deleted accounts cannot be reused. Returns an integer representing the student number.

---

**generateCourseCode(int x)**

- Parameters:
  - `x`: Index or sequential identifier of the course (int).
  
- Description: Similar to `generateStudentNum()`, but generates a course code for a subject instead of a student. Returns an integer representing the course code.

---
---

**CLASS: People**

---

**CONSTRUCTOR**

People(String FN, String LN)

- Parameters:
  - `FN`: First Name of the person (String).
  - `LN`: Last Name of the person (String).
  
- Description: Initializes a `People` object with a given first name (`FN`) and last name (`LN`).

---

**GETTERS**

getFirstName()

- Parameters: None.
  
- Description: Returns the first name (`First_Name`) of the person as a `String`.

---

getLastName()

- Parameters: None.
  
- Description: Returns the last name (`Last_Name`) of the person as a `String`.

---

**SETTERS**

setFirstName(String name)

- Parameter:
  - `name`: New first name to be set (String).
  
- Description: Updates the first name (`First_Name`) of the person to the provided `name`.

---

setLastName(String name)

- Parameter:
  - `name`: New last name to be set (String).
  
- Description: Updates the last name (`Last_Name`) of the person to the provided `name`.

---



---

**CLASS: Student**

---

**CONSTRUCTOR**

Student(String FN, String LN, int sn)

- Parameters:
  - `FN`: First Name of the student (String).
  - `LN`: Last Name of the student (String).
  - `sn`: Student number (int).
  
- Description: Initializes a `Student` object with a given first name (`FN`), last name (`LN`), and student number (`sn`). Calls the constructor of the superclass `People` to set the first and last name.

---

**GETTERS**

getStudent_number()

- Parameters: None.
  
- Description: Returns the student number (`student_number`) of the student as an `int`.

---

**SETTERS**

setStudent_number(int student_number)

- Parameter:
  - `student_number`: New student number to be set (int).
  
- Description: Updates the student number (`student_number`) of the student to the provided `student_number`.

---




Here’s the documentation for the `Subject` class in the style you requested:

---

**CLASS: Subject**

---

**CONSTRUCTOR**

Subject(String Subject_Name, int Subject_Code)

- Parameters:
  - `Subject_Name`: Name of the subject (String).
  - `Subject_Code`: Code of the subject (int).
  
- Description: Initializes a `Subject` object with the provided `Subject_Name` and `Subject_Code`. Initializes a 2D array `Subject_Grades` to store student numbers and their corresponding grades, with a maximum of 100 students.

---

**METHODS**

---

**enrolledStudentsTotal()**

- Parameters: None.
  
- Description: Returns the total number of students enrolled in the subject. It checks the `Subject_Grades` array and counts students whose student number is not zero.

---

**getMax_Students()**

- Parameters: None.
  
- Description: Returns the maximum number of students allowed in the subject (`Max_Students`), which is set to 100.

---

**getStudentnumandgrade()**

- Parameters: None.
  
- Description: Returns a 2D array of enrolled students and their grades. The first row contains the student numbers, and the second row contains their corresponding grades. Only enrolled students are included in this array (i.e., those whose student number is not zero).

---

**changeGrade(int SN, int grade)**

- Parameters:
  - `SN`: Student number (int).
  - `grade`: New grade to be assigned (int).
  
- Description: Updates the grade of the student with the given student number (`SN`). It searches the `Subject_Grades` array and modifies the grade of the matching student.

---

**getSubject_Name()**

- Parameters: None.
  
- Description: Returns the name of the subject (`Subject_Name`) as a `String`.

---

**getSubject_Code()**

- Parameters: None.
  
- Description: Returns the code of the subject (`Subject_Code`) as an `int`.

---

**isEnrolled(int SN)**

- Parameters:
  - `SN`: Student number (int).
  
- Description: Checks if the student with the given student number (`SN`) is enrolled in the subject. Returns `true` if the student is found in the `Subject_Grades` array, `false` otherwise.

---

**removeStudent(int SN)**

- Parameters:
  - `SN`: Student number (int).
  
- Description: Removes the student with the given student number (`SN`) from the subject. It sets both the student number and their grade to zero in the `Subject_Grades` array.

---

**getStudent_Grade(int SN)**

- Parameters:
  - `SN`: Student number (int).
  
- Description: Returns the grade of the student with the given student number (`SN`). If the student is not found, it returns `-10`.

---

**setSubject_Name(String Subject_Name)**

- Parameters:
  - `Subject_Name`: New name of the subject (String).
  
- Description: Updates the subject's name to the provided `Subject_Name`.

---

**setSubject_Code(int Subject_Code)**

- Parameters:
  - `Subject_Code`: New code of the subject (int).
  
- Description: Updates the subject's code to the provided `Subject_Code`.

---

**setStudent_Grades(int StudentNumber, int Grade)**

- Parameters:
  - `StudentNumber`: Student number (int).
  - `Grade`: Grade of the student (int).
  
- Description: Enrolls a student by adding their student number and grade to the `Subject_Grades` array. It assigns the values to the first available slot (where the student number is less than 1000).

---

User Flow Chart
---
![image](https://github.com/user-attachments/assets/69d039e4-dd64-4d10-bc5c-8d36aea6754a)


UML in a nutshell
---
![image](https://github.com/user-attachments/assets/13eb5729-3e6f-479c-84b9-441d7926a7c2)


