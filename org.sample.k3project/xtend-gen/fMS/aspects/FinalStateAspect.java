package fMS.aspects;

import fMS.FinalState;
import fMS.aspects.StateAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
