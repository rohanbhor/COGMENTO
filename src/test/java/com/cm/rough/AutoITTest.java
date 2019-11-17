package com.cm.rough;

import java.io.File;

import com.cm.base.Page;
import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AutoITTest extends Page{


public static void main(String[] args) throws InterruptedException {
	
String jacobDllVersionToUse;

if (Page.jvmBitVersion().contains("32")){
jacobDllVersionToUse = "jacob-1.18-M2-x86.dll";
}
else {
jacobDllVersionToUse = "jacob-1.18-M2-x64.dll";
}

File file = new File("lib", jacobDllVersionToUse);
System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());

		AutoItX x = new AutoItX();
		x.run("calc.exe");
		x.winActivate("Calculator");
		x.winWaitActive("Calculator");
		//Enter 3
		x.controlClick("Calculator", "", "133") ;
		Thread.sleep(1000);
		//Enter +
		x.controlClick("Calculator", "", "93") ;
		Thread.sleep(1000);
		//Enter 3
		x.controlClick("Calculator", "", "133") ;
		Thread.sleep(1000);
		//Enter =
		x.controlClick("Calculator", "", "121") ;
}	
}