# Cinema Management System

## Project Overview

This project is a **Cinema Management System** built in Java. It handles important tasks for a cinema, such as adding movies, booking tickets, creating a user interface, and managing movie schedules. The project uses five different design patterns to make everything work:

- **Singleton**: Manages system settings.
- **Factory Method**: Creates different types of movies (like Regular or IMAX).
- **Abstract Factory**: Builds user interface components (like buttons) with different themes (Dark or Light).
- **Builder**: Helps create ticket bookings (choosing movie, seat, and snacks).
- **Prototype**: Clones and manages movie schedules.

## How It Works

1. **System Configuration (Singleton)**: The `CinemaConfig` class ensures there is only one set of settings for the whole system. It stores details like the cinema's name and number of screens.

2. **Movie Creation (Factory Method)**: The `MovieFactory` class creates different types of movies, such as `RegularMovie` or `IMAXMovie`, based on what is needed.

3. **User Interface (Abstract Factory)**: The system uses `UIFactory` to create buttons and other interface elements with different themes (dark or light).

4. **Ticket Booking (Builder)**: The `TicketBookingBuilder` class helps to build a ticket step by step, allowing users to choose the movie, seat, and snacks easily.

5. **Movie Schedule Management (Prototype)**: The `StandardSchedule` class allows easy copying and changing of movie schedules. You can clone a schedule and change the time or movie without affecting the original.

## How to Run the Project

1. **Clone the project**:
   ```bash
   git clone https://github.com/fr1gn/Assignment1_SDP.git
   ```

2. **Open the project** in any Java IDE (like IntelliJ or Eclipse).

3. **Run the `CinemaManagementApp.java` file** to start using the application.
