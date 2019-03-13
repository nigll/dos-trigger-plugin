# dos-trigger-plugin
Jenkins dos-trigger plugin
==========================
This Jenkins Plugin is used for trigger a build by a command \
Trigger type format is : CHANGES=${number} \
String regex="(.*)CHANGES=((\\d+\\s+)+).*";\
##config example
- ## shell 
  `echo $(CHANGES="123 435")`
- ## Windows
  `echo CHANGES="123 435"`
- ## other 
  `python /home1/jenkins/trigger_script/stashTriggerPreBuild.py` \
  the python script have to put at the jenkins master and the scrpit putout have to "CHANGES=${number}" \
  the $number can also be number list
