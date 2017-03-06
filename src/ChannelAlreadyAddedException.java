
public class ChannelAlreadyAddedException extends Exception{

	private String msg;
	
	public ChannelAlreadyAddedException(String msg){
		super(msg);
		this.msg = msg;
	}
	
	public String getMessage(){
	    return msg;
	}
	
	
}
