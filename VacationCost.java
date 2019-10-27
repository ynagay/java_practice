import java.util.Scanner;

class VacationCost {
	
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int durationOfVacation = scanner.nextInt();
		int foodCostPerDay = scanner.nextInt();
		int oneWayTicket = scanner.nextInt();
		int hotelNightCost = scanner.nextInt();
		
        int vacationSum = durationOfVacation * foodCostPerDay + oneWayTicket * 2 + (durationOfVacation -1) * hotelNightCost; 
		
        System.out.println(vacationSum);
		
    }
}