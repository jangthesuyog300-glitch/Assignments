import java.util.*;
public class TestTeam 
	{

			public static void main(String[] args) 
		{
				Scanner sc=new Scanner(System.in);
				int choice=0;
					do 
				{
						System.out.println("1. add new Team"
								+ "\n2. Display all Team "
								+ "\n3. search team by id "
								+ "\n4. Add new player"
								+ "\n5. search a player"
								+ "\n6. exit\nChoice: ");

						choice=sc.nextInt();
						
						switch(choice) 
					{
						case 1://add new Team
							boolean status=TeamService.addNewTeam();
							if(status)
								System.out.println("team added successfully");
							else
								System.out.println("Error: Team not added");
							break;
						
						case 2:
							break;
						case 3:
							break;
							
						case 4:
							break;
						case 5:
							System.out.println(x:"enter pid to search");
							Team team= TeamService.FindTeamByPlayer
							break;
						case 6:
							break;
					}

				}
		}
	}
