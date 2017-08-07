package Github.url;
/**
 * 创建URL对象的两种方法
 * 1）绝对路径构建：协议名：域名： 端口/资源#瞄点（相当于看书定位到每一章节）？参数（用户自己传入的参数）
 * 2）相对路径的构造
 */
import java.net.*;

public class Constructer {
	public static void main(String[] args) throws MalformedURLException{
		/*
		//绝对路径构建：协议名：域名： 端口/资源#瞄点（相当于看书定位到每一章节）？参数（用户自己传入的参数）
		URL url = new URL("http://www.baidu.com:80/index.html#aa?uname = bjsxt");
		URL url2 = new URL("http://www.baidu,.com:80/index.html?uname = bjsxt");
		System.out.println("协议：" + url.getProtocol());//获取协议
		System.out.println("域名：" + url.getHost());//获取域名
		System.out.println("端口：" + url.getPort());//获取端口
		System.out.println("资源：" + url.getFile());//获取资源
		System.out.println("瞄点:" + url.getRef());//获取瞄点
		System.out.println("用户参数：" + url.getQuery());//获取用户参数，若存在瞄点，则显示空，如不存在瞄点，则返回正确
		
		System.out.println("用户参数：" + url2.getQuery());//获取用户参数
		*//*
		//相对路径的构造
		//此类方法会将a目录隐藏
		URL url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"/b.txt");
		System.out.println(url.toString());*/
		
		URL url = new URL("http://www.baidu.com:80/a/");
		url = new URL(url,"b.text");
		System.out.println(url.toString());
	}

}
