package Github.url;
/**
 * 利用InetSocketAddress（）创建地址，需要指明端口号
 * 而利用InetAddress（）创建地址，不需要指明端口号，只需要调用该类的方法即可
 */
import java.net.*;

public class Get_IP {
	public static void main(String[] args) throws UnknownHostException{
		InetSocketAddress  address = new InetSocketAddress("127.0.0.1",9999);//IP地址，端口号
		//此方法与上面的方法是一致的，此方法是JDK实现的原理
		 address = new InetSocketAddress(InetAddress.getByName("127.0.0.1"),9999);
		 
		 System.out.println(address.getHostName());//获取主机名
		 System.out.println(address.getPort());//获取端口号
		 
		 InetAddress addr = address.getAddress();
		 System.out.println(addr.getHostAddress());//返回：地址
		 System.out.println(addr.getHostName());//输出计算机名
		
	}

}
