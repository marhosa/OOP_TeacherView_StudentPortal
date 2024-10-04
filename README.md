# Student_Professor_Admin_System
Beginner Simple Java OOP Project where you are a teacher that can add and remove your own students and courses.
took me 8hrs to code and debug... well mostly debug.

How to use:
---

1.) Download source code

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

studentExists()

- inputs

-  parameter: int SN

-  parameter: List<Student> students 

- description:  Checks if SN exists (Student Number) in the list parameter students, returns a boolean, true if yes, false otherwise.


listStudents() and listSubject()

- parameters: List<Student> students and List<Subject> subjects.

- description: simply outputs all the items in the list, specifically their Unique Identifier and Name. no return type.


listsubmenu() 

- description: simply outputs a description of other options when user is about to modify a subject. no parameters, no return type.


spacer()

- parameter: int x

- description: simply outputs x amount of endlines to make the terminal look clean. no return type.


printMainMenu()

- description: simply outputs the main menu as a terminal GUI. no return type, no parameters.


generateStudentNum()

- parameter: int x

- description: returns a student number based on the index of the created account, NOTE: deleted accounts cannot have their student number reused. returns an integer (the student number).


generateCourseCode()

- paramter: int x

- description: same as generateStudentNum() method but for Subjects instead of Students.


Here’s the documentation for the `People` class in the style you requested:

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


