package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ExternalMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2ExternalMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ExternalMetricSource,io.kubernetes.client.openapi.models.V2ExternalMetricSourceBuilder>{
  public V2ExternalMetricSourceBuilder() {
    this(false);
  }
  public V2ExternalMetricSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ExternalMetricSource(), validationEnabled);
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricSource(), validationEnabled);
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ExternalMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ExternalMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSource instance) {
    this(instance,false);
  }
  public V2ExternalMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ExternalMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ExternalMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ExternalMetricSource build() {
    V2ExternalMetricSource buildable = new V2ExternalMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ExternalMetricSourceBuilder that = (V2ExternalMetricSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}