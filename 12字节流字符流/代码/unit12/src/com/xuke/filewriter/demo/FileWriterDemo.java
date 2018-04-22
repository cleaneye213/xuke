package com.xuke.filewriter.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		//向a.txt写入信息
		String fileA="D:\\file2\\a.txt";
		//忽略文件路径不存在的判断
		File file=new File(fileA);
		FileWriter writer=null;
		try {
			writer=new FileWriter(file,true);
			//这些文字都要先编码。都写入到了流的缓冲区中。
			for(int i=0;i<20;i++) {
				writer.write("士大夫撒旦了发给家里人挂机了"+i+"\n");
			}
			writer.flush();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
