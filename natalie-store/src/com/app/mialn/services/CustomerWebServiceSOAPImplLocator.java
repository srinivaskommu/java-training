/**
 * CustomerWebServiceSOAPImplLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.mialn.services;

public class CustomerWebServiceSOAPImplLocator extends org.apache.axis.client.Service implements com.app.mialn.services.CustomerWebServiceSOAPImpl {

    public CustomerWebServiceSOAPImplLocator() {
    }


    public CustomerWebServiceSOAPImplLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerWebServiceSOAPImplLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerWebServiceSOAPImplPort
    private java.lang.String CustomerWebServiceSOAPImplPort_address = "http://localhost:8080/milan-app/api/customer";

    public java.lang.String getCustomerWebServiceSOAPImplPortAddress() {
        return CustomerWebServiceSOAPImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerWebServiceSOAPImplPortWSDDServiceName = "CustomerWebServiceSOAPImplPort";

    public java.lang.String getCustomerWebServiceSOAPImplPortWSDDServiceName() {
        return CustomerWebServiceSOAPImplPortWSDDServiceName;
    }

    public void setCustomerWebServiceSOAPImplPortWSDDServiceName(java.lang.String name) {
        CustomerWebServiceSOAPImplPortWSDDServiceName = name;
    }

    public com.app.milan.services.CustomerWebService getCustomerWebServiceSOAPImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerWebServiceSOAPImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerWebServiceSOAPImplPort(endpoint);
    }

    public com.app.milan.services.CustomerWebService getCustomerWebServiceSOAPImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.app.mialn.services.CustomerWebServiceSOAPImplSoapBindingStub _stub = new com.app.mialn.services.CustomerWebServiceSOAPImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getCustomerWebServiceSOAPImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerWebServiceSOAPImplPortEndpointAddress(java.lang.String address) {
        CustomerWebServiceSOAPImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.app.milan.services.CustomerWebService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.app.mialn.services.CustomerWebServiceSOAPImplSoapBindingStub _stub = new com.app.mialn.services.CustomerWebServiceSOAPImplSoapBindingStub(new java.net.URL(CustomerWebServiceSOAPImplPort_address), this);
                _stub.setPortName(getCustomerWebServiceSOAPImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerWebServiceSOAPImplPort".equals(inputPortName)) {
            return getCustomerWebServiceSOAPImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.mialn.app.com", "CustomerWebServiceSOAPImpl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.mialn.app.com", "CustomerWebServiceSOAPImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerWebServiceSOAPImplPort".equals(portName)) {
            setCustomerWebServiceSOAPImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
