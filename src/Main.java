import com.takeoff.checkurlstatus.CheckURLStatus;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String url=scn.nextLine();
        System.out.println("Your URL:"+url);
        int status=CheckURLStatus.checker(url);
        if(status!=-1)
            System.out.println("Status:"+status);
        else
            System.out.println("Oops! A bug Happened just now!");

    }
}

