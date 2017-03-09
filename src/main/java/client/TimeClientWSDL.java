package client;

public class TimeClientWSDL {
	public static void main(String[] args){
		TimeServerImplService service=new TimeServerImplService();
		TimeServer eif=service.getTimeServerImplPort();
		System.out.println(eif.getTimeAsString());
	}
}
