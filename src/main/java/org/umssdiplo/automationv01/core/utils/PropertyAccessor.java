package org.umssdiplo.automationv01.core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static final String BROWSER = "browser";
    private static final String BASE_URL = "baseurl";
    private static final String USER_NAME = "username";
    private static final String PASSWORD = "password";
    private static final String MODELO_NAME = "modeloname";
    private static final String MARCA_NAME = "marcaname";
    private static final String ANIO_NAME = "anioname";
    private static final String CODIGO_NAME = "codigoname";
    private static final String DESCRIPCION_NAME = "descripcionname";
    private static final String PRECIO_NAME = "precioname";
    private static final String CATEGORIA_NAME = "categorianame";
    private static final String FILE_NAME = "filename";




    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor(){
        try(FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (FileNotFoundException fe){
            throw new RuntimeException(fe);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance(){
        if(PropertyAccessor == null){
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }

    public int getImplicitTimeWait() {
        return Integer.parseInt(getDataProperty("implicitTimeWait"));
    }

    private String getDataProperty(String nameProperty) {
        String property = System.getProperty(nameProperty);
        if (property == null) {
            return properties.getProperty(nameProperty);
        }
        return property;
    }

    public int getExplicitTimeWait() {
        return Integer.parseInt(getDataProperty("explicitTimeWait"));
    }

    public String getBrowser() {
        return getDataProperty(BROWSER);
    }

    public String getBaseUrl() {
        return getDataProperty(BASE_URL);
    }

    public String getUser() {
        return getDataProperty(USER_NAME);
    }

    public String getPassword() {
        return getDataProperty(PASSWORD);
    }

    public String getModelo() {
        return getDataProperty(MODELO_NAME);
    }
    public String getMarca() {
        return getDataProperty(MARCA_NAME);
    }

    public String getAnio() {
        return getDataProperty(ANIO_NAME);
    }
    public String getCodigo() {
        return getDataProperty(CODIGO_NAME);
    }
    public String getDescripcion() {
        return getDataProperty(DESCRIPCION_NAME);
    }
    public String getPrecio() {
        return getDataProperty(PRECIO_NAME);
    }

    public String getCategoria() {
        return getDataProperty(CATEGORIA_NAME);
    }
    public String getFile() {
        return getDataProperty(FILE_NAME);
    }
}
