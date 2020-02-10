# fsm

## Utilisation de la DSL

Extension : .mydsl

Grammaire :
> FSM nom_fsm
> initial nom_du_state_initial
> final nom_du_state_final
> state nom_du_state
> transition nom_de_la_transition nom_du_state -> nom_du_state

Attention : lors de la creation d'une transition, les states utilisés doivent avoir été créé préalablement.

## Générateur

Projet : org.xtext.example.mydsl
Specification de la DSL : /home/valo/workspaces/fms/org.xtext.example.mydsl/src/org/xtext/example/mydsl/MyDsl.xtext
Fichier de génération : org.xtext.example.mydsl/src/org/xtext/example/mydsl/generator/MyDslGenerator.xtend

Lorsqu'on écrit puis qu'on sauve le fichier dans l'éditeur, cela génére des fichier .java.
Il faut les compiler avec un compilateur java (tel que javac), puis les executé.

## Interpréteur

Projet : org.sample.k3project
