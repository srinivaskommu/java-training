package com.app.milan.services;

public class CustomerWebServiceProxy implements com.app.milan.services.CustomerWebService {
  private String _endpoint = null;
  private com.app.milan.services.CustomerWebService customerWebService = null;
  
  public CustomerWebServiceProxy() {
    _initCustomerWebServiceProxy();
  }
  
  public CustomerWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerWebServiceProxy();
  }
  
  private void _initCustomerWebServiceProxy() {
    try {
      customerWebService = (new com.app.mialn.services.CustomerWebServiceSOAPImplLocator()).getCustomerWebServiceSOAPImplPort();
      if (customerWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerWebService != null)
      ((javax.xml.rpc.Stub)customerWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.app.milan.services.CustomerWebService getCustomerWebService() {
    if (customerWebService == null)
      _initCustomerWebServiceProxy();
    return customerWebService;
  }
  
  public com.app.milan.services.Customer saveCustomer(com.app.milan.services.Customer customer) throws java.rmi.RemoteException{
    if (customerWebService == null)
      _initCustomerWebServiceProxy();
    return customerWebService.saveCustomer(customer);
  }
  
  public com.app.milan.services.Customer[] findAllCustomers() throws java.rmi.RemoteException{
    if (customerWebService == null)
      _initCustomerWebServiceProxy();
    return customerWebService.findAllCustomers();
  }
  
  
}