import java.util.Scanner;

public class Exercise1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		boolean correct = true;
		String username = "user";
		String password = "pass";
                
		System.out.println("Enter Username");
		if(false == username.equals(scan.nextLine())){
			correct = false;
		}
		System.out.println("Enter Password");
		if(false == password.equals(scan.nextLine())){
			correct = false;
		}
                
		if(correct){
			System.out.println("Welcome " + username + "\n");
		}
		else{
			System.out.println("Invalid Username or Password" + "\n");
		}
                
		for(int i = 1; i <= 100; i++){
                    if(i%2 == 1){
			System.out.print(i + " ");
                    }
                    if(i%10 == 0){
                        System.out.println("");
                    }
		}
                
                System.out.println("");
                int i = 1;
                while(i <= 100){
                    if(i%2 == 0){
			System.out.print(i + " ");
                    }
                    if(i%10 == 0){
                        System.out.println("");
                    }
                    i++;
		}
	}
}