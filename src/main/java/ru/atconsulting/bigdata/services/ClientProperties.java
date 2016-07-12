package ru.atconsulting.bigdata.services;

import java.util.List;
import java.util.Properties;

/**
 * Created by NSkovpin on 15.06.2016.
 */
public interface ClientProperties {

    Properties getProperties();

    String getProperty(String propertyName);

    List<String> getAdditionalParams();

    void setAdditionalParams(List<String> additionalParams);

}
