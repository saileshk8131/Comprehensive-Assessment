package com.mindtree.manager;




public class PageObjectManager extends WebDriverManager{
	private pageobject.Homepage Homepage;
	private pageobject.AboutUsPage AboutUsPage;
	private pageobject.AirportPage AirportPage;
	private pageobject.ContactUsPage ContactUsPage;
	private pageobject.CorporateCarRentalPage CorporateCarRentalPage;
	private pageobject.LocalPage LocalPage;
	private pageobject.OneWayPage OneWayPage;
	private pageobject.OutstationPage OutstationPage;
	private pageobject.SitemapPage SitemapPage;
	public pageobject.Homepage getHomePage() {
		return(Homepage==null) ? Homepage = new pageobject.Homepage():Homepage;
	}
	public pageobject.AboutUsPage getAboutUsPage() {
		return(AboutUsPage==null) ? AboutUsPage = new pageobject.AboutUsPage():AboutUsPage;
	}
	public pageobject.AirportPage getAirportPage() {
		return(AirportPage==null) ? AirportPage = new pageobject.AirportPage():AirportPage;
	}
	public pageobject.ContactUsPage getContactUsPage() {
		return(ContactUsPage==null) ? ContactUsPage = new pageobject.ContactUsPage():ContactUsPage;
	}
	public pageobject.CorporateCarRentalPage getCorporateCarRentalPage() {
		return(CorporateCarRentalPage==null) ? CorporateCarRentalPage = new pageobject.CorporateCarRentalPage():CorporateCarRentalPage;
	}
	public pageobject.LocalPage getLocalPage() {
		return(LocalPage==null) ? LocalPage = new pageobject.LocalPage():LocalPage;
	}
	public pageobject.OneWayPage getOneWayPage() {
		return(OneWayPage==null) ? OneWayPage = new pageobject.OneWayPage():OneWayPage;
	}
	public pageobject.OutstationPage getOutstationPage() {
		return(OutstationPage==null) ? OutstationPage = new pageobject.OutstationPage():OutstationPage;
	}
	public pageobject.SitemapPage getSitemapPage() {
		return(SitemapPage==null) ? SitemapPage = new pageobject.SitemapPage():SitemapPage;
	}
}
