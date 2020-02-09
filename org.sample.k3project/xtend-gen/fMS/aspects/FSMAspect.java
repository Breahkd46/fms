package fMS.aspects;

import com.google.common.base.Objects;
import fMS.FSM;
import fMS.FinalState;
import fMS.InitState;
import fMS.State;
import fMS.Transition;
import fMS.aspects.FSMAspectFSMAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Scanner;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  @Step
  public static void execute(final FSM _self) {
    final fMS.aspects.FSMAspectFSMAspectProperties _self_ = fMS.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof fMS.FSM){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			fMS.aspects.FSMAspect._privk3_execute(_self_, (fMS.FSM)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "FSM", "execute");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_execute(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Begin");
    final Function1<State, Boolean> _function = (State st) -> {
      return Boolean.valueOf((st instanceof InitState));
    };
    State current = ((State[])Conversions.unwrapArray(IterableExtensions.<State>filter(_self.getState(), _function), State.class))[0];
    final Function1<State, Boolean> _function_1 = (State st) -> {
      return Boolean.valueOf((st instanceof FinalState));
    };
    State fin = ((State[])Conversions.unwrapArray(IterableExtensions.<State>filter(_self.getState(), _function_1), State.class))[0];
    while ((!current.equals(fin))) {
      {
        String _name = current.getName();
        String _plus = ("State : " + _name);
        System.out.println(_plus);
        final String trigger = sc.nextLine();
        final State cu = current;
        final Function1<Transition, Boolean> _function_2 = (Transition tr) -> {
          return Boolean.valueOf((tr.getStateStart().equals(cu) && tr.getName().equals(trigger)));
        };
        Transition transition = IterableExtensions.<Transition>findFirst(_self.getTransition(), _function_2);
        boolean _notEquals = (!Objects.equal(transition, null));
        if (_notEquals) {
          current = transition.getStateEnd();
        }
      }
    }
    String _name = current.getName();
    String _plus = ("State : " + _name);
    System.out.println(_plus);
    System.out.println("FIN");
  }
}
