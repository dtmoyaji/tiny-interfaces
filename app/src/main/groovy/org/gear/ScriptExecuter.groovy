package org.gear

/**
 * �X�N���v�g�����s����N���X
 * @author bythe
 */
class ScriptExecuter {
       
    String scriptCode;
    GroovyShell gshell;
    
    public ScriptExecuter(){
        gshell = new GroovyShell();
    }
    
    public Object exec(){
        return gshell.evaluate(scriptCode);
    }
    
    public Object exec(String cmd){
        this.scriptCode = cmd;
        return exec();
    }
	
}

