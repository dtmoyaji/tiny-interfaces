/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Groovy/GroovyClass.groovy to edit this template
 */

package org.gear

/**
 * スクリプトを実行するクラス
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

