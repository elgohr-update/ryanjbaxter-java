package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2MetricValueStatusBuilder extends io.kubernetes.client.openapi.models.V2MetricValueStatusFluentImpl<io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2MetricValueStatus,io.kubernetes.client.openapi.models.V2MetricValueStatusBuilder>{
  public V2MetricValueStatusBuilder() {
    this(false);
  }
  public V2MetricValueStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2MetricValueStatus(), validationEnabled);
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2MetricValueStatus(), validationEnabled);
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricValueStatus instance) {
    this(fluent, instance, false);
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2MetricValueStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatus instance) {
    this(instance,false);
  }
  public V2MetricValueStatusBuilder(io.kubernetes.client.openapi.models.V2MetricValueStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2MetricValueStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2MetricValueStatus build() {
    V2MetricValueStatus buildable = new V2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2MetricValueStatusBuilder that = (V2MetricValueStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}