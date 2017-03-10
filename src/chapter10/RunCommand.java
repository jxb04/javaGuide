package chapter10;

// run a dos command
import java.io.*;
public class RunCommand {
	public static void main(String args[]) throws IOException {
		String[] command = new String[3];
		command[0] = "cmd";
		command[1] = "/C";
		command[2] = "pwd";
//		command[3] = "c:\\";
		
		Process p = Runtime.getRuntime().exec(command);
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		
        // read the output from the command
        String s = null;
        System.out.println("Here is the standard output of the command:\n");
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        // read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        
        }
	}

}
