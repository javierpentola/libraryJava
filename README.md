### Project Documentation Template

---

#### **Project Overview**

**Project Name:** Sistema de Biblioteca

**Technologies Used:**
- **Java:** A high-level, class-based, object-oriented programming language designed to have as few implementation dependencies as possible. It is used for developing the console application.
- **Scanner:** A class in Java used for obtaining the input of the primitive types like int, double, etc., and strings. It is used to handle user input in the console.
- **ArrayList:** A resizable array implementation in Java part of the Java Collections Framework. It is used to store the lists of publications and members in the library.

**Description:** This project creates a console-based library management system. It uses Java to handle various functionalities such as adding, listing, searching, and deleting books and members, as well as managing book loans.

---

### **Technologies Usage**

1. **Java:**
   - **Usage:** Java is used as the main programming language for developing the console application. It provides the structure and syntax for creating classes, methods, and the main program logic.
   - **Files:** `SistemaBiblioteca.java`

2. **Scanner:**
   - **Usage:** Scanner is used to read user inputs from the console, such as book titles, authors, member names, and IDs.
   - **Files:** `SistemaBiblioteca.java`

3. **ArrayList:**
   - **Usage:** ArrayList is used to maintain dynamic lists of publications and members, allowing for easy addition, removal, and search operations.
   - **Files:** `SistemaBiblioteca.java`

---

### **Setup and Usage Instructions**

To set up and use the project after downloading the code, follow these steps:

1. **Clone the Repository:**
   - Use `git clone` to clone the repository to your local machine.
   ```bash
   git clone <repository_url>
   ```

2. **Navigate to the Project Directory:**
   - Change your working directory to the project folder.
   ```bash
   cd <project_directory>
   ```

3. **Compile the Java Program:**
   - Use the Java compiler `javac` to compile the Java source file.
   ```bash
   javac SistemaBiblioteca.java
   ```

4. **Run the Application:**
   - Use the Java runtime `java` to run the compiled program.
   ```bash
   java SistemaBiblioteca
   ```

5. **Access the Application:**
   - Follow the on-screen prompts in the console to interact with the library management system.

---

### **Project Functionality**

1. **Agregar Libro:**
   - **Description:** Adds a new book to the library's collection.
   - **Usage:** Select option 1, then enter the book's title, author, and number of pages.

2. **Listar Publicaciones:**
   - **Description:** Lists all the publications (books) in the library.
   - **Usage:** Select option 2 to display all books currently in the library.

3. **Buscar Publicacion por Titulo:**
   - **Description:** Searches for a publication by its title.
   - **Usage:** Select option 3, then enter the title of the book you want to search for.

4. **Eliminar Publicacion por Titulo:**
   - **Description:** Removes a publication from the library by its title.
   - **Usage:** Select option 4, then enter the title of the book you want to remove.

5. **Agregar Socio:**
   - **Description:** Adds a new member to the library.
   - **Usage:** Select option 5, then enter the member's name and ID.

6. **Listar Socios:**
   - **Description:** Lists all the members of the library.
   - **Usage:** Select option 6 to display all members currently registered in the library.

7. **Buscar Socio por ID:**
   - **Description:** Searches for a member by their ID.
   - **Usage:** Select option 7, then enter the ID of the member you want to search for.

8. **Eliminar Socio por ID:**
   - **Description:** Removes a member from the library by their ID.
   - **Usage:** Select option 8, then enter the ID of the member you want to remove.

9. **Salir:**
   - **Description:** Exits the application.
   - **Usage:** Select option 9 to terminate the program.
