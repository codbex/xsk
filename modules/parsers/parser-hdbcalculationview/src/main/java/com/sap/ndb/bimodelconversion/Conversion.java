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


package com.sap.ndb.bimodelconversion;

import com.sap.ndb.basemodelbase.CurrencyConversionTables;
import com.sap.ndb.basemodelbase.ErrorHandling;
import com.sap.ndb.basemodelbase.SchemaMappingBasedObject;
import com.sap.ndb.basemodelbase.UnitConversionTables;
import com.sap.ndb.bimodeldatafoundation.SimpleDataType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * General base for conversions
 *
 *
 * <p>Java class for Conversion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Conversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="client" type="{http://www.sap.com/ndb/BiModelConversion.ecore}Parameterization" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="schema" type="{http://www.sap.com/ndb/BaseModelBase.ecore}SchemaMappingBasedObject" minOccurs="0"/&gt;
 *           &lt;element name="currencyConversionTables" type="{http://www.sap.com/ndb/BaseModelBase.ecore}CurrencyConversionTables" minOccurs="0"/&gt;
 *           &lt;element name="unitConversionTables" type="{http://www.sap.com/ndb/BaseModelBase.ecore}UnitConversionTables" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="outputDataType" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}SimpleDataType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="errorHandling" type="{http://www.sap.com/ndb/BaseModelBase.ecore}ErrorHandling" /&gt;
 *       &lt;attribute name="generateOutputUnitCurrencyAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="outputUnitCurrencyAttributeName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conversion", propOrder = {
    "client",
    "schema",
    "currencyConversionTables",
    "unitConversionTables",
    "outputDataType"
})
@XmlSeeAlso({
    CurrencyConversion.class,
    UnitConversion.class
})
public abstract class Conversion {

  protected Parameterization client;
  protected SchemaMappingBasedObject schema;
  protected CurrencyConversionTables currencyConversionTables;
  protected UnitConversionTables unitConversionTables;
  @XmlElement(required = true)
  protected SimpleDataType outputDataType;
  @XmlAttribute(name = "errorHandling")
  protected ErrorHandling errorHandling;
  @XmlAttribute(name = "generateOutputUnitCurrencyAttribute")
  protected Boolean generateOutputUnitCurrencyAttribute;
  @XmlAttribute(name = "outputUnitCurrencyAttributeName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String outputUnitCurrencyAttributeName;

  /**
   * Gets the value of the client property.
   *
   * @return possible object is
   * {@link Parameterization }
   */
  public Parameterization getClient() {
    return client;
  }

  /**
   * Sets the value of the client property.
   *
   * @param value allowed object is
   *              {@link Parameterization }
   */
  public void setClient(Parameterization value) {
    this.client = value;
  }

  /**
   * Gets the value of the schema property.
   *
   * @return possible object is
   * {@link SchemaMappingBasedObject }
   */
  public SchemaMappingBasedObject getSchema() {
    return schema;
  }

  /**
   * Sets the value of the schema property.
   *
   * @param value allowed object is
   *              {@link SchemaMappingBasedObject }
   */
  public void setSchema(SchemaMappingBasedObject value) {
    this.schema = value;
  }

  /**
   * Gets the value of the currencyConversionTables property.
   *
   * @return possible object is
   * {@link CurrencyConversionTables }
   */
  public CurrencyConversionTables getCurrencyConversionTables() {
    return currencyConversionTables;
  }

  /**
   * Sets the value of the currencyConversionTables property.
   *
   * @param value allowed object is
   *              {@link CurrencyConversionTables }
   */
  public void setCurrencyConversionTables(CurrencyConversionTables value) {
    this.currencyConversionTables = value;
  }

  /**
   * Gets the value of the unitConversionTables property.
   *
   * @return possible object is
   * {@link UnitConversionTables }
   */
  public UnitConversionTables getUnitConversionTables() {
    return unitConversionTables;
  }

  /**
   * Sets the value of the unitConversionTables property.
   *
   * @param value allowed object is
   *              {@link UnitConversionTables }
   */
  public void setUnitConversionTables(UnitConversionTables value) {
    this.unitConversionTables = value;
  }

  /**
   * Gets the value of the outputDataType property.
   *
   * @return possible object is
   * {@link SimpleDataType }
   */
  public SimpleDataType getOutputDataType() {
    return outputDataType;
  }

  /**
   * Sets the value of the outputDataType property.
   *
   * @param value allowed object is
   *              {@link SimpleDataType }
   */
  public void setOutputDataType(SimpleDataType value) {
    this.outputDataType = value;
  }

  /**
   * Gets the value of the errorHandling property.
   *
   * @return possible object is
   * {@link ErrorHandling }
   */
  public ErrorHandling getErrorHandling() {
    return errorHandling;
  }

  /**
   * Sets the value of the errorHandling property.
   *
   * @param value allowed object is
   *              {@link ErrorHandling }
   */
  public void setErrorHandling(ErrorHandling value) {
    this.errorHandling = value;
  }

  /**
   * Gets the value of the generateOutputUnitCurrencyAttribute property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isGenerateOutputUnitCurrencyAttribute() {
    return generateOutputUnitCurrencyAttribute;
  }

  /**
   * Sets the value of the generateOutputUnitCurrencyAttribute property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setGenerateOutputUnitCurrencyAttribute(Boolean value) {
    this.generateOutputUnitCurrencyAttribute = value;
  }

  /**
   * Gets the value of the outputUnitCurrencyAttributeName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOutputUnitCurrencyAttributeName() {
    return outputUnitCurrencyAttributeName;
  }

  /**
   * Sets the value of the outputUnitCurrencyAttributeName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOutputUnitCurrencyAttributeName(String value) {
    this.outputUnitCurrencyAttributeName = value;
  }

}
