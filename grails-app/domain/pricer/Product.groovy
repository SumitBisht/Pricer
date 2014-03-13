package pricer

class Product {
	
	String barCode
	String description
	Float averagePrice
	Float lowestPrice
	Float highestPrice
	int collectedPriceCount
	def prices = []
	
	def idealPrice(){
		IdealPriceService service = new IdealPriceServiceImpl();
		return service.calculateIdealPrice(this);
	}
	
    static constraints = {
		barCode(blank:false, nullable:false)
    }
}
