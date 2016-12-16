package exceptions;
////
import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	private RateDomainModel RDM = new RateDomainModel();
		public void setRDM(RateDomainModel rDM) {
		RDM = rDM;
	}
		public RateDomainModel getRDM() {
			return RDM;
		}

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
