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


package com.sap.ndb.bimodelcalculation;

import com.sap.ndb.sqlcoremodelaccesscontrol.ValueFilterOperator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NonEquiJoinAttribute complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="NonEquiJoinAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="leftColumn" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}ViewAttributeName" /&gt;
 *       &lt;attribute name="leftValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rightColumn" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}ViewAttributeName" /&gt;
 *       &lt;attribute name="rightValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="operator" use="required" type="{http://www.sap.com/ndb/SQLCoreModelAccessControl.ecore}ValueFilterOperator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonEquiJoinAttribute")
public class NonEquiJoinAttribute {

  @XmlAttribute(name = "leftColumn")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String leftColumn;
  @XmlAttribute(name = "leftValue")
  protected String leftValue;
  @XmlAttribute(name = "rightColumn")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String rightColumn;
  @XmlAttribute(name = "rightValue")
  protected String rightValue;
  @XmlAttribute(name = "operator", required = true)
  protected ValueFilterOperator operator;

  /**
   * Gets the value of the leftColumn property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLeftColumn() {
    return leftColumn;
  }

  /**
   * Sets the value of the leftColumn property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLeftColumn(String value) {
    this.leftColumn = value;
  }

  /**
   * Gets the value of the leftValue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLeftValue() {
    return leftValue;
  }

  /**
   * Sets the value of the leftValue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLeftValue(String value) {
    this.leftValue = value;
  }

  /**
   * Gets the value of the rightColumn property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getRightColumn() {
    return rightColumn;
  }

  /**
   * Sets the value of the rightColumn property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setRightColumn(String value) {
    this.rightColumn = value;
  }

  /**
   * Gets the value of the rightValue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getRightValue() {
    return rightValue;
  }

  /**
   * Sets the value of the rightValue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setRightValue(String value) {
    this.rightValue = value;
  }

  /**
   * Gets the value of the operator property.
   *
   * @return possible object is
   * {@link ValueFilterOperator }
   */
  public ValueFilterOperator getOperator() {
    return operator;
  }

  /**
   * Sets the value of the operator property.
   *
   * @param value allowed object is
   *              {@link ValueFilterOperator }
   */
  public void setOperator(ValueFilterOperator value) {
    this.operator = value;
  }

}
