# Student Planner

This project will be a notebook application with several facets of functionality. The first is a daily planner, which the user can add events to. The events can be searched through by day, and the system will give the user a heads up for upcoming events. The planner will also be linked to sakai, automatically creating events based on when assignments are due. The application will also have a notepad section, in which users can freely write ideas and thoughts. After writing, the user will save the page, which will be stored and sorted by date or title of page. In addition to theses abilities, the application could also implement an address book and password keeper. Users will have to login to access their data, and multiple accounts can be used on the same computer. 

This software is intended for students who would like an all-in-one organization system for their schoolwork. Currently, in order to get a feel for the amount of work assigned at a time, a student has to search through multiple tabs in sakai. Having a centralized digital planner that is connected to Sakai allows a student to manage their work seamlessly, while also adding events that are not assigned through sakai manually. The software will also feature a writing pad, in which students can write notes freely, while the program saves the notes in a orderly fashion. The notes can be filtered by date, or by class. 

### [Use Case Diagram](https://drive.google.com/file/d/1pyiSyq4cr9E0_mhlocDQwMX4KHWh6suD/view?usp=sharing)
1. Students can log in and out of their accounts to save their data and return later
2. Students can add and remove events outside of Sakai. These events will show up in the list of all events when created.
3. Students can look through all of the events in their planner, sorted either by date or class
4. Students can add notes to their notebook
5. Students can refer to past notes, listed in order by date or class
6. Students can open their gradebook and see how they are doing in each class
7. Teachers assign work through sakai, which show up in the students assignment list

### [Class Diagram](https://drive.google.com/file/d/1ptCs7qXZWN4dSPfqtQUgzBzX6XIl-o91/view?usp=sharing)

### Sequence Diagrams
* [New Note](https://drive.google.com/file/d/19E_xkqQs1gOnadYpySpmjDFNo33XB3iI/view?usp=sharing)
* [Check Assignments](https://drive.google.com/file/d/1nPiFlQHH0Nuc9lfj3f8c5pO3s207jpxM/view?usp=sharing)

### [State Diagram](https://drive.google.com/file/d/1NhxlNTLmc5zMIliwPEXSfaMXIFzKYZjf/view?usp=sharing)

### Design Patterns
* Strategy Pattern
  * This pattern will be implemented with the organizer class. The organizer class implements from planner, gradebook and notebook, and will change to these states depending on what the user is doing.
* Iterator Pattern
  * This pattern is used for accessing the lists of events and notes, from the planner and notebook classes. The two classes will store the data in an organized way, allowing the UI to iterate through easily.
* Decorator Pattern
  * This pattern was considered to be used to decorate the event class. It would add the functionality of choosing between a "due date" and an "event date". However, I believe it would be easier to make this destinction within the event class itself. 
  
### Minimal Viable Product
The MVP of this project is simply allowing a user to add, remove and view assignments that they added manually. It requires StudentUI, Planner, and Event. 


