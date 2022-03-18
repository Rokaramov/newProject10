import java.io.BufferedReader;

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
	public Read() throws IOException {
	InputStream inputStream = Read.class.getResourceAsStream("/text.TXT");
	BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
	int i;
	String line = "";
	while((i=in.read()) != -1 ) {
	line = line + in.readLine() + "\n";	
	}
	  Menu.area.setText(line);
	in.close();
}
}
