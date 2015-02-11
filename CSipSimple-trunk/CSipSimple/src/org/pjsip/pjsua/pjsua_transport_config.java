/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_transport_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_transport_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_transport_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_transport_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPort(long value) {
    pjsuaJNI.pjsua_transport_config_port_set(swigCPtr, this, value);
  }

  public long getPort() {
    return pjsuaJNI.pjsua_transport_config_port_get(swigCPtr, this);
  }

  public void setPort_range(long value) {
    pjsuaJNI.pjsua_transport_config_port_range_set(swigCPtr, this, value);
  }

  public long getPort_range() {
    return pjsuaJNI.pjsua_transport_config_port_range_get(swigCPtr, this);
  }

  public void setPublic_addr(pj_str_t value) {
    pjsuaJNI.pjsua_transport_config_public_addr_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getPublic_addr() {
    long cPtr = pjsuaJNI.pjsua_transport_config_public_addr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setBound_addr(pj_str_t value) {
    pjsuaJNI.pjsua_transport_config_bound_addr_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getBound_addr() {
    long cPtr = pjsuaJNI.pjsua_transport_config_bound_addr_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setTls_setting(pjsip_tls_setting value) {
    pjsuaJNI.pjsua_transport_config_tls_setting_set(swigCPtr, this, pjsip_tls_setting.getCPtr(value), value);
  }

  public pjsip_tls_setting getTls_setting() {
    long cPtr = pjsuaJNI.pjsua_transport_config_tls_setting_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pjsip_tls_setting(cPtr, false);
  }

  public void setQos_type(pj_qos_type value) {
    pjsuaJNI.pjsua_transport_config_qos_type_set(swigCPtr, this, value.swigValue());
  }

  public pj_qos_type getQos_type() {
    return pj_qos_type.swigToEnum(pjsuaJNI.pjsua_transport_config_qos_type_get(swigCPtr, this));
  }

  public void setQos_params(pj_qos_params value) {
    pjsuaJNI.pjsua_transport_config_qos_params_set(swigCPtr, this, pj_qos_params.getCPtr(value), value);
  }

  public pj_qos_params getQos_params() {
    long cPtr = pjsuaJNI.pjsua_transport_config_qos_params_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_qos_params(cPtr, false);
  }

  public void setSockopt_params(SWIGTYPE_p_pj_sockopt_params value) {
    pjsuaJNI.pjsua_transport_config_sockopt_params_set(swigCPtr, this, SWIGTYPE_p_pj_sockopt_params.getCPtr(value));
  }

  public SWIGTYPE_p_pj_sockopt_params getSockopt_params() {
    return new SWIGTYPE_p_pj_sockopt_params(pjsuaJNI.pjsua_transport_config_sockopt_params_get(swigCPtr, this), true);
  }

  public pjsua_transport_config() {
    this(pjsuaJNI.new_pjsua_transport_config(), true);
  }

}
