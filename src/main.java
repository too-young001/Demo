import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import java.awt.event.ActionEvent;
public class wind {
	
	public static void main(String[] args) throws IOException {
		JFrame a = new JFrame("GM-king");//创建一个窗体
		a.getContentPane().setBackground(Color.CYAN);//设置窗体的颜色
		a.setLayout(null);//取消布局管理器

		JButton b1 =new JButton("提交");//创建按钮对象
		JButton b2 =new JButton("关闭");
		
		JTextArea c2 = new JTextArea("你好！很高兴见到你");//创建文本框对象
		ImageIcon img = new ImageIcon("src\\images\\r1.jpg");//背景图片
		ImageIcon img1 = new ImageIcon("src\\images\\r3.jpg");//背景图片
		JLabel d4 = new JLabel("回答内容");//创建标签对象
		JLabel d3 = new JLabel("提问区域");
		JLabel d2 = new JLabel("开发者-图样图森破");
		JLabel d1 = new JLabel(img);//将图片显示到标签里面
		JLabel d5 = new JLabel(img1);//将图片显示到标签里面
		
		//JScrollPane jsp=new JScrollPane(c1);//新建一个滚动条界面，将文本框传入
		JPanel jp=new JPanel();//创建面板对象
		JTextArea c1 =new JTextArea("很高兴见到你  o(≥v≤)o~~好棒");//创建文本区域对象
		JScrollPane jsp=new JScrollPane(c1);//新建一个滚动条界面，将文本框传入
		jp.add(jsp);
		

		
		d4.setForeground(Color.RED);//设置标签的位置和颜色
		d4.setBounds(680,90,100,100);
		d3.setForeground(Color.RED);
		d3.setBounds(400,160,100,100);
		d2.setForeground(Color.ORANGE);
		d2.setBounds(780, 30,100, 100);//设置标签位置和颜色
		d1.setBounds(700, 5, img.getIconWidth(), img.getIconHeight());// 设置背景标签的位置
		d5.setBounds(0,0,img1.getIconWidth(), img1.getIconHeight());// 设置背景标签的位置
		
		
		d4.setFont(new Font("微软雅黑",0,25));//设置标签的字体大小
		d3.setFont(new Font("华文琥珀",0,25));
		d2.setFont(new Font("黑体",0,15));
		
		a.setIconImage(img.getImage());//给程序添加图标
		a.setLocation(400, 200);//窗体位置
		a.setSize(900, 500);//窗体大小
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//窗体关闭方法
		a.setResizable(false);//窗体禁止放大
		a.setVisible(true);//窗体可见

		
		c2.setFont(new Font("黑体",Font.BOLD,20));//设置字体类型以及格式
		c1.setFont(new Font("黑体",Font.BOLD,20));
		c1.setForeground(Color.white);//设置字体颜色
		c2.setForeground(Color.MAGENTA);
		c1.setBackground(Color.pink);//设置文本框颜色
		c2.setBackground(Color.CYAN);
		c1.setLineWrap(true);//激活文本区域自动换行功能
		c1.setWrapStyleWord(true);//激活文本区域换行不断字功能
		c2.setLineWrap(true);//激活文本区域自动换行功能
		c2.setWrapStyleWord(true);//激活文本区域换行不断字功能
		b1.setBounds(10,400,70,50);//设置按钮大小与坐标
		b2.setBounds(160,400,70,50);
		c1.setBounds(10,5,670,150);//设置文本框和文本区域的位置
		c2.setBounds(10,200,380,100);




		a.add(d1);//将标签以及标签上的图片添加到窗体中
		a.add(d2);
		a.add(d3);
		a.add(d4);
		a.add(b1);//将按钮添加到窗体对象当中
		a.add(b2);
		a.add(c2);
		a.add(c1);//添加文本框和文本区域添加到窗体对象中
		a.add(d5);
		a.add(jp);


		b2.setBackground(Color.yellow);//设置按钮的颜色
		b2.addActionListener(new ActionListener(){//b2按钮添加监听事件，并设置关闭方法
			public void  actionPerformed(ActionEvent argsO){
					  System.exit(0);
			}
		});
		b1.setBackground(Color.PINK);//设置按钮颜色
		b1.addActionListener(new ActionListener(){//给文本框b1添加监听事件
			public  void actionPerformed(ActionEvent argO){
			String APIKEY = "e7a1447ed2182d57758ca845e5a0f36e";//计入图铃机器人的API
			String sb1 =c2.getText();//获取文本框c2中的值赋值到sbi
			try {//处理程序异常
				String INFO = URLEncoder.encode(sb1, "utf-8");
				String getURL = "http://www.tuling123.com/openapi/api?key=" + APIKEY + "&info=" + INFO;
				URL getUrl = new URL(getURL);
				HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection(); 
		        connection.connect(); 
		        BufferedReader reader1 = new BufferedReader(new InputStreamReader( connection.getInputStream(), "utf-8")); 
		        StringBuffer sb = new StringBuffer(); 
		        String line = ""; 
		        while ((line = reader1.readLine()) != null) { 
		            sb.append(line); 
		        } 
		        reader1.close(); //关闭流
		        // 断开连接 
		        connection.disconnect();
		        String sb2=sb.toString();//将获取到的值转换成字符串
				c1.setText(sb2);//将获取的字符串传入到文本域中
				}
			 catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			 }
			}
			});
		// TODO 自动生成的方法存根
	}
	}







