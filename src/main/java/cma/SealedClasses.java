package cma;

public class SealedClasses {

}

sealed class Vehicle permits Car, Bicycle{

}

final class Bicycle extends Vehicle {

}

final class Car extends Vehicle {

}