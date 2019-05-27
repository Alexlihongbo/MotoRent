package com.alex.repeatNUm;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		String dirname="F:\\tmp\\java\\bin";
		File d=new File(dirname);
		//现在创建目录
		d.mkdirs();

	}

}
