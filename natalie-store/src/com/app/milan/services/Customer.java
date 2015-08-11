/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.milan.services;

public class Customer  implements java.io.Serializable {
    private com.app.milan.services.Address address;

    private java.lang.Long customerId;

    private java.lang.String firstName;

    private java.lang.String isAMember;

    private java.lang.String lastName;

    private java.lang.String memberType;

    private com.app.milan.services.Visit[] visits;

    public Customer() {
    }

    public Customer(
           com.app.milan.services.Address address,
           java.lang.Long customerId,
           java.lang.String firstName,
           java.lang.String isAMember,
           java.lang.String lastName,
           java.lang.String memberType,
           com.app.milan.services.Visit[] visits) {
           this.address = address;
           this.customerId = customerId;
           this.firstName = firstName;
           this.isAMember = isAMember;
           this.lastName = lastName;
           this.memberType = memberType;
           this.visits = visits;
    }


    /**
     * Gets the address value for this Customer.
     * 
     * @return address
     */
    public com.app.milan.services.Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Customer.
     * 
     * @param address
     */
    public void setAddress(com.app.milan.services.Address address) {
        this.address = address;
    }


    /**
     * Gets the customerId value for this Customer.
     * 
     * @return customerId
     */
    public java.lang.Long getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Customer.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Long customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the firstName value for this Customer.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Customer.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the isAMember value for this Customer.
     * 
     * @return isAMember
     */
    public java.lang.String getIsAMember() {
        return isAMember;
    }


    /**
     * Sets the isAMember value for this Customer.
     * 
     * @param isAMember
     */
    public void setIsAMember(java.lang.String isAMember) {
        this.isAMember = isAMember;
    }


    /**
     * Gets the lastName value for this Customer.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Customer.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the memberType value for this Customer.
     * 
     * @return memberType
     */
    public java.lang.String getMemberType() {
        return memberType;
    }


    /**
     * Sets the memberType value for this Customer.
     * 
     * @param memberType
     */
    public void setMemberType(java.lang.String memberType) {
        this.memberType = memberType;
    }


    /**
     * Gets the visits value for this Customer.
     * 
     * @return visits
     */
    public com.app.milan.services.Visit[] getVisits() {
        return visits;
    }


    /**
     * Sets the visits value for this Customer.
     * 
     * @param visits
     */
    public void setVisits(com.app.milan.services.Visit[] visits) {
        this.visits = visits;
    }

    public com.app.milan.services.Visit getVisits(int i) {
        return this.visits[i];
    }

    public void setVisits(int i, com.app.milan.services.Visit _value) {
        this.visits[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.isAMember==null && other.getIsAMember()==null) || 
             (this.isAMember!=null &&
              this.isAMember.equals(other.getIsAMember()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.memberType==null && other.getMemberType()==null) || 
             (this.memberType!=null &&
              this.memberType.equals(other.getMemberType()))) &&
            ((this.visits==null && other.getVisits()==null) || 
             (this.visits!=null &&
              java.util.Arrays.equals(this.visits, other.getVisits())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getIsAMember() != null) {
            _hashCode += getIsAMember().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getMemberType() != null) {
            _hashCode += getMemberType().hashCode();
        }
        if (getVisits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.milan.app.com", "customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.milan.app.com", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAMember");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isAMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.milan.app.com", "visit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
