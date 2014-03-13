package pricer

import org.junit.Test
import static org.junit.Assert.assertEquals

class ProductTests {
    @Test
    void testDesiredPricesZero() {
		Product p = new Product()
		p.prices = []
		assertEquals 0, p.idealPrice(), 0.1
		p.prices << 12.5
		assertEquals 1, p.prices.size
		assertEquals 0, p.idealPrice(), 0.1
    }

    @Test
    void testForumlaIncrements() {
    	Product p = new Product()
		p.prices = [1,2,3,4,5]
		def desiredValue = 3*1.2
		assertEquals 5, p.prices.size
		assertEquals desiredValue, p.idealPrice(), 0.1
    }
}

