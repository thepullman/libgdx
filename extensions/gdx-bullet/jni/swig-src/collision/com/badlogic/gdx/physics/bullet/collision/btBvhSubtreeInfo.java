/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btBvhSubtreeInfo extends BulletBase {
	private long swigCPtr;
	
	protected btBvhSubtreeInfo(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btBvhSubtreeInfo, normally you should not need this constructor it's intended for low-level usage. */ 
	public btBvhSubtreeInfo(long cPtr, boolean cMemoryOwn) {
		this("btBvhSubtreeInfo", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btBvhSubtreeInfo obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btBvhSubtreeInfo(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return CollisionJNI.btBvhSubtreeInfo_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    CollisionJNI.btBvhSubtreeInfo_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return CollisionJNI.btBvhSubtreeInfo_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    CollisionJNI.btBvhSubtreeInfo_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return CollisionJNI.btBvhSubtreeInfo_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    CollisionJNI.btBvhSubtreeInfo_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return CollisionJNI.btBvhSubtreeInfo_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    CollisionJNI.btBvhSubtreeInfo_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public void setQuantizedAabbMin(int[] value) {
    CollisionJNI.btBvhSubtreeInfo_quantizedAabbMin_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMin() {
    return CollisionJNI.btBvhSubtreeInfo_quantizedAabbMin_get(swigCPtr, this);
  }

  public void setQuantizedAabbMax(int[] value) {
    CollisionJNI.btBvhSubtreeInfo_quantizedAabbMax_set(swigCPtr, this, value);
  }

  public int[] getQuantizedAabbMax() {
    return CollisionJNI.btBvhSubtreeInfo_quantizedAabbMax_get(swigCPtr, this);
  }

  public void setRootNodeIndex(int value) {
    CollisionJNI.btBvhSubtreeInfo_rootNodeIndex_set(swigCPtr, this, value);
  }

  public int getRootNodeIndex() {
    return CollisionJNI.btBvhSubtreeInfo_rootNodeIndex_get(swigCPtr, this);
  }

  public void setSubtreeSize(int value) {
    CollisionJNI.btBvhSubtreeInfo_subtreeSize_set(swigCPtr, this, value);
  }

  public int getSubtreeSize() {
    return CollisionJNI.btBvhSubtreeInfo_subtreeSize_get(swigCPtr, this);
  }

  public void setPadding(int[] value) {
    CollisionJNI.btBvhSubtreeInfo_padding_set(swigCPtr, this, value);
  }

  public int[] getPadding() {
    return CollisionJNI.btBvhSubtreeInfo_padding_get(swigCPtr, this);
  }

  public btBvhSubtreeInfo() {
    this(CollisionJNI.new_btBvhSubtreeInfo(), true);
  }

  public void setAabbFromQuantizeNode(btQuantizedBvhNode quantizedNode) {
    CollisionJNI.btBvhSubtreeInfo_setAabbFromQuantizeNode(swigCPtr, this, btQuantizedBvhNode.getCPtr(quantizedNode), quantizedNode);
  }

}
