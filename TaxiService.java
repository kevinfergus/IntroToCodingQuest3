* Assemble the Vehicles into a list. Be sure the order of the Vehicles remain:
* one, two, three.
*
* @param one
* @param two
* @param three
* @return
*/
public List<Vehicle> list(Vehicle one, Vehicle two, Vehicle three) {
List<Vehicle> vehicles = new ArrayList<Vehicle>();
if(!one.equals(null)){
vehicles.add(one);
}
if(!two.equals(null)){
vehicles.add(two);
}
if(!three.equals(null)){
vehicles.add(three);
}
return vehicles;
}

/**
* Ride cannot have more than 4 passengers. Ride must have a driver and at least
* 1 passenger.
*
* If the Ride is not valid, throw the InvalidRideException.
*
* @param ride
* @return
*/
public void validate(Ride ride) throws InvalidRideException {
if (ride == null){
throw new InvalidRideException();
}

if(ride.getDriver()== null || ride.getPassengers() == null){
throw new InvalidRideException();
}

int passengers = ride.getPassengers().size();
if(passengers <1 || passengers > 4 ){
throw new InvalidRideException();
}

}
}
