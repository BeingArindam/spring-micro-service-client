package com.arindam.business.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.business.reservation.client.GuestService;
import com.arindam.business.reservation.client.RoomService;
import com.arindam.business.reservation.domain.Guest;
import com.arindam.business.reservation.domain.Room;

@RestController
public class RoomReservationController {
	@Autowired RoomService roomService;
	@Autowired GuestService guestService;
	@GetMapping(value = "/rooms")
	public List<Room> getAll() {
		return roomService.findAll(null);
	}
	
	@GetMapping(value = "/guests")
	public List<Guest> getAllGuest() {
		return guestService.findAll(null);
	}

}
