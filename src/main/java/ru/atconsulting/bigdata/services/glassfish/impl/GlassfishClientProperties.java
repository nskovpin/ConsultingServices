package ru.atconsulting.bigdata.services.glassfish.impl;

import ru.atconsulting.bigdata.services.ClientProperties;

import java.util.List;
import java.util.Properties;

/**
 * Created by NSkovpin on 08.06.2016.
 */
public class GlassfishClientProperties implements ClientProperties{

    private Properties properties;

    private List<String> additionalParams;

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }

    public List<String> getAdditionalParams() {
        return additionalParams;
    }

    public void setAdditionalParams(List<String> additionalParams) {
        this.additionalParams = additionalParams;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public GlassfishClientProperties(Properties properties){
        this.properties = properties;
    }

    public GlassfishClientProperties(){
    }

}
