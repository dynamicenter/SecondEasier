package com.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/seller")
public class SellerController {

	private final SellerService sellerService;
	
	@Autowired
	public SellerController(SellerController sellerController) {
		this.sellerController = sellerController;
	}
	
	@RequestMapping("/user")
		public Seller getSeller(@RequestParam(value=("Name",defaultValue="Bob")String Name,@RequestParam(value="serName",defaultValue="Marley")String serName) {
			return sellerService.getSeller(Name,serName);
		}
}
