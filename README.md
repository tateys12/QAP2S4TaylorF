# QAP2S4TaylorF
QAP2S4Java. working rest api and docker.

This project manages information about passsengers, cities, airports, and aircraft.

API Details

-Passengers
-endpoint: '/passengers'

-Cites
-endpoint: '/cities'

-Airport
-endpoint: '/airport'

-Aircraft
-endpoint: '/aircraft'

Relationships between entity endpoints

-Aircraft passenger is on
-endpoint: '/passengers/1/aircraft'

-City airport is in
-endpoint: '/airport/1/cities'

-Passengers on the aircraft
-endpoint: '/aicraft/1/passengers'

-Airport where aircraft is located
-endpoint: '/aircraft/1/airport'

-Airport where city is located
-endpoint: '/cities/1/airport'

-Passengers that are in the city
-endpoint: '/cities/1/passengers

To run project in docker make sure docker desktop is installed on your computer.

clone this repo

bash
git clone https://github.com/tateys12/QAP2S4TaylorF

build docker image
docker build -t your-image-name

run docker container
docker compose up

project uses spring data jpa repositories for data access.
