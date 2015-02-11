/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_conf_port_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_conf_port_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_conf_port_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_conf_port_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSlot_id(int value) {
    pjsuaJNI.pjsua_conf_port_info_slot_id_set(swigCPtr, this, value);
  }

  public int getSlot_id() {
    return pjsuaJNI.pjsua_conf_port_info_slot_id_get(swigCPtr, this);
  }

  public void setName(pj_str_t value) {
    pjsuaJNI.pjsua_conf_port_info_name_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getName() {
    long cPtr = pjsuaJNI.pjsua_conf_port_info_name_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setFormat(SWIGTYPE_p_pjmedia_format value) {
    pjsuaJNI.pjsua_conf_port_info_format_set(swigCPtr, this, SWIGTYPE_p_pjmedia_format.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_format getFormat() {
    return new SWIGTYPE_p_pjmedia_format(pjsuaJNI.pjsua_conf_port_info_format_get(swigCPtr, this), true);
  }

  public void setClock_rate(long value) {
    pjsuaJNI.pjsua_conf_port_info_clock_rate_set(swigCPtr, this, value);
  }

  public long getClock_rate() {
    return pjsuaJNI.pjsua_conf_port_info_clock_rate_get(swigCPtr, this);
  }

  public void setChannel_count(long value) {
    pjsuaJNI.pjsua_conf_port_info_channel_count_set(swigCPtr, this, value);
  }

  public long getChannel_count() {
    return pjsuaJNI.pjsua_conf_port_info_channel_count_get(swigCPtr, this);
  }

  public void setSamples_per_frame(long value) {
    pjsuaJNI.pjsua_conf_port_info_samples_per_frame_set(swigCPtr, this, value);
  }

  public long getSamples_per_frame() {
    return pjsuaJNI.pjsua_conf_port_info_samples_per_frame_get(swigCPtr, this);
  }

  public void setBits_per_sample(long value) {
    pjsuaJNI.pjsua_conf_port_info_bits_per_sample_set(swigCPtr, this, value);
  }

  public long getBits_per_sample() {
    return pjsuaJNI.pjsua_conf_port_info_bits_per_sample_get(swigCPtr, this);
  }

  public void setTx_level_adj(float value) {
    pjsuaJNI.pjsua_conf_port_info_tx_level_adj_set(swigCPtr, this, value);
  }

  public float getTx_level_adj() {
    return pjsuaJNI.pjsua_conf_port_info_tx_level_adj_get(swigCPtr, this);
  }

  public void setRx_level_adj(float value) {
    pjsuaJNI.pjsua_conf_port_info_rx_level_adj_set(swigCPtr, this, value);
  }

  public float getRx_level_adj() {
    return pjsuaJNI.pjsua_conf_port_info_rx_level_adj_get(swigCPtr, this);
  }

  public void setListener_cnt(long value) {
    pjsuaJNI.pjsua_conf_port_info_listener_cnt_set(swigCPtr, this, value);
  }

  public long getListener_cnt() {
    return pjsuaJNI.pjsua_conf_port_info_listener_cnt_get(swigCPtr, this);
  }

  public void setListeners(int[] value) {
    pjsuaJNI.pjsua_conf_port_info_listeners_set(swigCPtr, this, value);
  }

  public int[] getListeners() {
    return pjsuaJNI.pjsua_conf_port_info_listeners_get(swigCPtr, this);
  }

  public pjsua_conf_port_info() {
    this(pjsuaJNI.new_pjsua_conf_port_info(), true);
  }

}
