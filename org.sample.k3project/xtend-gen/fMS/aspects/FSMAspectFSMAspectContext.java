package fMS.aspects;

import fMS.FSM;
import fMS.aspects.FSMAspectFSMAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class FSMAspectFSMAspectContext {
  public final static FSMAspectFSMAspectContext INSTANCE = new FSMAspectFSMAspectContext();
  
  public static FSMAspectFSMAspectProperties getSelf(final FSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fMS.aspects.FSMAspectFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FSM, FSMAspectFSMAspectProperties> map = new java.util.WeakHashMap<fMS.FSM, fMS.aspects.FSMAspectFSMAspectProperties>();
  
  public Map<FSM, FSMAspectFSMAspectProperties> getMap() {
    return map;
  }
}
