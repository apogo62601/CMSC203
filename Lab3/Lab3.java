import java.util.Scanner;
public class Lab3 {
	@SuppressWarnings("null")
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Movie movie = new Movie();
        
        boolean flag = true;
        
        do{
            System.out.println("Enter the name of the movie: ");
            String name = input.nextLine();
            movie.setTitle(name);
            
            System.out.println("Enter the rating of the movie: ");
            String rating = input.nextLine();
            movie.setRating(rating);
            
            System.out.println("Enter the number of tickets sold for the movie: ");
            int tickets = input.nextInt();
            movie.setSoldTickets(tickets);
            
            System.out.println(name + " (" + rating + "): Tickets Sold: " + tickets);
            
            String empty = input.nextLine();
            
            System.out.println("\nDo you want to enter another movie? (Yes or No): ");
            String anotherMovie = input.nextLine();
            if (anotherMovie.equalsIgnoreCase("No"))
            {
                flag = false;
            }
            
            
        } while (flag == true);
        
        System.out.println("\nGoodbye");
        
        input.close();
        
    }
}

