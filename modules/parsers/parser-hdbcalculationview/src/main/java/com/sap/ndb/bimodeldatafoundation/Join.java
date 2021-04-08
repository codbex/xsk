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


package com.sap.ndb.bimodeldatafoundation;

import com.sap.ndb.basemodelbase.QualifiedColumnObjectName;
import com.sap.ndb.basemodelbase.TemporalJoinProperties;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Join complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Join"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leftTable" type="{http://www.sap.com/ndb/BaseModelBase.ecore}QualifiedColumnObjectName"/&gt;
 *         &lt;element name="rightTable" type="{http://www.sap.com/ndb/BaseModelBase.ecore}QualifiedColumnObjectName"/&gt;
 *         &lt;element name="leftColumns" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Columns"/&gt;
 *         &lt;element name="rightColumns" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Columns"/&gt;
 *         &lt;element name="properties" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}JoinProperties"/&gt;
 *         &lt;element name="temporalJoinProperties" type="{http://www.sap.com/ndb/BaseModelBase.ecore}TemporalJoinProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="languageColumn" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Join", propOrder = {
    "leftTable",
    "rightTable",
    "leftColumns",
    "rightColumns",
    "properties",
    "temporalJoinProperties"
})
public class Join {

  @XmlElement(required = true)
  protected QualifiedColumnObjectName leftTable;
  @XmlElement(required = true)
  protected QualifiedColumnObjectName rightTable;
  @XmlElement(required = true)
  protected Columns leftColumns;
  @XmlElement(required = true)
  protected Columns rightColumns;
  @XmlElement(required = true)
  protected JoinProperties properties;
  protected TemporalJoinProperties temporalJoinProperties;
  @XmlAttribute(name = "languageColumn")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String languageColumn;

  /**
   * Gets the value of the leftTable property.
   *
   * @return possible object is
   * {@link QualifiedColumnObjectName }
   */
  public QualifiedColumnObjectName getLeftTable() {
    return leftTable;
  }

  /**
   * Sets the value of the leftTable property.
   *
   * @param value allowed object is
   *              {@link QualifiedColumnObjectName }
   */
  public void setLeftTable(QualifiedColumnObjectName value) {
    this.leftTable = value;
  }

  /**
   * Gets the value of the rightTable property.
   *
   * @return possible object is
   * {@link QualifiedColumnObjectName }
   */
  public QualifiedColumnObjectName getRightTable() {
    return rightTable;
  }

  /**
   * Sets the value of the rightTable property.
   *
   * @param value allowed object is
   *              {@link QualifiedColumnObjectName }
   */
  public void setRightTable(QualifiedColumnObjectName value) {
    this.rightTable = value;
  }

  /**
   * Gets the value of the leftColumns property.
   *
   * @return possible object is
   * {@link Columns }
   */
  public Columns getLeftColumns() {
    return leftColumns;
  }

  /**
   * Sets the value of the leftColumns property.
   *
   * @param value allowed object is
   *              {@link Columns }
   */
  public void setLeftColumns(Columns value) {
    this.leftColumns = value;
  }

  /**
   * Gets the value of the rightColumns property.
   *
   * @return possible object is
   * {@link Columns }
   */
  public Columns getRightColumns() {
    return rightColumns;
  }

  /**
   * Sets the value of the rightColumns property.
   *
   * @param value allowed object is
   *              {@link Columns }
   */
  public void setRightColumns(Columns value) {
    this.rightColumns = value;
  }

  /**
   * Gets the value of the properties property.
   *
   * @return possible object is
   * {@link JoinProperties }
   */
  public JoinProperties getProperties() {
    return properties;
  }

  /**
   * Sets the value of the properties property.
   *
   * @param value allowed object is
   *              {@link JoinProperties }
   */
  public void setProperties(JoinProperties value) {
    this.properties = value;
  }

  /**
   * Gets the value of the temporalJoinProperties property.
   *
   * @return possible object is
   * {@link TemporalJoinProperties }
   */
  public TemporalJoinProperties getTemporalJoinProperties() {
    return temporalJoinProperties;
  }

  /**
   * Sets the value of the temporalJoinProperties property.
   *
   * @param value allowed object is
   *              {@link TemporalJoinProperties }
   */
  public void setTemporalJoinProperties(TemporalJoinProperties value) {
    this.temporalJoinProperties = value;
  }

  /**
   * Gets the value of the languageColumn property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLanguageColumn() {
    return languageColumn;
  }

  /**
   * Sets the value of the languageColumn property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLanguageColumn(String value) {
    this.languageColumn = value;
  }

}
