import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WorkStatus {
    private String status;


    public static final WorkStatus SUCCESS = WorkStatus.builder().status("SUCCESS").build();
    public static final WorkStatus FAILED = WorkStatus.builder().status("FAILURE").build();
}
