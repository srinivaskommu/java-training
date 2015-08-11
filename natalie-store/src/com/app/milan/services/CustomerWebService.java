/**
 * CustomerWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.milan.services;

public interface CustomerWebService extends java.rmi.Remote {
    public com.app.milan.services.Customer saveCustomer(com.app.milan.services.Customer customer) throws java.rmi.RemoteException;
    public com.app.milan.services.Customer[] findAllCustomers() throws java.rmi.RemoteException;
}
