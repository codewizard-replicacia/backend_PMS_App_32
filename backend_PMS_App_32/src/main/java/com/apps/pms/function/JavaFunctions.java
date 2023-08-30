package com.apps.pms.function;

import com.apps.pms.model.Bus;
import com.apps.pms.model.Route;
import com.apps.pms.model.Driver;
import com.apps.pms.model.Trip;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.pms.repository.BusRepository;
import com.apps.pms.repository.TripRepository;
import com.apps.pms.repository.DriverRepository;
import com.apps.pms.repository.RouteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
