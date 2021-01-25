import java.applet.*;
import java.awt.*;

public class GUI2 extends Applet
{
	Button b1,b2,b3;
	public GUI2()
	{
		b1 = new Button("red");
		b2 = new Button("green");
		b3 = new Button("blue");
		
		add(b1);
		add(b2);
		add(b3);
	}
}
/*
<applet code=GUI2 width=234 height=234>
</applet>
*/