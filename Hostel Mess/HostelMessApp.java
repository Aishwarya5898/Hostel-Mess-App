import java.util.*;

class Student {
    private int id;
    private String name;
    private String roomNumber;

    public Student(int id, String name, String roomNumber) {
        this.id = id;
        this.name = name;
        this.roomNumber = roomNumber;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRoomNumber() { return roomNumber; }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Room: " + roomNumber);
    }
}

class MealLog {
    private int studentId;
    private int breakfastCount;
    private int lunchCount;
    private int dinnerCount;

    public MealLog(int studentId) {
        this.studentId = studentId;
    }

    public void logMeal(String mealType) {
        switch (mealType.toLowerCase()) {
            case "breakfast": breakfastCount++; break;
            case "lunch": lunchCount++; break;
            case "dinner": dinnerCount++; break;
            default: System.out.println("Invalid meal type.");
        }
    }

    public int getTotalMeals() {
        return breakfastCount + lunchCount + dinnerCount;
    }

    public void displayMeals() {
        System.out.println("Student ID: " + studentId +
            " | Breakfast: " + breakfastCount +
            " | Lunch: " + lunchCount +
            " | Dinner: " + dinnerCount);
    }
}

class BillingSystem {
    private Map<Integer, Student> students = new HashMap<>();
    private Map<Integer, MealLog> mealLogs = new HashMap<>();
    private final double ratePerMeal = 50.0;

    public void registerStudent(int id, String name, String room) {
        students.put(id, new Student(id, name, room));
        mealLogs.put(id, new MealLog(id));
        System.out.println("Student registered successfully.");
    }

    public void logMeal(int studentId, String mealType) {
        if (mealLogs.containsKey(studentId)) {
            mealLogs.get(studentId).logMeal(mealType);
            System.out.println("Meal logged.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void generateBill(int studentId) {
        if (mealLogs.containsKey(studentId)) {
            int totalMeals = mealLogs.get(studentId).getTotalMeals();
            double amount = totalMeals * ratePerMeal;
            System.out.println("Bill for Student ID " + studentId + ": ₹" + amount);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void showAllStudents() {
        for (Student s : students.values()) {
            s.displayInfo();
        }
    }

    public void showMealLogs() {
        for (MealLog m : mealLogs.values()) {
            m.displayMeals();
        }
    }
}

public class HostelMessApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillingSystem system = new BillingSystem();

        while (true) {
            System.out.println("\n1. Register Student\n2. Log Meal\n3. Generate Bill\n4. Show Students\n5. Show Meal Logs\n6. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID, Name, Room: ");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String room = sc.next();
                    system.registerStudent(id, name, room);
                    break;
                case 2:
                    System.out.print("Enter Student ID and Meal Type: ");
                    int sid = sc.nextInt();
                    String meal = sc.next();
                    system.logMeal(sid, meal);
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int bid = sc.nextInt();
                    system.generateBill(bid);
                    break;
                case 4:
                    system.showAllStudents();
                    break;
                case 5:
                    system.showMealLogs();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close(); 
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}