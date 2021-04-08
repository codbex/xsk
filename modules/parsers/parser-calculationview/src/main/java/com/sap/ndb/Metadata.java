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
// Generated on: 2020.11.27 at 08:01:21 PM EET 
//


package com.sap.ndb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="changedAt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="createdAt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "metadata")
public class Metadata {

  @XmlValue
  protected String value;
  @XmlAttribute(name = "changedAt")
  protected String changedAt;
  @XmlAttribute(name = "createdAt")
  protected String createdAt;

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Gets the value of the changedAt property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getChangedAt() {
    return changedAt;
  }

  /**
   * Sets the value of the changedAt property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setChangedAt(String value) {
    this.changedAt = value;
  }

  /**
   * Gets the value of the createdAt property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the value of the createdAt property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCreatedAt(String value) {
    this.createdAt = value;
  }

}
