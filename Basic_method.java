package Github.url;

import java.net.*;

/**
 * 利用InetAddress的三种方法创建InetAddress对象
 * 1）getLocalHost();
 * 2）getByName("www.biying.com");//根据域名得到InetAddressz对象
 * 3）getByName("61.135.253.15");//根据ip得到InetAddress对象
 * @author xiaohong
 *
 */
public class Basic_method {
	public static void main(String[] args) throws UnknownHostException{
		//使用getLocalHost()方法创建对象InetAddress
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());//返回本机的计算机名
		System.out.println(address.getHostAddress());//返回本机的IP地址
		
		
		//根据域名得到InetAddressz对象
		address = InetAddress.getByName("www.biying.com");
		System.out.println(address.getHostName());//输出：www.biying.com
		System.out.println(address.getHostAddress());//返回必应服务器的ip
		
		//根据ip得到InetAddress对象
		address = InetAddress.getByName("61.135.253.15");
		System.out.println(address.getHostName());//输出的时IP而不是域名，如果这个IP不存在，则返回LocalHost
		System.out.println(address.getHostAddress());//返回163服务器的IP：61.135.253.15
	}
}
