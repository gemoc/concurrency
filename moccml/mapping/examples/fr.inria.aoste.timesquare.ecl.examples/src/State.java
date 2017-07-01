import fr.inria.aoste.timesquare.backend.codeexecution.CodeExecutionHelper;
import fr.inria.aoste.timesquare.backend.codeexecution.ICodeExecutionAPI;


public class State  implements ICodeExecutionAPI { 
	
	private CodeExecutionHelper _ce=null;
	
	@Override
	 public void setHelper(CodeExecutionHelper ce) {
		_ce=ce;
	 }
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
	}

	public void onEnter(){
		_ce.println("->enter in state"+this.hashCode());
	}
	
	public void onLeave(){
		_ce.println("<-leave state"+this.hashCode());
	}
	
}
