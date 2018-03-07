package com.arindam.business.reservation.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.arindam.business.reservation.domain.Guest;

@FeignClient(value = "GUESTSERVICES", fallback = GuestServiceFallbackImpl.class)
public interface GuestService {

	@RequestMapping(value = "/guests", method = RequestMethod.GET)
	List<Guest> findAll(@RequestParam(name = "emailAddress", required = false) String emailAddress);

	@RequestMapping(value = "/guests/{id}", method = RequestMethod.GET)
	Guest findOne(@PathVariable(name = "id") long id);
}
