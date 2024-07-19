package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    Uncategorized("Choose here (optional)", true, ""),
    HighPriority("High priority", false, "border-3 border-danger"),
    MediumPriority("Medium priority", false, "border-2 border-warning"),
    LowPriority("Low priority", false, "border-info"),
    NoPriority("No priority", false, "");

    private final String fancyName;

    private final boolean defaultValue;

    private final String attributes;
}
