/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_vid_preview_param {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_vid_preview_param(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_vid_preview_param obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_vid_preview_param(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRend_id(SWIGTYPE_p_pjmedia_vid_dev_index value) {
    pjsuaJNI.pjsua_vid_preview_param_rend_id_set(swigCPtr, this, SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_vid_dev_index getRend_id() {
    return new SWIGTYPE_p_pjmedia_vid_dev_index(pjsuaJNI.pjsua_vid_preview_param_rend_id_get(swigCPtr, this), true);
  }

  public void setShow(int value) {
    pjsuaJNI.pjsua_vid_preview_param_show_set(swigCPtr, this, value);
  }

  public int getShow() {
    return pjsuaJNI.pjsua_vid_preview_param_show_get(swigCPtr, this);
  }

  public void setWnd_flags(long value) {
    pjsuaJNI.pjsua_vid_preview_param_wnd_flags_set(swigCPtr, this, value);
  }

  public long getWnd_flags() {
    return pjsuaJNI.pjsua_vid_preview_param_wnd_flags_get(swigCPtr, this);
  }

  public void setFormat(SWIGTYPE_p_pjmedia_format value) {
    pjsuaJNI.pjsua_vid_preview_param_format_set(swigCPtr, this, SWIGTYPE_p_pjmedia_format.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_format getFormat() {
    return new SWIGTYPE_p_pjmedia_format(pjsuaJNI.pjsua_vid_preview_param_format_get(swigCPtr, this), true);
  }

  public pjsua_vid_preview_param() {
    this(pjsuaJNI.new_pjsua_vid_preview_param(), true);
  }

}
