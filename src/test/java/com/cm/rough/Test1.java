package com.cm.rough;

import java.io.File;

import com.cm.base.Page;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Page.jvmBitVersion());

		File file = new File(System.getProperty("user.dir")+"/src/test/resources/lib/"+"jacob-1.19-x64.dll");
		System.out.println(file.getAbsolutePath());
	}

}
