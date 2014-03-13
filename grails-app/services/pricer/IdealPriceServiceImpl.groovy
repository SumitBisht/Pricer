package pricer

class IdealPriceServiceImpl implements IdealPriceService {

	@Override
	public float calculateIdealPrice(Product product) {
		def list = []
		list = product.prices.sort()
		if(list.size<4)
			return 0;
		def subList = list.subList(2, list.size-2)
		def sum = subList.sum()
		def average = sum/subList.size
		return average * 120/100
	}
}
