package com.alibaba.weex.uitest.TC_AG;
import com.alibaba.weex.WXPageActivity;
import com.alibaba.weex.util.TestFlow;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class AG_Margin_Input_Margin_Bottom extends TestFlow {
	public AG_Margin_Input_Margin_Bottom() {
		super(WXPageActivity.class);
	}

	@Before
	public void setUp() throws InterruptedException {
		super.setUp();
		HashMap testMap = new <String, Object> HashMap();
		testMap.put("testComponet", "AG_Margin");
		testMap.put("testChildCaseInit", "AG_Margin_Input_Margin_Bottom");
		testMap.put("step1",new HashMap(){
			{
				put("click", "10");
				put("screenshot", "AG_Margin_Input_Margin_Bottom_01_10");
			}
		});
		testMap.put("step2",new HashMap(){
			{
				put("click", "20");
				put("screenshot", "AG_Margin_Input_Margin_Bottom_02_20");
			}
		});
		super.setTestMap(testMap);
	}

	@Test
	public void doTest(){
		super.testByTestMap();
	}

}
