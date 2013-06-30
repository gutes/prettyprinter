import java.lang.String;

public class IndentedDiv {
	private static int indentationStep = 4; //px
	private static IndentedDiv instance = null;
	private int currentIndentationLevel = 0;
	
	protected IndentedDiv() {}
	
	public static IndentedDiv getInstance() {
		if(instance == null) {
			instance = new IndentedDiv();
		}else{
			instance.currentIndentationLevel++;
		}
		return instance;
	}
	
	public String getHtml(String content){
		String rv = String.format("<div style='margin-left:%dpx;'>%s</div>", 
									currentIndentationLevel * indentationStep, 
									content);
		return rv;
	}
	
	
}
