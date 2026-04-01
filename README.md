# The Beans Co.

**The Beans Co.** is a Java-based agricultural management system designed for coffee plantations. Its purpose is to provide plantation owners with a structured and efficient method to manage labour, schedule tasks, track payments, and plan seasonal operations.

---

## Features

### Labour Management
- Maintains detailed digital profiles for each worker, including skills, availability, previous assignments, and performance ratings.  
- Categorises workers by expertise: Pickers, Weeders, Pruners, Sprayers, and Irrigation Workers.  

### Task Scheduling
- Facilitates planning of assignments several days in advance, particularly during peak harvesting periods.  
- Locks worker availability upon job confirmation to prevent double-booking.  
- Allows filtering of workers by skill and task requirement.

### Payment Tracking
- Supports both daily wage and piece-rate compensation models.  
- Records payments immediately upon job completion.  
- Computes total remuneration automatically: `Total = Quantity × Rate`.  
- Group payments may be assigned to a designated leader while maintaining individual accountability.

### Performance Evaluation
- Enables both farmers and workers to provide mutual ratings following the completion of each task.  
- Links completion of ratings to the confirmation of payment to ensure accountability.

### Seasonal Task Calendar
- **Weeding:** June – September  
- **Pruning:** December – February  
- **Irrigation:** December – April  
- **Coffee Harvesting:** November – February  
- **Fertiliser Application:** May – June, September – October  
- **Spraying (Pesticides/Fungicides):** May – October  

### Compliance and Reporting
- Maintains a muster roll in accordance with labour regulations.  
- Tracks key performance indicators: average cost per kilogram harvested, worker rating, repeat hire rate, and payment dispute rate.

---

## Project Structure
TheBeansCo
- src                # Source Code
- com.beans          # Main package containing all core classes
- MainApp.java      # Main application entry
-  Worker.java       # Worker profiles and skills
- Payment.java      # Payment handling
- Job.java          # Task/job management
- .project                  # Eclipse project config
- .classpath                # Eclipse classpath settings
- README.md                 # Project documentation
- LICENSE                   # MIT License
---

## How to Run
1. Import the project into **Eclipse IDE**.  
2. Navigate to `MainApp.java`.  
3. Execute as a **Java Application**.

---

## Future Enhancements
- Transition into an Android application for mobile farm management.  
- Implement intelligent notifications for seasonal tasks.  
- Incorporate offline functionality for low-connectivity regions.  
- Provide SMS alerts for workers without smartphones.

---

## License
MIT License 
