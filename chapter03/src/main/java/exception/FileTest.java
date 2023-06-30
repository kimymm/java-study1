package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		InputStream is = null; //try catch가 얼마나 안좋은지 : 졸라 더러움 5줄이 핵심코드인데, 30라인의 try catch을 
		try {					//Spring이 이꼴을 못보는 것이지. 지금은 이렇게 적지만, 후에 이런 상황은 Spring이
			is =new FileInputStream("hello2.txt"); // 어 파일이름오류
			int data = is.read(); // 이거 하나 덕분에
		} catch(FileNotFoundException e) {
			System.out.println("error:" + e);
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("error:" + e);
		} finally{
			try {
				if(is !=null) {
				is.close();
				}					//null.close(); 세상에 또 nullpointexception나오네
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//이거때문에 try catch를 배웠던 것
		}
	}

}
