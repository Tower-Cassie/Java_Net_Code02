package Github.url;
/**
 * ����URL��������ַ���
 * 1������·��������Э������������ �˿�/��Դ#��㣨�൱�ڿ��鶨λ��ÿһ�½ڣ����������û��Լ�����Ĳ�����
 * 2�����·���Ĺ���
 */
import java.net.*;

public class Constructer {
	public static void main(String[] args) throws MalformedURLException{
		/*
		//����·��������Э������������ �˿�/��Դ#��㣨�൱�ڿ��鶨λ��ÿһ�½ڣ����������û��Լ�����Ĳ�����
		URL url = new URL("http://www.baidu.com:80/index.html#aa?uname = bjsxt");
		URL url2 = new URL("http://www.baidu,.com:80/index.html?uname = bjsxt");
		System.out.println("Э�飺" + url.getProtocol());//��ȡЭ��
		System.out.println("������" + url.getHost());//��ȡ����
		System.out.println("�˿ڣ�" + url.getPort());//��ȡ�˿�
		System.out.println("��Դ��" + url.getFile());//��ȡ��Դ
		System.out.println("���:" + url.getRef());//��ȡ���
		System.out.println("�û�������" + url.getQuery());//��ȡ�û���������������㣬����ʾ�գ��粻������㣬�򷵻���ȷ
		
		System.out.println("�û�������" + url2.getQuery());//��ȡ�û�����
		*//*
		//���·���Ĺ���
		//���෽���ὫaĿ¼����
		URL url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"/b.txt");
		System.out.println(url.toString());*/
		
		URL url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"b.text");
		System.out.println(url.toString());
	}

}
