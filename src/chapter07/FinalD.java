package chapter07;

// Retrun a string object
class ErrorMsg {
	//Error codes
	final int OUTERR   = 0;    // uppercase for final constants
	final int INERR    = 1;
	final int DISKERR  = 2;
	final int INDEXERR = 3;
	
	String msgs[] = {
			"Output Error",
			"Input Error",
			"Disk full", 
			"Index Out-Of-Bounds"
	};
	
	// Retrun the error message
	String getErrorMsg(int i) {
		if (i >= 0 & i < msgs.length) {
			return msgs[i];
		}
		else {
			return "Invalid Error Code";
		}
	}
}

public class FinalD {
	public static void main(String args[]) {
		ErrorMsg err = new ErrorMsg();
		
		System.out.println(err.getErrorMsg(err.OUTERR));  // must be accessed via an object of that class (in this case, err)
		System.out.println(err.getErrorMsg(err.DISKERR));
	}

}
