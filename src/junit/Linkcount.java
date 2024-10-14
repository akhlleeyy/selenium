package junit;

import org.junit.Before;

public class Linkcount {
	
	ChromeDriver d;
	
	@Before
	public void load()
	{
		d=new ChromeDrive();
		d.get("https://www.google.com");
	}
	
	@Test
	public void goog()
	{
		List<WebElement> Linkslist=d.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+linkslist.size());
		for (WebElement link : linkslist)
		{
			String Link=link.getAttribute("href");
			String linkText = link.getText();
			verifylink(link);
		}
	}
private void verifylink(string Link) {
	
	try
	{
		URI OB=
	}
}
}
