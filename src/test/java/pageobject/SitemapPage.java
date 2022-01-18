package pageobject;

import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;
import com.mindtree.exceptions.WebDriverHelperException;
import com.mindtree.reusable.BaseTest;
import com.mindtree.reusable.WebDriverHelper;

import uistore.SitemapPageUI;
import utility.Logs;

public class SitemapPage extends BaseTest {
	WebDriverHelper helper;
	Logs loggerUtil;
	Logger log;

	public SitemapPage(){
		helper = new WebDriverHelper();
		loggerUtil = new Logs();
	}
	
	public void clickonsitemap() {
		log = loggerUtil.createLog("Sitemap.java");
		try {
			helper.actionClick(SitemapPageUI.sitemap);
			log.debug("Clicked on Sitemap under Get in touch section");
			test.log(Status.PASS, "Clicked on Sitemap under Get in touch section");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	
	public void Switchtab(int i) {
		try {
			helper.switchHandles(i);
			log.debug("Switched to new Tab");
			test.log(Status.PASS, "Switched to new Tab");
		} catch (Exception e) {
			log.debug("Cannot Switched to new Tab");
			test.log(Status.FAIL, "Cannot Switched to new Tab");

		}
	}
	public void clickoncabtypes() {
		try {
			helper.actionClick(SitemapPageUI.cabtype);
			log.debug("Clicked on Cab Types");
			test.log(Status.PASS, "Clicked on CabTypes");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
	public void clickonTataindica() {
		try {
			helper.actionClick(SitemapPageUI.tataindica);
			log.debug("Clicked on Tata indica cab");
			test.log(Status.PASS, "Clicked on Tata indica cab");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}

	public void verifyheading() {
		try {
			helper.getText(SitemapPageUI.heading);
			log.debug("Heading of the page is verified");
			test.log(Status.PASS, "Heading of the page is verified");
		} catch (WebDriverHelperException e) {
			e.printStackTrace();
		}
	}
}
