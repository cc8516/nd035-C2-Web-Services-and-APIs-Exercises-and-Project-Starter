package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.service.PricingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
@SpringBootTest
//@WebMvcTest(PricingController.class)
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	PricingService pricingService;

//	@BeforeEach
//	void setUp() {
//		pricingService = new PricingService();
//	}

	@Test
	public void getPrice() throws Exception {
		Price price = new Price();
		price.setPrice(new BigDecimal(5000));
		price.setCurrency("USD");
		price.setVehicleId(1L);
		when(pricingService.getPrice(1L)).thenReturn(new Price());

		mockMvc.perform(MockMvcRequestBuilders.get("/services/price?vehicleId=1"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(MediaType.APPLICATION_JSON));

		verify(pricingService, times(1)).getPrice(1L);
	}

//	@Test
//	public void contextLoads() {
//
//	}

}
