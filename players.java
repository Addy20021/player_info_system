	import java.util.Scanner;
	class Player
	{
		String name;
		int age;
		double height;
		String country;
		public Player(String name, int age, double height, String country){

			this.name=name;
			this.age=age;
			this.height=height;
			this.country=country;
		}
		public void displayinfo(){
			System.out.println("Name:  "+ name);
			System.out.println("age:  "+ age);
			System.out.println("height:  "+ height);
			System.out.println("country:  "+ country);
		}
	}
	class Cricket extends Player
	{
		int wickets;
		int runs;
		public Cricket(String name, int age, double height, String country, int wickets, int runs){
			super(name,age,height,country);
			this.runs=runs;
			this.wickets=wickets;
		}
		public void displayCricketStats(){
				displayinfo();
				System.out.println("runs:  "+ runs);
				System.out.println("wickets:  "+ wickets);
			}

	}
	class Football extends Player
	{
		int goals;
		String position;
		public Football(String name, int age, double height, String country, int goals, String position){
			super(name,age,height,country);
			this.goals=goals;
			this.position=position;

		}
		public void displayFootballStats(){
				displayinfo();
				System.out.println("goals:  "+ goals);
				System.out.println("position:  "+ position);
			}
	}
class players 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
			 try {
            // Input Cricket Player
            System.out.println("Enter Cricket Player Details:");
            System.out.print("Name: ");
            String cName = sc.nextLine();

            System.out.print("Age: ");
            int cAge = Integer.parseInt(sc.nextLine());
            validateRange(cAge, 10, 60, "Age");

            System.out.print("Height (in cm): ");
            double cHeight = Double.parseDouble(sc.nextLine());
            validateRange(cHeight, 100, 250, "Height");

            System.out.print("Country: ");
            String cCountry = sc.nextLine();

            System.out.print("Wickets: ");
            int wickets = Integer.parseInt(sc.nextLine());
            validateRange(wickets, 0, 1000, "Wickets");

            System.out.print("Runs: ");
            int runs = Integer.parseInt(sc.nextLine());
            validateRange(runs, 0, 20000, "Runs");

            Cricket cricketer = new Cricket(cName, cAge, cHeight, cCountry, wickets, runs);

            // Input Football Player
            System.out.println("\nEnter Football Player Details:");
            System.out.print("Name: ");
            String fName = sc.nextLine();

            System.out.print("Age: ");
            int fAge = Integer.parseInt(sc.nextLine());
            validateRange(fAge, 10, 60, "Age");

            System.out.print("Height (in cm): ");
            double fHeight = Double.parseDouble(sc.nextLine());
            validateRange(fHeight, 100, 250, "Height");
			System.out.print("Country: ");
            String fCountry = sc.nextLine();

            System.out.print("Goals: ");
            int goals = Integer.parseInt(sc.nextLine());
            validateRange(goals, 0, 1000, "Goals");

            System.out.print("Position: ");
            String position = sc.nextLine();

            Football footballer = new Football(fName, fAge, fHeight, fCountry, goals, position);

            // Display Info
            cricketer.displayCricketStats();
            footballer.displayFootballStats();

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
  public static void validateRange(double value, double min, double max, String field) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(field + " must be between " + min + " and " + max + ".");
        }
    }

	
}
