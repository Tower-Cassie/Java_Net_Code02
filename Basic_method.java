package Github.url;

import java.net.*;

/**
 * ����InetAddress�����ַ�������InetAddress����
 * 1��getLocalHost();
 * 2��getByName("www.biying.com");//���������õ�InetAddressz����
 * 3��getByName("61.135.253.15");//����ip�õ�InetAddress����
 * @author xiaohong
 *
 */
public class Basic_method {
	public static void main(String[] args) throws UnknownHostException{
		//ʹ��getLocalHost()������������InetAddress
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostName());//���ر����ļ������
		System.out.println(address.getHostAddress());//���ر�����IP��ַ
		
		
		//���������õ�InetAddressz����
		address = InetAddress.getByName("www.biying.com");
		System.out.println(address.getHostName());//�����www.biying.com
		System.out.println(address.getHostAddress());//���ر�Ӧ��������ip
		
		//����ip�õ�InetAddress����
		address = InetAddress.getByName("61.135.253.15");
		System.out.println(address.getHostName());//�����ʱIP������������������IP�����ڣ��򷵻�LocalHost
		System.out.println(address.getHostAddress());//����163��������IP��61.135.253.15
	}
}
