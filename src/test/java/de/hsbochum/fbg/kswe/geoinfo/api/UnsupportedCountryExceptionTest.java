package de.hsbochum.fbg.kswe.geoinfo.api;

import org.junit.Test;

import java.io.IOException;

/**
 * Created by Maxi on 23.06.2017.
 */
public class UnsupportedCountryExceptionTest {

    @Test(expected = UnsupportedCountryException.class)
    public void testUnsupportedCountryException() throws IOException, UnsupportedCountryException {
        WeatherRetrieverImpl retriever = new WeatherRetrieverImpl();
        retriever.retrieve(new City("Wien","Austria"));
    }
}
