package fr.esgi.dto.request;

import jakarta.validation.constraints.NotNull;

public record RentalCarDtoRequest(
        @NotNull
        String brand,
        @NotNull
        Double model,
        @NotNull
        Double rentAmount,
        @NotNull
        Double securityDepositAmount,

        int numberOfSeats,
        int numberOfDoors,
        boolean hasAirConditioning
) {
}
