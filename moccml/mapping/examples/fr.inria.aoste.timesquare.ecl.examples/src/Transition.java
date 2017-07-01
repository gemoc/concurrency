import java.io.IOException;

import fr.inria.aoste.timesquare.backend.codeexecution.CodeExecutionHelper;
import fr.inria.aoste.timesquare.backend.codeexecution.ICodeExecutionAPI;


public class Transition  implements ICodeExecutionAPI { 
	
	private CodeExecutionHelper _ce=null;
	
	@Override
	 public void setHelper(CodeExecutionHelper ce) {
		_ce=ce;
	 }
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
	}

	public Boolean evaluateGuard(){
		_ce.println("	evaluate guard of"+this.hashCode()+" and return true :-/");
		return true;
	}
	
	public void fire(){
		_ce.println("	"+this.hashCode()+" is fired");
	}
	
	public void callEffect(){
		_ce.println("	effect of transition "+this.hashCode()+" is called");
	}
}
