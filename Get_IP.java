package Github.url;
/**
 * ����InetSocketAddress����������ַ����Ҫָ���˿ں�
 * ������InetAddress����������ַ������Ҫָ���˿ںţ�ֻ��Ҫ���ø���ķ�������
 */
import java.net.*;

public class Get_IP {
	public static void main(String[] args) throws UnknownHostException{
		InetSocketAddress  address = new InetSocketAddress("127.0.0.1",9999);//IP��ַ���˿ں�
		//�˷���������ķ�����һ�µģ��˷�����JDKʵ�ֵ�ԭ��
		 address = new InetSocketAddress(InetAddress.getByName("127.0.0.1"),9999);
		 
		 System.out.println(address.getHostName());//��ȡ������
		 System.out.println(address.getPort());//��ȡ�˿ں�
		 
		 InetAddress addr = address.getAddress();
		 System.out.println(addr.getHostAddress());//���أ���ַ
		 System.out.println(addr.getHostName());//����������
		
	}

}
