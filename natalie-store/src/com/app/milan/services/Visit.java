/**
 * Visit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.milan.services;

public class Visit  implements java.io.Serializable {
    private java.lang.Long customerId;

    private java.lang.String description;

    private double productExpense;

    private double serviceExpense;

    private java.util.Calendar visitDate;

    private java.lang.Long visitId;

    public Visit() {
    }

    public Visit(
           java.lang.Long customerId,
           java.lang.String description,
           double productExpense,
           double serviceExpense,
           java.util.Calendar visitDate,
           java.lang.Long visitId) {
           this.customerId = customerId;
           this.description = description;
           this.productExpense = productExpense;
           this.serviceExpense = serviceExpense;
           this.visitDate = visitDate;
           this.visitId = visitId;
    }


    /**
     * Gets the customerId value for this Visit.
     * 
     * @return customerId
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Visit.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the description value for this Visit.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Visit.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the productExpense value for this Visit.
     * 
     * @return productExpense
     */
    public double getProductExpense() {
        return productExpense;
    }


    /**
     * Sets the productExpense value for this Visit.
     * 
     * @param productExpense
     */
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }


    /**
     * Gets the serviceExpense value for this Visit.
     * 
     * @return serviceExpense
     */
    public double getServiceExpense() {
        return serviceExpense;
    }


    /**
     * Sets the serviceExpense value for this Visit.
     * 
     * @param serviceExpense
     */
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }


    /**
     * Gets the visitDate value for this Visit.
     * 
     * @return visitDate
     */
    public java.util.Calendar getVisitDate() {
        return visitDate;
    }


    /**
     * Sets the visitDate value for this Visit.
     * 
     * @param visitDate
     */
    public void setVisitDate(java.util.Calendar visitDate) {
        this.visitDate = visitDate;
    }


    /**
     * Gets the visitId value for this Visit.
     * 
     * @return visitId
     */
    public java.lang.Long getVisitId() {
        return visitId;
    }


    /**
     * Sets the visitId value for this Visit.
     * 
     * @param visitId
     */
    public void setVisitId(java.lang.Long visitId) {
        this.visitId = visitId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Visit)) return false;
        Visit other = (Visit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.productExpense == other.getProductExpense() &&
            this.serviceExpense == other.getServiceExpense() &&
            ((this.visitDate==null && other.getVisitDate()==null) || 
             (this.visitDate!=null &&
              this.visitDate.equals(other.getVisitDate()))) &&
            ((this.visitId==null && other.getVisitId()==null) || 
             (this.visitId!=null &&
              this.visitId.equals(other.getVisitId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Double(getProductExpense()).hashCode();
        _hashCode += new Double(getServiceExpense()).hashCode();
        if (getVisitDate() != null) {
            _hashCode += getVisitDate().hashCode();
        }
        if (getVisitId() != null) {
            _hashCode += getVisitId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Visit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.milan.app.com", "visit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productExpense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productExpense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceExpense");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceExpense"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
