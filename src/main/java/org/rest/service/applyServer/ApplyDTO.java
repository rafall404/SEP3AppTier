package org.rest.service.applyServer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ApplyDTO {

    private Long userId;

    private Long jobId;

}
