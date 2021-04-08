/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.hdbDD.impl;

import com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive;
import com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Primitive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl#isKey <em>Key</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl#getFieldLength <em>Field Length</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl#getFieldPredefinedType <em>Field Predefined Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldPrimitiveImpl extends FieldImpl implements FieldPrimitive {

  /**
   * The default value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #isKey()
   */
  protected static final boolean KEY_EDEFAULT = false;
  /**
   * The default value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldType()
   */
  protected static final String FIELD_TYPE_EDEFAULT = null;
  /**
   * The default value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldLength()
   */
  protected static final int FIELD_LENGTH_EDEFAULT = 0;
  /**
   * The default value of the '{@link #getFieldPredefinedType() <em>Field Predefined Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldPredefinedType()
   */
  protected static final String FIELD_PREDEFINED_TYPE_EDEFAULT = null;
  /**
   * The cached value of the '{@link #isKey() <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #isKey()
   */
  protected boolean key = KEY_EDEFAULT;
  /**
   * The cached value of the '{@link #getFieldType() <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldType()
   */
  protected String fieldType = FIELD_TYPE_EDEFAULT;
  /**
   * The cached value of the '{@link #getFieldLength() <em>Field Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldLength()
   */
  protected int fieldLength = FIELD_LENGTH_EDEFAULT;
  /**
   * The cached value of the '{@link #getFieldPredefinedType() <em>Field Predefined Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   * @ordered
   * @see #getFieldPredefinedType()
   */
  protected String fieldPredefinedType = FIELD_PREDEFINED_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  protected FieldPrimitiveImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return HdbDDPackage.Literals.FIELD_PRIMITIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public boolean isKey() {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void setKey(boolean newKey) {
    boolean oldKey = key;
    key = newKey;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_PRIMITIVE__KEY, oldKey, key));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public String getFieldType() {
    return fieldType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void setFieldType(String newFieldType) {
    String oldFieldType = fieldType;
    fieldType = newFieldType;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_PRIMITIVE__FIELD_TYPE, oldFieldType, fieldType));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public int getFieldLength() {
    return fieldLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void setFieldLength(int newFieldLength) {
    int oldFieldLength = fieldLength;
    fieldLength = newFieldLength;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_PRIMITIVE__FIELD_LENGTH, oldFieldLength, fieldLength));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public String getFieldPredefinedType() {
    return fieldPredefinedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  public void setFieldPredefinedType(String newFieldPredefinedType) {
    String oldFieldPredefinedType = fieldPredefinedType;
    fieldPredefinedType = newFieldPredefinedType;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE, oldFieldPredefinedType,
          fieldPredefinedType));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case HdbDDPackage.FIELD_PRIMITIVE__KEY:
        return isKey();
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_TYPE:
        return getFieldType();
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_LENGTH:
        return getFieldLength();
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE:
        return getFieldPredefinedType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case HdbDDPackage.FIELD_PRIMITIVE__KEY:
        setKey((Boolean) newValue);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_TYPE:
        setFieldType((String) newValue);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_LENGTH:
        setFieldLength((Integer) newValue);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE:
        setFieldPredefinedType((String) newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case HdbDDPackage.FIELD_PRIMITIVE__KEY:
        setKey(KEY_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_TYPE:
        setFieldType(FIELD_TYPE_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_LENGTH:
        setFieldLength(FIELD_LENGTH_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE:
        setFieldPredefinedType(FIELD_PREDEFINED_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case HdbDDPackage.FIELD_PRIMITIVE__KEY:
        return key != KEY_EDEFAULT;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_TYPE:
        return FIELD_TYPE_EDEFAULT == null ? fieldType != null : !FIELD_TYPE_EDEFAULT.equals(fieldType);
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_LENGTH:
        return fieldLength != FIELD_LENGTH_EDEFAULT;
      case HdbDDPackage.FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE:
        return FIELD_PREDEFINED_TYPE_EDEFAULT == null ? fieldPredefinedType != null
            : !FIELD_PREDEFINED_TYPE_EDEFAULT.equals(fieldPredefinedType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   *
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (key: ");
    result.append(key);
    result.append(", fieldType: ");
    result.append(fieldType);
    result.append(", fieldLength: ");
    result.append(fieldLength);
    result.append(", fieldPredefinedType: ");
    result.append(fieldPredefinedType);
    result.append(')');
    return result.toString();
  }

} //FieldPrimitiveImpl
