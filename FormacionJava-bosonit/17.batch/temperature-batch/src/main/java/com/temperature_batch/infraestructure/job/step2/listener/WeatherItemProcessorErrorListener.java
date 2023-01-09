package com.temperature_batch.infraestructure.job.step2.listener;

import com.temperature_batch.domain.Weather;
import com.temperature_batch.domain.WeatherRisk;
import com.temperature_batch.infraestructure.job.step1.listener.WeatherItemProcessorListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ItemProcessListener;

public class WeatherItemProcessorErrorListener implements ItemProcessListener<Weather, WeatherRisk>{
    private static final Logger LOGGER= LoggerFactory.getLogger(WeatherItemProcessorErrorListener.class);

    @Override
    public void beforeProcess(Weather weather) {
        LOGGER.info("beforeProcess");
    }

    @Override
    public void afterProcess(Weather weather, WeatherRisk weatherRisk) {
        LOGGER.info("afterProcess: " + weather + " ---> " + weatherRisk);
    }

    @Override
    public void onProcessError(Weather weather, Exception e) {
        LOGGER.info("onProcessError");
    }
}
