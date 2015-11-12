package hxk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hxk
 * @description
 *2015年11月12日  下午3:15:29
 */
public class Task {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    public void time(){
	Date date = new Date();
	System.out.println(sdf.format(date));
    }
    
    public void min(){
	Date date = new Date();
	System.out.println("min" + sdf.format(date));
    }
    
    
}
