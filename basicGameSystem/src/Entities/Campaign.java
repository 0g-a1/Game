package Entities;

public class Campaign implements EntityIF {

	private int campaignId;
	private String campaingName;
	private double discount;
	
	public Campaign(int campaignId, String campaingName, double discount) {
		super();
		this.campaignId = campaignId;
		this.campaingName = campaingName;
		this.discount = discount;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
