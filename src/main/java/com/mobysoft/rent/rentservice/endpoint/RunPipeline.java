package com.mobysoft.rent.rentservice.endpoint;

import com.mobysoft.pipeline.service.RunPipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by kev on 17/03/17.
 */
@RestController
@RequestMapping("pipeline")
public class RunPipeline {

    private RunPipelineService service;

    @Autowired
    public RunPipeline( RunPipelineService service ) {
        this.service = service;
    }

    @RequestMapping(
            method = {RequestMethod.POST},
            value = {"run"},
            produces = "application/json"
    )
    @CrossOrigin
    public RunPipelineService.Response runPipeline( @RequestBody String requestJSON ) {

        return this.service.runPipeline( requestJSON );

    }

    // === INTERNAL Classes -------------------------------------------------------------------------------------

}
