# Library System 📚

## Introduction

This project implements a Library System to manage books, users, and transactions. The system provides functionalities for managing different types of users, books, and authors, as well as a rental system.

---

## Features

- 🏠 **Library Management**: Create multiple library branches, each assigned to a single Branch Manager.  
- 📖 **Book Management**: Add, remove, and update book information.
- 🧑‍💼 **User Management**: Register three types of users: Administrator, Branch Manager, and Customer.
- 🔄 **Rental System**: Allow customers to request book rentals
- 📊 **Transaction History**: Maintain a record of all rental activities.
- 🔍 **Search Functionality**: Search for books by title, author, or ISBN.

---

## Technologies Used

- **Programming Language**: Java
- **Database**: None
- **Framework**: Swing UI
- **Development Tools**: Netbeans IDE

---

## Usage

The library system comes with preloaded sample data, including an admin, two branch managers, three customers, authors, and a collection of book records.

### Roles and Permissions

- Admin:
  - Can create three types of users: admin, branch manager, and customer.
  - Can add new library branches and assign branch managers.
- Branch Manager:
  - Manages the books in their assigned branch.
  - Manages authors.
  - Handles rental requests.
  - Views revenue generated from rentals.
- Customer:
  - Can browse books.
  - Can request book rentals.
  - Can view their rental history.

### Rental Process

 1. After a customer submits a rental request, the status is marked as pending.
 2. The branch manager reviews the request and can either accept or reject it.
    - If accepted, the rental status updates to accepted.
    - If rejected, the rental status updates to rejected.
 3. Customers can check their rental history to see past and current rentals.

This usage guide outlines the core functionalities and user interactions within the library system.

---

## Takeaways: Design Concepts and Techniques Learned

1. Enum
   - Ensures Type Safety: Using Enums prevents spelling mistakes, and the IDE can catch errors in real time, avoiding runtime issues.
   - Improves Code Readability: Clearly defines available options, making the code easier to maintain and understand.

2. Stack
   - Effectively Manages UI Flow: Easily controls the order of UI transitions, facilitating screen navigation and back functionality.
   - Simplifies State Management: Clearly manages the history of UI state changes, preventing inconsistencies or state confusion.

3. Singleton Pattern
   - Avoids Repetitive Parameter Passing: Provides a global access point, reducing the need to pass the same parameters repeatedly, making the code more concise.
   - Saves Resources and Unifies State: Ensures only a single instance exists, making it ideal for managing shared resources or global settings.

4. Interface
   - Encapsulation: Exposes only necessary methods while hiding implementation details, enhancing code security and cleanliness.
   - Scalability: Easily integrates new features by implementing the same interface, improving design flexibility.

5. Interface Callback
   - Reduces Component Coupling: Lowers dependency between components, improving code maintainability.
   - Enhances Modularity: Enables modular development and testing by leveraging callbacks.

6. Constructor Chaining
   - Reduces Code Duplication: Initializes objects through chained constructors, avoiding repetitive initialization logic.
   - Improves Maintainability and Extensibility: Updates to initialization logic only need to be made in one place, ensuring consistency across all constructors.
