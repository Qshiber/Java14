package org.SDA.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CarDatabase {

    private final Set<Car> cars;

    public CarDatabase(Set<Car> cars) {
        this.cars = cars;
    }

    //1, Get all cars  x
    // 2. Get all cars from given year  x
    // 3. Get all cars of given engine type  x
    // 4. Get all cars from given brand x
    // 5. Get all cars from given engine type and given brand  x



    public Set<Car> getAllCars() {
        return new HashSet<>(cars);
    }

    public Set<Car> getAllCarsFromYear(Integer year) {
        return cars.stream().filter(car -> car.getYearProduced()
                .equals(year)).collect(Collectors.toSet());
        /*
        HashSet<Car> resultCars = new HashSet<>();
        for(Car car : cars){
            if (car.getYearProduced().equals(year)){
                resultCars.add(car);
            }
        }
        return resultCars;

         */
    }

    public Set<Car> getAllCarsWithGivenEngineType(EngineType engineType) {
        return cars.stream().filter(car -> car.getEngineType()
                .equals(engineType)).collect(Collectors.toSet());
        /*
        HashSet<Car> resultCars = new HashSet<>();
        for(Car car : cars){
            if (car.getEngineType().equals(engineType)){
                resultCars.add(car);
            }
        }
        return resultCars;

         */
    }

    public Set<Car> getAllCarsWithGivenBrand(String brand) {
        return cars.stream()
                .filter(car -> car.getBrand().equals(brand))
                .collect(Collectors.toSet());
    }

    public Set<Car> getAllCarsWithGivenYearBrandAndEngineType(Integer year, String brand, EngineType engineType) {
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .filter(car -> car.getBrand().equals(brand))
                .filter(car -> car.getEngineType().equals(engineType))
                .collect(Collectors.toSet());
    }




    // 6. Get the cheapest car

    public Optional<Car> getCheapestCar(){
        return cars.stream().min(Comparator.comparing(Car::getPrice));
    }

    // 7. Get most expensive car from given year

    public Optional<Car> getMostExpensiveCarFromGivenYear(Integer year){
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .max(Comparator.comparing(Car::getPrice));
    }

    // 8. Get the cheapest car with given engine type and given brand

    public Optional<Car> getMostPowerfullCarWithGivenEngineTypeAndBrand(EngineType engineType, String brand){
        return cars.stream()
                .filter(car -> car.getBrand().equals(brand))
                .filter(car -> car.getEngineType().equals(engineType))
                .max(Comparator.comparing(Car::getHorsePower));
    }

    public Double getAveragePriceOfCarFromGivenYear(Integer year){
        return cars.stream()
                .filter(car -> car.getYearProduced().equals(year))
                .collect(Collectors.averagingInt(Car::getPrice));
    }

//    public Map<EngineType, Integer> groupCarsPerEngineType(){
//        return Arrays.stream(EngineType.values())
//                .collect(Collectors.toMap(engineType -> engineType,
//                        engineType -> cars.stream().filter(car -> car.getEngineType()
//                                .equals(engineType)).collect(Collectors.toSet()));
//    }

}
