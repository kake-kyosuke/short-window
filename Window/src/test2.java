import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class test2 extends JFrame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ウィンドウの作成およびタイトルの設定
	    JFrame frame = new JFrame("ショートカット");
	    // バツボタンでプログラムを終了するようにする
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // ウィンドウサイズの指定
	    frame.setSize(450, 100);
	    //サイズの固定化
	    frame.setResizable(false);
	    // ウィンドウを画面中央に配置
	    frame.setLocationRelativeTo(null);
	    // ウィンドウを可視状態にする
	    frame.setVisible(true);
	    
	    // レイアウトを設定
	    frame.setLayout(new FlowLayout());
	    
	    // ボタン1を作成 アイコン絶対パス
	    ImageIcon icon1 = new ImageIcon("./src/img/YoutubeIcon.png");
	    JButton button1 = new JButton(icon1);
	    //ボタンサイズ
	    button1.setPreferredSize(new Dimension(100, 50));
	    // ボタン1を押した時の処理を設定
	    button1.addActionListener(e -> {
	    	System.out.println("ボタン1が押された");
	      // 開くURL 参考→ http://dotnsf.blog.jp/archives/1022900387.html
	    	String uriString = "https://www.youtube.com/"; 
	    	Desktop desktop = Desktop.getDesktop();
	    		try{
	        URI uri = new URI( uriString );
	        	desktop.browse( uri );
	    		}catch( Exception error ){
	    			error.printStackTrace();
	      }
	      
	    });
	    // ボタン2を作成
	    ImageIcon icon2 = new ImageIcon("./src/img/Google.png");
	    JButton button2 = new JButton(icon2);
	    //ボタンサイズ
	    button2.setPreferredSize(new Dimension(100, 50));
	    button2.addActionListener(e -> {
	    	String uriString = "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe\""; 
	    	Desktop desktop = Desktop.getDesktop();
	    		try{
	    			URI uri = new URI( uriString );
	    			desktop.browse( uri );
	    		}catch( Exception error ){
	    			error.printStackTrace();
	    		}
	    });
	    // ボタン3を作成
	    ImageIcon icon3 = new ImageIcon("./src/img/NetflixIcon.png");
	    JButton button3 = new JButton(icon3);
	    //ボタンサイズ
	    button3.setPreferredSize(new Dimension(100, 50));
	    button3.addActionListener(e -> {
	    	String uriString = "https://www.netflix.com/browse"; 
	    	Desktop desktop = Desktop.getDesktop();
	    		try{
	    			URI uri = new URI( uriString );
	    			desktop.browse( uri );
	    		}catch( Exception error ){
	    			error.printStackTrace();
	    		}
	    });
	    // ボタン4を作成
//	    ImageIcon icon4 = new ImageIcon("./img/TwitchIcon.png");
//	    JButton button4 = new JButton(icon4);
//	    //ボタンサイズ
//	    button4.setPreferredSize(new Dimension(100, 50));
//	    button4.addActionListener(e -> {
//	    	String uriString = "https://www.twitch.tv/?lang=ja"; 
//	    	Desktop desktop = Desktop.getDesktop();
//	    		try{
//	    			URI uri = new URI( uriString );
//	    			desktop.browse( uri );
//	    		}catch( Exception error ){
//	    			error.printStackTrace();
//	    		}
//	    });
	    
	     //ボタン4を作成  exec使用。アプリ開けるようになったらいいな
	    ImageIcon icon4 = new ImageIcon("./src/img/YoutubeIcon.png"); //直下
	    JButton button4 = new JButton(icon4);
	    button4.addActionListener(e -> {
	    	 String filename = "\"C:\\Users\\user03\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe\"";
	    		try{
	    			Runtime r = Runtime.getRuntime();
	    			r.exec(filename);
	    		}catch( Exception error ){
	    			error.printStackTrace();
	    		}
	    });
	    System.out.print("前面固定 Win + Ctrl + T");
	    // https://www.tohoho-web.com/java/swing.htm


	    // ボタンをウィンドウに追加する
	    frame.add(button1);
	    frame.add(button2);
	    frame.add(button3);
	    frame.add(button4);
	    //frame.add(button5);
	    
	    frame.setVisible(true);
	    
	}

}

