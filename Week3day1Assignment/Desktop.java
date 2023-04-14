package Week3day1Assignment;

public class Desktop extends Computer {

	public void desktopsize()
	{
		System.out.println("The size of the Desktop: 1920 x 1018" );
		
	}
	
public static void main(String[]args)
{
	Desktop dd= new Desktop();
	dd.ComputerModel();
	dd.desktopsize();
}
}
