package cn.gyyx.testLcg.BLL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.gyyx.testLcg.model.User;

public class UserBLL {
	static InputStream is;
	static SqlSessionFactory factory;
	static SqlSession session;	
 	private static void initConfig(){
		if(is!=null){
			return;
		}
		try {
			is=Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
		}
	}
	public UserBLL(){
		initConfig();
		factory=new SqlSessionFactoryBuilder().build(is);
	}
	
	public void insert(User model){
		try {
			session=factory.openSession();	
			session.insert("cn.gyyx.testLcg.model.User.add",model);
			session.commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public void delete(int id){
		try {
			session=factory.openSession();	
			session.insert("cn.gyyx.testLcg.model.User.delete",id);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public void update(User model){
		try {
			session=factory.openSession();	
			session.update("cn.gyyx.testLcg.model.User.update",model);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
	}
	
	public List<User> select(){
		List<User> userList = new ArrayList<User>();
		try {
			session=factory.openSession();	
			userList=session.selectList("cn.gyyx.testLcg.model.User.selectAll");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return userList;
	}
	public User select(String name){
		User userInfo = new User();
		try {
			session=factory.openSession();	
			userInfo=session.selectOne("cn.gyyx.testLcg.model.User.select",name);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			session.close();
		}
		return userInfo;
	}
	
	
	
	public String readContentFromGet() { 

        String lines=""; 
        HttpURLConnection connection;
        BufferedReader reader;
		try {
	        // 拼凑get请求的URL字串，使用URLEncoder.encode对特殊和不可见字符进行编码 

	        String getURL = "http://uuid.gyyx.cn/";

	        URL getUrl = new URL(getURL); 

	        // 根据拼凑的URL，打开连接，URL.openConnection()函数会根据 URL的类型，返回不同的URLConnection子类的对象，在这里我们的URL是一个http，因此它实际上返回的是HttpURLConnection 

			
			connection = (HttpURLConnection) getUrl.openConnection();
	        // 建立与服务器的连接，并未发送数据 
			connection.connect();
			
			// 发送数据到服务器并使用Reader读取返回的数据 
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
	        System.out.println(" ============================= "); 

	        System.out.println(" Contents of get request "); 

	        System.out.println(" ============================= "); 

	        lines = reader.readLine();

	        
	        reader.close(); 
	        // 断开连接 
	        connection.disconnect(); 
		} catch (IOException e) {
			e.printStackTrace();
		} 

        System.out.println(" ============================= "); 

        System.out.println(" Contents of get request ends "); 

        System.out.println(" ============================= "); 
        return lines;
	}
	
//	private String Send(String url, String param){
//		PrintWriter out = null;
//        BufferedReader in = null;
//        String result = "";
//        try {
//            URL realUrl = new URL(url);
//            // 打开和URL之间的连接
//            URLConnection conn = realUrl.openConnection();
//            // 设置通用的请求属性
//            conn.setRequestProperty("accept", "*/*");
//            conn.setRequestProperty("connection", "Keep-Alive");
//            conn.setRequestProperty("user-agent",
//                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            // 发送POST请求必须设置如下两行
//            conn.setDoOutput(true);
//            conn.setDoInput(true);
//            // 获取URLConnection对象对应的输出流
//            out = new PrintWriter(conn.getOutputStream());
//            // 发送请求参数
//            out.print(param);
//            // flush输出流的缓冲
//            out.flush();
//            // 定义BufferedReader输入流来读取URL的响应
//            in = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream()));
//            String line;
//            while ((line = in.readLine()) != null) {
//                result += line;
//            }
//        } catch (Exception e) {
//            System.out.println("发送 POST 请求出现异常！"+e);
//            e.printStackTrace();
//        }
//        //使用finally块来关闭输出流、输入流
//        finally{
//            try{
//                if(out!=null){
//                    out.close();
//                }
//                if(in!=null){
//                    in.close();
//                }
//            }
//            catch(IOException ex){
//                ex.printStackTrace();
//            }
//        }
//        return result;
//	}

	
}
