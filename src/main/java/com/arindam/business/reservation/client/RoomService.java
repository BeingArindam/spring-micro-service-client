package com.arindam.business.reservation.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arindam.business.reservation.domain.Room;

@FeignClient(value = "ROOMSERVICES")
public interface RoomService {
	@GetMapping(value = "/rooms")
	public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber);
}
