package GameUtil;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;

public class JiaZai extends Frame {
	public void launchFrame() {//���ô���
		setSize(Constant.GAME_HIHGT,Constant.GAME_HIHGT);//���ڴ�С
		setLocation(100,100);//�������
		setVisible(true);//���ڿ��ӻ�
		
		
		new PaintThread().start();//�����߳�
		/**
		 * �رմ��ڰ���
		 */
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	///�ػ����ڵ��߳��࣬��һ���ڲ���
 class PaintThread extends Thread{
	 public void run() {
		 while(true) {
			 repaint();
			 try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }
	 }
 }
}
