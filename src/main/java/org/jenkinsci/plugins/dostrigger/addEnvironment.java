package com.jenkinsci.hudson.dostrigger;


import hudson.EnvVars;
import hudson.model.EnvironmentContributor;
import hudson.model.Run;
import hudson.model.TaskListener;


import java.io.IOException;

/**
 * Created by guohuixin on 24/12/2018.
 */
//@Extension
public class addEnvironment extends EnvironmentContributor {

    public addEnvironment() {
        super();
    }

    @Override
    public void buildEnvironmentFor(Run r, EnvVars envs, TaskListener listener) throws IOException, InterruptedException {
       // envs.put("TRIGGER_VAR", scriptcause.getCause());
        super.buildEnvironmentFor(r,envs,listener);
    }
}
