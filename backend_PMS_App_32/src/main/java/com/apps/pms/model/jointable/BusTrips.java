package com.apps.pms.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.pms.model.Bus;
import com.apps.pms.model.Route;
import com.apps.pms.model.Driver;
import com.apps.pms.model.Trip;

@Entity(name = "BusTrips")
@Table(schema = "\"pms\"", name = "\"BusTrips\"")
@Data
public class BusTrips{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BusId\"")
	private Integer busId;

    
    @Column(name = "\"TripId\"")
    private Long tripId;
 
}