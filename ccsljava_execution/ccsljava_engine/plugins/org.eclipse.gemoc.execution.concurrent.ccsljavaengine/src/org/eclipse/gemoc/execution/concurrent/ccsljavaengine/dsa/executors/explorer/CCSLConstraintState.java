///**
// * 
// */
//package org.eclipse.gemoc.execution.concurrent.ccsljavaengine.dsa.executors.explorer;
//
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//
//import fr.inria.aoste.timesquare.ccslkernel.runtime.SerializedConstraintState;
//
///**
// * @author jdeanton
// *
// */
//public class CCSLConstraintState extends HashMap<String, SerializedConstraintState> implements Serializable {
//	
//	/**
//	 * id for hypothetical serialization
//	 */
//	private static final long serialVersionUID = 5374939426592768256L;
//
//	public CCSLConstraintState() {
//		super();
//	}
//	
//	public void copy(CCSLConstraintState from){
//		this.clear();
//		for(String key : from.keySet()){
//			SerializedConstraintState newList = new SerializedConstraintState(from.get(key));
//			this.put(key, newList);
//		}
//	}
//	
//	public boolean equals(CCSLConstraintState state1){
//		if(state1.size() != this.size()){
//			return false;
//		}
//		
//		Iterator<Entry<String, SerializedConstraintState>> it = state1.entrySet().iterator();
//		while(it.hasNext()){
//			Map.Entry<String, SerializedConstraintState> entry = (Map.Entry<String, SerializedConstraintState>) it.next();
//			String key = entry.getKey();
//			if (! this.containsKey(key)){
//				return false;
//			}
//			if ( ! entry.getValue().equals( this.get(key)) ) {
//				return false;
//			}
//		}
//		return true;
//	}
//	
//	/**
//	 * TODO:how to pretty print such a state ?! 
//	 */
//	@Override
//	public String toString() {
//		String res =new Integer(java.lang.System.identityHashCode(this)).toString();
////		for(ArrayList<byte[]> bytes : this.values()){
////			for(byte[] b : bytes){
////				Object o = Utilities.bytesToObject(b);
////				if(o instanceof Integer){
////					res+= (Integer)o+" ";
////				}
////				if(o instanceof Boolean){
////					res+= (Boolean)o+" ";
////				}
////			}
////		}
//		
//		
//		
//		
////			if (bytes.size() == 3){ //this is an expression
////				res += " wasBorn="+(Boolean)Utilities.bytesToObject(bytes.get(0));
////				res += " state="+State.values()[(Integer)Utilities.bytesToObject(bytes.get(1))];
////				res += " N= "+(Integer)Utilities.bytesToObject(bytes.get(2));
////			}
////			if (bytes.size() == 1){ //this is an expression
////				res += " clock state="+fr.inria.aoste.timesquare.ccslkernel.solver.TimeModel.SolverClock.State.values()[(Integer)Utilities.bytesToObject(bytes.get(0))];
////			}
////		}
//		return res;
//	}
//
//}
