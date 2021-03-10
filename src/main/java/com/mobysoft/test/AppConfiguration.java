package com.mobysoft.test;

import com.mobysoft.rent.rentservice.endpoint.RunPipeline;
import com.mobysoft.pipeline.service.RunPipelineService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by kev on 29/04/17.
 */
@Configuration
@ComponentScan( basePackageClasses = {
        RunPipeline.class,
        RunPipelineService.class
})
public class AppConfiguration {
}
