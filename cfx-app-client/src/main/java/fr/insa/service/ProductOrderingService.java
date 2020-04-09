package fr.insa.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2020-04-09T17:35:49.883+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://service.insa.fr/", name = "ProductOrderingService")
@XmlSeeAlso({ObjectFactory.class})
public interface ProductOrderingService {

    @WebMethod
    @RequestWrapper(localName = "createProductOrdering", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.CreateProductOrdering")
    @ResponseWrapper(localName = "createProductOrderingResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.CreateProductOrderingResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.insa.service.ProductOrdering createProductOrdering(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.insa.service.ProductOrdering arg0
    );

    @WebMethod
    @RequestWrapper(localName = "getProductOrdering", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProductOrdering")
    @ResponseWrapper(localName = "getProductOrderingResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProductOrderingResponse")
    @WebResult(name = "return", targetNamespace = "")
    public fr.insa.service.ProductOrdering getProductOrdering(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod
    @RequestWrapper(localName = "removeProductOrdering", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.RemoveProductOrdering")
    @ResponseWrapper(localName = "removeProductOrderingResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.RemoveProductOrderingResponse")
    public void removeProductOrdering(
        @WebParam(name = "id", targetNamespace = "")
        java.lang.String id
    );

    @WebMethod
    @RequestWrapper(localName = "getProductOrderings", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProductOrderings")
    @ResponseWrapper(localName = "getProductOrderingsResponse", targetNamespace = "http://service.insa.fr/", className = "fr.insa.service.GetProductOrderingsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.insa.service.ProductOrdering> getProductOrderings();
}
