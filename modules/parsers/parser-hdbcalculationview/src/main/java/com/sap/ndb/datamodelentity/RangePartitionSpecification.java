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


package com.sap.ndb.datamodelentity;

import com.sap.ndb.datamodelfilter.ValueFilter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Hash partitioning specification
 *
 *
 * <p>Java class for RangePartitionSpecification complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RangePartitionSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelEntity.ecore}PartitionSpecification"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="expression" type="{http://www.sap.com/ndb/DataModelEntity.ecore}PartitionExpression" minOccurs="0"/&gt;
 *         &lt;element name="range" type="{http://www.sap.com/ndb/DataModelFilter.ecore}ValueFilter" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aging" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="withOthers" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangePartitionSpecification", propOrder = {
    "expression",
    "range"
})
public class RangePartitionSpecification
    extends PartitionSpecification {

  protected PartitionExpression expression;
  @XmlElement(required = true)
  protected List<ValueFilter> range;
  @XmlAttribute(name = "aging")
  protected Boolean aging;
  @XmlAttribute(name = "withOthers")
  protected Boolean withOthers;

  /**
   * Gets the value of the expression property.
   *
   * @return possible object is
   * {@link PartitionExpression }
   */
  public PartitionExpression getExpression() {
    return expression;
  }

  /**
   * Sets the value of the expression property.
   *
   * @param value allowed object is
   *              {@link PartitionExpression }
   */
  public void setExpression(PartitionExpression value) {
    this.expression = value;
  }

  /**
   * Gets the value of the range property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the range property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRange().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ValueFilter }
   */
  public List<ValueFilter> getRange() {
    if (range == null) {
      range = new ArrayList<ValueFilter>();
    }
    return this.range;
  }

  /**
   * Gets the value of the aging property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isAging() {
    return aging;
  }

  /**
   * Sets the value of the aging property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setAging(Boolean value) {
    this.aging = value;
  }

  /**
   * Gets the value of the withOthers property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isWithOthers() {
    return withOthers;
  }

  /**
   * Sets the value of the withOthers property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setWithOthers(Boolean value) {
    this.withOthers = value;
  }

}
