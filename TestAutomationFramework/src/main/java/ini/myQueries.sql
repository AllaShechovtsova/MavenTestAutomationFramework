SELECT flightNumber FROM flight WHERE departureAirport='London' AND arrivalAirport='Munich' AND averageTicketPrice<100 AND availableSeats>4



SELECT airline,averageTicketPrice,priorityBoarding,availableSeats,additionalSpaceService
FROM flight

JOIN airports  ON airports.id_airport=flight.departureAirport

JOIN airlanes  ON flight.flightNumber=airlanes.flightNumber

WHERE departureAirport='London' AND arrivalAirport='Munich' AND averageTicketPrice<100 AND availableSeats>4 AND additionalSpaceService='yes' AND priorityBoarding='yes'


SELECT flightNumber,averageTicketPrice,departureAirport,arrivalAirport 

FROM flight 
JOIN airports  ON airports.id_airport=flight.departureAirport

WHERE  stopsNumber=0 AND averageTicketPrice<500 AND departureAirport='London'


SELECT departureAirport,arrivalAirport,webRegistration

FROM flight 
JOIN airlanes  ON flight.flightNumber=airlanes.flightNumber

WHERE (arrivalAirport IN ('Milan','Helsinki') ) AND webRegistration='yes'