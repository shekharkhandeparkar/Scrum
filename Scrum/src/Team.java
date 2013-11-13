
public class Team {
	Member member;
	ProductOwner productOwner;
	ScrumMaster scrumMaster;
	Customer customer;

	public Team(Member member, ProductOwner productOwner,
			ScrumMaster scrumMaster, Customer customer) {
		this.member=member;
		this.productOwner=productOwner;
		this.scrumMaster=scrumMaster;
		this.customer=customer;
	}

}
