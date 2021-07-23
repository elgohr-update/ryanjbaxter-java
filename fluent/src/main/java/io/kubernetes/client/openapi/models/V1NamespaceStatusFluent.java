package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.lang.Boolean;

public interface V1NamespaceStatusFluent<A extends io.kubernetes.client.openapi.models.V1NamespaceStatusFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public A addToConditions(int index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
    public A setToConditions(int index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
    public A addToConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
    public A addAllToConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
    public A removeFromConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... items);
    public A removeAllFromConditions(java.util.Collection<io.kubernetes.client.openapi.models.V1NamespaceCondition> items);
    public A removeMatchingFromConditions(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildConditions instead.
     * @return The buildable object.
     */
        public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> getConditions();
    public java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> buildConditions();
    public io.kubernetes.client.openapi.models.V1NamespaceCondition buildCondition(int index);
    public io.kubernetes.client.openapi.models.V1NamespaceCondition buildFirstCondition();
    public io.kubernetes.client.openapi.models.V1NamespaceCondition buildLastCondition();
    public io.kubernetes.client.openapi.models.V1NamespaceCondition buildMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
    public java.lang.Boolean hasMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
    public A withConditions(java.util.List<io.kubernetes.client.openapi.models.V1NamespaceCondition> conditions);
    public A withConditions(io.kubernetes.client.openapi.models.V1NamespaceCondition... conditions);
    public java.lang.Boolean hasConditions();
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> addNewCondition();
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> addNewConditionLike(io.kubernetes.client.openapi.models.V1NamespaceCondition item);
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> setNewConditionLike(int index,io.kubernetes.client.openapi.models.V1NamespaceCondition item);
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editCondition(int index);
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editFirstCondition();
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editLastCondition();
    public io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<A> editMatchingCondition(java.util.function.Predicate<io.kubernetes.client.openapi.models.V1NamespaceConditionBuilder> predicate);
    public java.lang.String getPhase();
    public A withPhase(java.lang.String phase);
    public java.lang.Boolean hasPhase();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPhase instead.
     */
        public A withNewPhase(java.lang.String original);
    public interface ConditionsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1NamespaceConditionFluent<io.kubernetes.client.openapi.models.V1NamespaceStatusFluent.ConditionsNested<N>> {

            public N and();
            public N endCondition();    }


}