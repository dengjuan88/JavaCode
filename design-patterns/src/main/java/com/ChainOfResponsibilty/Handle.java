package com.ChainOfResponsibilty;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Handle.java
//  @ Date : 2016/9/29
//  @ Author : 
//
//

public abstract class Handle {
    public Handle successor; //继承者；后续的事物

    public void setSuccessor(Handle successor) {
	    this.successor=successor;
	}

    public abstract void handleRequest(int request);
}