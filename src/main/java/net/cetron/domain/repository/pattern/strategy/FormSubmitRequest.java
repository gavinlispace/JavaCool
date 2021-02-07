package net.cetron.domain.repository.pattern.strategy;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Data
@Setter
@Getter
public class FormSubmitRequest {
    private String submitType;
    private Long userId;
    private Map<String, Object> formInput;
}