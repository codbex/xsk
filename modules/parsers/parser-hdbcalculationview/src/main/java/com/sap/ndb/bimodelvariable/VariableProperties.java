/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.bimodelvariable;

import com.sap.ndb.bimodelconversion.Parameterization;
import com.sap.ndb.datamodelfilter.DefaultRange;
import com.sap.ndb.datamodeltype.ExpressionLanguage;
import com.sap.ndb.datamodeltype.InternalExternalConversion;
import com.sap.ndb.sqlcoremodeldatatypes.PrimitiveTypeSQL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Common set of variable properties to be used with global and local variables
 *
 *
 * <p>Java class for VariableProperties complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="VariableProperties"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueDomain" type="{http://www.sap.com/ndb/BiModelVariable.ecore}ValueDomain" minOccurs="0"/&gt;
 *         &lt;element name="selection" type="{http://www.sap.com/ndb/BiModelVariable.ecore}Selection" minOccurs="0"/&gt;
 *         &lt;element name="derivationRule" type="{http://www.sap.com/ndb/BiModelVariable.ecore}DerivationRule" minOccurs="0"/&gt;
 *         &lt;element name="defaultExpression" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Expression"/&gt;
 *         &lt;element name="defaultRange" type="{http://www.sap.com/ndb/DataModelFilter.ecore}DefaultRange" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="internalExternalConversion" type="{http://www.sap.com/ndb/DataModelType.ecore}InternalExternalConversion" minOccurs="0"/&gt;
 *         &lt;element name="fuzzySimilarity" type="{http://www.sap.com/ndb/BiModelConversion.ecore}Parameterization"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="defaultExpressionLanguage" type="{http://www.sap.com/ndb/DataModelType.ecore}ExpressionLanguage" /&gt;
 *       &lt;attribute name="mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="datatype" type="{http://www.sap.com/ndb/SQLCoreModelDataTypes.ecore}PrimitiveTypeSQL" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableProperties", propOrder = {
    "valueDomain",
    "selection",
    "derivationRule",
    "defaultExpression",
    "defaultRange",
    "internalExternalConversion",
    "fuzzySimilarity"
})
public class VariableProperties {

  protected ValueDomain valueDomain;
  protected Selection selection;
  protected DerivationRule derivationRule;
  @XmlElement(required = true)
  protected String defaultExpression;
  protected List<DefaultRange> defaultRange;
  protected InternalExternalConversion internalExternalConversion;
  @XmlElement(required = true)
  protected Parameterization fuzzySimilarity;
  @XmlAttribute(name = "defaultExpressionLanguage")
  protected ExpressionLanguage defaultExpressionLanguage;
  @XmlAttribute(name = "mandatory", required = true)
  protected boolean mandatory;
  @XmlAttribute(name = "defaultValue")
  protected String defaultValue;
  @XmlAttribute(name = "datatype")
  protected PrimitiveTypeSQL datatype;
  @XmlAttribute(name = "length")
  protected Short length;
  @XmlAttribute(name = "scale")
  protected Short scale;

  /**
   * Gets the value of the valueDomain property.
   *
   * @return possible object is
   * {@link ValueDomain }
   */
  public ValueDomain getValueDomain() {
    return valueDomain;
  }

  /**
   * Sets the value of the valueDomain property.
   *
   * @param value allowed object is
   *              {@link ValueDomain }
   */
  public void setValueDomain(ValueDomain value) {
    this.valueDomain = value;
  }

  /**
   * Gets the value of the selection property.
   *
   * @return possible object is
   * {@link Selection }
   */
  public Selection getSelection() {
    return selection;
  }

  /**
   * Sets the value of the selection property.
   *
   * @param value allowed object is
   *              {@link Selection }
   */
  public void setSelection(Selection value) {
    this.selection = value;
  }

  /**
   * Gets the value of the derivationRule property.
   *
   * @return possible object is
   * {@link DerivationRule }
   */
  public DerivationRule getDerivationRule() {
    return derivationRule;
  }

  /**
   * Sets the value of the derivationRule property.
   *
   * @param value allowed object is
   *              {@link DerivationRule }
   */
  public void setDerivationRule(DerivationRule value) {
    this.derivationRule = value;
  }

  /**
   * Gets the value of the defaultExpression property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultExpression() {
    return defaultExpression;
  }

  /**
   * Sets the value of the defaultExpression property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultExpression(String value) {
    this.defaultExpression = value;
  }

  /**
   * Gets the value of the defaultRange property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the defaultRange property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getDefaultRange().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link DefaultRange }
   */
  public List<DefaultRange> getDefaultRange() {
    if (defaultRange == null) {
      defaultRange = new ArrayList<DefaultRange>();
    }
    return this.defaultRange;
  }

  /**
   * Gets the value of the internalExternalConversion property.
   *
   * @return possible object is
   * {@link InternalExternalConversion }
   */
  public InternalExternalConversion getInternalExternalConversion() {
    return internalExternalConversion;
  }

  /**
   * Sets the value of the internalExternalConversion property.
   *
   * @param value allowed object is
   *              {@link InternalExternalConversion }
   */
  public void setInternalExternalConversion(InternalExternalConversion value) {
    this.internalExternalConversion = value;
  }

  /**
   * Gets the value of the fuzzySimilarity property.
   *
   * @return possible object is
   * {@link Parameterization }
   */
  public Parameterization getFuzzySimilarity() {
    return fuzzySimilarity;
  }

  /**
   * Sets the value of the fuzzySimilarity property.
   *
   * @param value allowed object is
   *              {@link Parameterization }
   */
  public void setFuzzySimilarity(Parameterization value) {
    this.fuzzySimilarity = value;
  }

  /**
   * Gets the value of the defaultExpressionLanguage property.
   *
   * @return possible object is
   * {@link ExpressionLanguage }
   */
  public ExpressionLanguage getDefaultExpressionLanguage() {
    return defaultExpressionLanguage;
  }

  /**
   * Sets the value of the defaultExpressionLanguage property.
   *
   * @param value allowed object is
   *              {@link ExpressionLanguage }
   */
  public void setDefaultExpressionLanguage(ExpressionLanguage value) {
    this.defaultExpressionLanguage = value;
  }

  /**
   * Gets the value of the mandatory property.
   */
  public boolean isMandatory() {
    return mandatory;
  }

  /**
   * Sets the value of the mandatory property.
   */
  public void setMandatory(boolean value) {
    this.mandatory = value;
  }

  /**
   * Gets the value of the defaultValue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDefaultValue() {
    return defaultValue;
  }

  /**
   * Sets the value of the defaultValue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDefaultValue(String value) {
    this.defaultValue = value;
  }

  /**
   * Gets the value of the datatype property.
   *
   * @return possible object is
   * {@link PrimitiveTypeSQL }
   */
  public PrimitiveTypeSQL getDatatype() {
    return datatype;
  }

  /**
   * Sets the value of the datatype property.
   *
   * @param value allowed object is
   *              {@link PrimitiveTypeSQL }
   */
  public void setDatatype(PrimitiveTypeSQL value) {
    this.datatype = value;
  }

  /**
   * Gets the value of the length property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getLength() {
    return length;
  }

  /**
   * Sets the value of the length property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setLength(Short value) {
    this.length = value;
  }

  /**
   * Gets the value of the scale property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getScale() {
    return scale;
  }

  /**
   * Sets the value of the scale property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setScale(Short value) {
    this.scale = value;
  }

}
