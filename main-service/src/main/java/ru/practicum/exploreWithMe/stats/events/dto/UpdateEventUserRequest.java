package ru.practicum.exploreWithMe.stats.events.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.practicum.exploreWithMe.stats.events.model.Location;
import ru.practicum.exploreWithMe.stats.statuses.StateAction;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEventUserRequest {
    @NotNull
    @NotBlank
    @NotEmpty
    private String description;
    @NotNull
    @NotBlank
    @NotEmpty
    private String annotation;
    private Long category;
    private String eventDate;
    private Location location;
    private Boolean paid;
    @PositiveOrZero
    private Integer participantLimit;
    private Boolean requestModeration;
    private StateAction stateAction;
    private String title;
}
