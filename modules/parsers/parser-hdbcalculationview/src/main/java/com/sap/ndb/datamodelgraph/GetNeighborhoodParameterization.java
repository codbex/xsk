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


package com.sap.ndb.datamodelgraph;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Parameterization for the graph action GET_NEIGHBORHOOD.
 * The GET_NEIGHBORHOOD graph action retrieves the neighboring vertices within the given radius from the given start vertices.
 * Output columns:
 * -key of the vertices table
 * -DEPTH
 *
 *
 * <p>Java class for GetNeighborhoodParameterization complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetNeighborhoodParameterization"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelGraph.ecore}GraphActionParameterization"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="startVertices" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="startVerticesParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="direction" type="{http://www.sap.com/ndb/DataModelGraph.ecore}Direction" minOccurs="0"/&gt;
 *           &lt;element name="directionParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="minDepth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="minDepthParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="maxDepth" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="maxDepthParameter" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="vertexFilter" type="{http://www.sap.com/ndb/DataModelType.ecore}ExpressionString" minOccurs="0"/&gt;
 *         &lt;element name="edgeFilter" type="{http://www.sap.com/ndb/DataModelType.ecore}ExpressionString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNeighborhoodParameterization", propOrder = {
    "startVertices",
    "startVerticesParameter",
    "direction",
    "directionParameter",
    "minDepth",
    "minDepthParameter",
    "maxDepth",
    "maxDepthParameter",
    "vertexFilter",
    "edgeFilter"
})
public class GetNeighborhoodParameterization
    extends GraphActionParameterization {

  protected String startVertices;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String startVerticesParameter;
  @XmlSchemaType(name = "NMTOKEN")
  protected Direction direction;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String directionParameter;
  protected BigInteger minDepth;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String minDepthParameter;
  protected BigInteger maxDepth;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String maxDepthParameter;
  protected String vertexFilter;
  protected String edgeFilter;

  /**
   * Gets the value of the startVertices property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStartVertices() {
    return startVertices;
  }

  /**
   * Sets the value of the startVertices property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStartVertices(String value) {
    this.startVertices = value;
  }

  /**
   * Gets the value of the startVerticesParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStartVerticesParameter() {
    return startVerticesParameter;
  }

  /**
   * Sets the value of the startVerticesParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStartVerticesParameter(String value) {
    this.startVerticesParameter = value;
  }

  /**
   * Gets the value of the direction property.
   *
   * @return possible object is
   * {@link Direction }
   */
  public Direction getDirection() {
    return direction;
  }

  /**
   * Sets the value of the direction property.
   *
   * @param value allowed object is
   *              {@link Direction }
   */
  public void setDirection(Direction value) {
    this.direction = value;
  }

  /**
   * Gets the value of the directionParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getDirectionParameter() {
    return directionParameter;
  }

  /**
   * Sets the value of the directionParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setDirectionParameter(String value) {
    this.directionParameter = value;
  }

  /**
   * Gets the value of the minDepth property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMinDepth() {
    return minDepth;
  }

  /**
   * Sets the value of the minDepth property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMinDepth(BigInteger value) {
    this.minDepth = value;
  }

  /**
   * Gets the value of the minDepthParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getMinDepthParameter() {
    return minDepthParameter;
  }

  /**
   * Sets the value of the minDepthParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setMinDepthParameter(String value) {
    this.minDepthParameter = value;
  }

  /**
   * Gets the value of the maxDepth property.
   *
   * @return possible object is
   * {@link BigInteger }
   */
  public BigInteger getMaxDepth() {
    return maxDepth;
  }

  /**
   * Sets the value of the maxDepth property.
   *
   * @param value allowed object is
   *              {@link BigInteger }
   */
  public void setMaxDepth(BigInteger value) {
    this.maxDepth = value;
  }

  /**
   * Gets the value of the maxDepthParameter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getMaxDepthParameter() {
    return maxDepthParameter;
  }

  /**
   * Sets the value of the maxDepthParameter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setMaxDepthParameter(String value) {
    this.maxDepthParameter = value;
  }

  /**
   * Gets the value of the vertexFilter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getVertexFilter() {
    return vertexFilter;
  }

  /**
   * Sets the value of the vertexFilter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setVertexFilter(String value) {
    this.vertexFilter = value;
  }

  /**
   * Gets the value of the edgeFilter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getEdgeFilter() {
    return edgeFilter;
  }

  /**
   * Sets the value of the edgeFilter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setEdgeFilter(String value) {
    this.edgeFilter = value;
  }

}
