package com.seller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value = "/seller")
public class SellerController {

	private final SellerService sellerService;
	
	public SellerController(SellerService sellerService) {
		this.sellerService = sellerService;
	}
	
	@RequestMapping("/user")
		public Seller getSeller(@RequestParam(value="Name",defaultValue="Bob")String Name,@RequestParam(value="serName",defaultValue="Marley")String serName) {
			return sellerService.getSeller(Name,serName);
		}
}
