package program.java.lockers;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

class Lockerspvtltd {
	
	
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1= new Scanner(System.in);
	static int userinput2,userinput;
	static String path = "C:/Users/senthilmano/Lockers pvt ltd/resource/";
public static void main(String[] args) {
	
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("********************************************************************************************************************************************");;
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::LOCKERS PVT LTD:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("********************************************************************************************************************************************");
			System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			do{
			 System.out.println("               \n\n              :::::::::::MAIN MENU:::::::::::\n\n");
			 System.out.println("            Select the option below \n ");
			 System.out.println("            1.To get the Files in the Directory \n ");
			 System.out.println("            2.To manage the Files in the Directory \n");
			 System.out.println("            3.To Exit the Application \n");
			 if(sc.hasNextInt()){
			 userinput = sc.nextInt();
			 }
			 else {
				 sc.next();
				 System.out.println("please provide the correct number");
				 userinput=0;
			 }
			 if(userinput>4){
				 System.out.println("please provide the correct number");
				 
			 }
				switch(userinput){
			case 1:
				String str[] = files();
				if(str.length==0){
				System.out.println("There is no file in the directory");
				}
					else{
						System.out.println("These are the files in the directory");
						for(int i=0;i < str.length;i++){
							System.out.println(str[i]);
							}
						}
					break;
			case 2:
				
			do{	
				System.out.println("choose below the option to manage the files ");
				System.out.println("1.To Add a file in the directory");
				System.out.println("2.To Delete a file in the directory");
				System.out.println("3.To search a file in the directory");
				System.out.println("4.To go Back Main menu ");
				if(sc.hasNextInt()){
				 userinput2 = sc.nextInt();
				}
				
				else{
					sc.next();
					System.out.println("please provide the correct number");
					userinput2=0;
				}
			   if(userinput2>4){
					System.out.println("please provide the correct number");
					
				}
				switch(userinput2){
				case 1: 
					try{
					System.out.println("Enter a file name :");
					String filename =sc.next();
					File c = new File(path+filename);
					if(c.createNewFile()){
						System.out.println("  The file is created in the directory ::"+path+filename);
					}
						else{
							if(c.exists()){
								System.out.println("        The file already exits!!!"+c.getAbsolutePath());
							}
						}
					}										
					catch(IOException a){
						System.out.println("a");
					}
					break;
					
				case 2:
					System.out.println("   **To Delete file in the directory**\n");		
					System.out.println("Enter a file name :");
				    String filename1 =sc.next();
					File d = new File(path+filename1);
					if(d.exists()){
						 str = files();
						 String search = null;
						 for(int i=0;i<str.length;i++){
							if( filename1.equalsIgnoreCase(str[i])){
								 search = str[i];
							}
							}
						d.delete();
						System.out.println(search+"The file deleted sucessfully!!");
					}
					else {
						System.out.println("     The file not found ");
					}
					break;
				case 3:
					System.out.println("**To Search file in the directory**\n");
					System.out.println("Enter a file name :");
				    String filename2 =sc.next();
					File s = new File(path+filename2);
					if(s.exists()){
						 str = files();
						 for(int i=0;i<str.length;i++){
							if( filename2.equalsIgnoreCase(str[i])){
								String search = str[i];
								System.out.println("\n File found :"+search +"the directory:: "+path);
							}
						 }
					}
					else {
						System.out.println("     The File not found   ");
					}
					break;
				case 4:
					System.out.println("Go back main menu");
				}
			}while(userinput2!=4||userinput2>4);
				break;
			case 3:
			exit();
				}
			}while(userinput!=3||userinput>3);
				}
				
				
				
				
				
				






		static void exit(){
			
			System.out.println("Are you sure to exit?");
			System.out.println("\n (Y)->YES    To close the Application?");
			System.out.println("\n (N)-> NO    To return Menu ");
			String exit = sc1.next();	
			if(exit.equals("yes")||exit.equals("y")||exit.equals("YES")||exit.equals("Y")){
				System.out.println("thank you ");	
			}
			else if(exit.equals("no")||exit.equals("n")||exit.equals("No")||exit.equals("N")){
				userinput=2;
				}
			else{
				System.out.println("To confirm, press Y or N ");
				exit();
			}
			}
		static String[]files(){
			File file = new File (path);
			String str[] = file.list();
			 Arrays.sort(str);
		return str;	
		}

}	
			
	

