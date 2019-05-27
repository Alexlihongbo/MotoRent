package com.alex.repeatNUm;

import java.io.File;

public class FilenameFilterTest {

	public static void main(String[] args) {
		String dirname="C:\\Users\\Alex李洪波\\Desktop\\asda\\新建文件夹";
		File file=new File(dirname);
		String[] nameList=file.list((dir,name)->name.endsWith(".xlsx")||new File(name).isDirectory());
		for(String name:nameList) {
			System.out.println(name);
		}

	}

}
