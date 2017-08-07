package Github.url;

import java.io.*;
import java.net.*;

public class netResource {
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://www.baidu.com");
		/*
		//1.获取网络资源，但是解码和编码格式不一致，获取的资源中会有乱码
		InputStream io = url.openStream();//获取指定资源
		byte[] flush = new byte[1024];//获取字节数
		int len = 0;
		while((len = io.read(flush)) != -1)
			System.out.println(new String(flush,0,len));
		io.close();
		
		
		//2.将指定的资源在本地进行显示，但是是源码的形式
		//从指定的网址获取资源,统一编码和解码格式
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		br.close();*/
		
		//3.将指定的网络资源在本地进行显示，达到访问网页一样的效果
		//从指定的网址获取资源
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		//将网址锁获取的资源在本地进行显示，爬虫的原理:获取所需资源，然后利用正则表达式进行处理即可
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		String msg = null;
		while((msg = br.readLine()) != null){
			bw.append(msg);
			//对于BufferedReader/BufferedWriter对象，不可避免的一句话
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
