package com.alex.repeatNUm;

import java.io.*;

public class fileStreamTest {

	public static void main(String[] args) throws IOException{
			//构建FileOutStrean对象，文件不存在会自动新建
			File f=new File("‪C:\\Users\\Alex李洪波\\Desktop\\test.txt");
			/**FileOutputStream fop=new FileOutputStream(f);
			//构建OutputStreamwWriter对象，参数可以指定代码，默认为操作系统默认编码，window上是gbk
			OutputStreamWriter write=new OutputStreamWriter(fop,"gbk");
			//写入到缓冲区
			write.append("中文输入");
			//换行
			write.append("\r\n");
			//刷新缓冲区，写入到文件，如果下面已经没有写入的内容了，直接close也会写入
		    write.append("English");
		    //关闭写入流，同时会把缓冲区内容写入文件，所以上面的注释掉
			write.close();
			//关闭输出流，释放系统资源
			fop.close();
			*///构建InputStream对象
			FileInputStream fip=new FileInputStream(f);
			//构建InputStreamReaders对象，编码方式与写入相同
			InputStreamReader reader=new InputStreamReader(fip,"gbk");
			StringBuffer sb=new StringBuffer();
			while(reader.ready()) {
				sb.append((char)reader.read());
			}
			System.out.println(sb.toString());
			//关闭读取流
			reader.close();
			//关闭输入流，释放系统资源
			fip.close();
		}

	}


