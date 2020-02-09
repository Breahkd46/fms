package fMS.aspects;

import fMS.InitState;
import fMS.aspects.StateAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = InitState.class)
@SuppressWarnings("all")
public class InitStateAspect extends StateAspect {
}
