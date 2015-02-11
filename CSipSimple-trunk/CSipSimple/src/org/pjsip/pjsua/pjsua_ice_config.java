/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_ice_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_ice_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_ice_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_ice_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEnable_ice(int value) {
    pjsuaJNI.pjsua_ice_config_enable_ice_set(swigCPtr, this, value);
  }

  public int getEnable_ice() {
    return pjsuaJNI.pjsua_ice_config_enable_ice_get(swigCPtr, this);
  }

  public void setIce_max_host_cands(int value) {
    pjsuaJNI.pjsua_ice_config_ice_max_host_cands_set(swigCPtr, this, value);
  }

  public int getIce_max_host_cands() {
    return pjsuaJNI.pjsua_ice_config_ice_max_host_cands_get(swigCPtr, this);
  }

  public void setIce_opt(pj_ice_sess_options value) {
    pjsuaJNI.pjsua_ice_config_ice_opt_set(swigCPtr, this, pj_ice_sess_options.getCPtr(value), value);
  }

  public pj_ice_sess_options getIce_opt() {
    long cPtr = pjsuaJNI.pjsua_ice_config_ice_opt_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_ice_sess_options(cPtr, false);
  }

  public void setIce_no_rtcp(int value) {
    pjsuaJNI.pjsua_ice_config_ice_no_rtcp_set(swigCPtr, this, value);
  }

  public int getIce_no_rtcp() {
    return pjsuaJNI.pjsua_ice_config_ice_no_rtcp_get(swigCPtr, this);
  }

  public void setIce_always_update(int value) {
    pjsuaJNI.pjsua_ice_config_ice_always_update_set(swigCPtr, this, value);
  }

  public int getIce_always_update() {
    return pjsuaJNI.pjsua_ice_config_ice_always_update_get(swigCPtr, this);
  }

  public pjsua_ice_config() {
    this(pjsuaJNI.new_pjsua_ice_config(), true);
  }

}
