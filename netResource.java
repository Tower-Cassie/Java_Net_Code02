package Github.url;

import java.io.*;
import java.net.*;

public class netResource {
	public static void main(String[] args) throws IOException{
		URL url = new URL("http://www.baidu.com");
		/*
		//1.��ȡ������Դ�����ǽ���ͱ����ʽ��һ�£���ȡ����Դ�л�������
		InputStream io = url.openStream();//��ȡָ����Դ
		byte[] flush = new byte[1024];//��ȡ�ֽ���
		int len = 0;
		while((len = io.read(flush)) != -1)
			System.out.println(new String(flush,0,len));
		io.close();
		
		
		//2.��ָ������Դ�ڱ��ؽ�����ʾ��������Դ�����ʽ
		//��ָ������ַ��ȡ��Դ,ͳһ����ͽ����ʽ
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		String str = null;
		while((str = br.readLine()) != null){
			System.out.println(str);
		}
		br.close();*/
		
		//3.��ָ����������Դ�ڱ��ؽ�����ʾ���ﵽ������ҳһ����Ч��
		//��ָ������ַ��ȡ��Դ
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
		//����ַ����ȡ����Դ�ڱ��ؽ�����ʾ�������ԭ��:��ȡ������Դ��Ȼ������������ʽ���д�����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		String msg = null;
		while((msg = br.readLine()) != null){
			bw.append(msg);
			//����BufferedReader/BufferedWriter���󣬲��ɱ����һ�仰
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
