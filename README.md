## Marks Manager System
An efficient Java application designed to manage student academic records. This tool automates the process of recording marks, calculating grade point averages (GPA), and determining pass/fail status based on predefined criteria.
## Core Features
* Score Entry: Input marks for multiple subjects or students through a streamlined console interface.
* Automatic Grade Calculation: Instantly converts numeric scores into letter grades (e.g., A, B, C) based on institutional grading scales.
* Performance Analytics: Calculates total marks, percentage, and class averages.
* Result Summary: Provides a clear report of student performance, highlighting strengths and areas for improvement.
## Technical Implementation
The application is built using core Java logic to handle data processing and conditional reporting:
* Arrays/Lists: Used to store scores for multiple subjects or a roster of students.
* Conditional Logic: Implements if-else ladders to categorize percentages into specific grade brackets.
* Mathematical Operations: Uses precise arithmetic to handle percentage calculations and rounding.
*Standard I/O: Utilizes the Scanner class for dynamic user interaction.
## Setup and Installation
### Prerequisites
* Java Development Kit (JDK): Version 8 or higher.
* Terminal/Console: To run the compiled .class file.

### Quick Start
1. Clone the repository:
```Bash```
git clone https://github.com/Haniatahir05/MarksManager.git
```Bash```
2. Navigate to the directory:
```Bash```
cd MarksManager
3. Compile the source code:
```Bash```
javac MarksManager.java
```Bash```
javac MarksManager.java
4. Run the application:
```Bash```
java MarksManager
```Bash```
## User Workflow
1. Input Phase: Enter the number of subjects and the marks obtained in each.
2. Processing: The system calculates the aggregate and percentage.
3. Output: View the final grade, total score, and whether the student met the passing requirements.
## Future Enhancements
 * Implementation of file handling to save student records to a .txt or .csv file.

 * Graphical visualization of marks using a bar chart (JavaFX).

 * Ability to manage entire classrooms with multiple student profiles.
