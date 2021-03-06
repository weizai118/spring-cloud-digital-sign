package com.spring4all.digitalsign.engine.self.cert.core.query;


import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.cert.CertInfo;
import com.spring4all.digitalsign.engine.self.cert.core.user.UserInfo;
import com.spring4all.digitalsign.engine.self.cert.core.user.UserInfo;

import java.io.Serializable;

/**
 * @author liumapp
 * @file QueryCertResult.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class QueryCertResult  implements Serializable {
    private int totalSize;

    private CertInfo[] certInfos;

    private UserInfo[] userInfos;

    public QueryCertResult() {
    }

    public QueryCertResult(
            int totalSize,
            CertInfo[] certInfos,
            UserInfo[] userInfos) {
        this.totalSize = totalSize;
        this.certInfos = certInfos;
        this.userInfos = userInfos;
    }


    /**
     * Gets the totalSize value for this QueryCertResult.
     *
     * @return totalSize
     */
    public int getTotalSize() {
        return totalSize;
    }


    /**
     * Sets the totalSize value for this QueryCertResult.
     *
     * @param totalSize
     */
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }


    /**
     * Gets the certInfos value for this QueryCertResult.
     *
     * @return certInfos
     */
    public CertInfo[] getCertInfos() {
        return certInfos;
    }


    /**
     * Sets the certInfos value for this QueryCertResult.
     *
     * @param certInfos
     */
    public void setCertInfos(CertInfo[] certInfos) {
        this.certInfos = certInfos;
    }

    public CertInfo getCertInfos(int i) {
        return this.certInfos[i];
    }

    public void setCertInfos(int i, CertInfo _value) {
        this.certInfos[i] = _value;
    }


    /**
     * Gets the userInfos value for this QueryCertResult.
     *
     * @return userInfos
     */
    public UserInfo[] getUserInfos() {
        return userInfos;
    }


    /**
     * Sets the userInfos value for this QueryCertResult.
     *
     * @param userInfos
     */
    public void setUserInfos(UserInfo[] userInfos) {
        this.userInfos = userInfos;
    }

    public UserInfo getUserInfos(int i) {
        return this.userInfos[i];
    }

    public void setUserInfos(int i, UserInfo _value) {
        this.userInfos[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof QueryCertResult)) return false;
        QueryCertResult other = (QueryCertResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.totalSize == other.getTotalSize() &&
                ((this.certInfos==null && other.getCertInfos()==null) ||
                        (this.certInfos!=null &&
                                java.util.Arrays.equals(this.certInfos, other.getCertInfos()))) &&
                ((this.userInfos==null && other.getUserInfos()==null) ||
                        (this.userInfos!=null &&
                                java.util.Arrays.equals(this.userInfos, other.getUserInfos())));
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
        _hashCode += getTotalSize();
        if (getCertInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertInfos());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCertInfos(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserInfos());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getUserInfos(), i);
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
            new org.apache.axis.description.TypeDesc(QueryCertResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "queryCertResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "certInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://service.ra.tca.topca.cn/", "userInfo"));
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
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
