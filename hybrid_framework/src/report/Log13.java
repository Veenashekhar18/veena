package report;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class Log13 {
@Test
public void test2() throws IOException
{
	//step1
	Layout lay=new PatternLayout("%d %c %m %n");
	Appender app=new FileAppender(lay,"./reports/r13.log");
	BasicConfigurator.configure(app);
	//step2
	Logger log= Logger.getLogger(this.getClass().getName());
	//step3
	log.warn("warn");
	log.info("info");
	log.error("error");
}
}
