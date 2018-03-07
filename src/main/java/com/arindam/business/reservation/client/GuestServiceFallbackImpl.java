package com.arindam.business.reservation.client;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arindam.business.reservation.domain.Guest;

@Component
public class GuestServiceFallbackImpl implements GuestService {

	@Override
	public List<Guest> findAll(String emailAddress) {
		return Collections.EMPTY_LIST;
	}

	@Override
	public Guest findOne(long id) {
		Guest guest = new Guest();
		guest.setFirstName("Arindam");
		guest.setLastName("Occupied");
		return guest;
	}

}
