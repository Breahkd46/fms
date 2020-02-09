package fMS.aspects;

import fMS.InitState;
import fMS.aspects.InitStateAspectInitStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InitStateAspectInitStateAspectContext {
  public final static InitStateAspectInitStateAspectContext INSTANCE = new InitStateAspectInitStateAspectContext();
  
  public static InitStateAspectInitStateAspectProperties getSelf(final InitState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fMS.aspects.InitStateAspectInitStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitState, InitStateAspectInitStateAspectProperties> map = new java.util.WeakHashMap<fMS.InitState, fMS.aspects.InitStateAspectInitStateAspectProperties>();
  
  public Map<InitState, InitStateAspectInitStateAspectProperties> getMap() {
    return map;
  }
}
