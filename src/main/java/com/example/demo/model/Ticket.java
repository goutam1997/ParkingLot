package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ticket {
	int id;
	ParkingSpot parkingSpot;
	Vehicle vehicle;
	long entryTime;
}