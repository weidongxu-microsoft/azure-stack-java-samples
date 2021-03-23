// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrderState. */
public final class OrderState extends ExpandableStringEnum<OrderState> {
    /** Static value Untracked for OrderState. */
    public static final OrderState UNTRACKED = fromString("Untracked");

    /** Static value AwaitingFulfilment for OrderState. */
    public static final OrderState AWAITING_FULFILMENT = fromString("AwaitingFulfilment");

    /** Static value AwaitingPreparation for OrderState. */
    public static final OrderState AWAITING_PREPARATION = fromString("AwaitingPreparation");

    /** Static value AwaitingShipment for OrderState. */
    public static final OrderState AWAITING_SHIPMENT = fromString("AwaitingShipment");

    /** Static value Shipped for OrderState. */
    public static final OrderState SHIPPED = fromString("Shipped");

    /** Static value Arriving for OrderState. */
    public static final OrderState ARRIVING = fromString("Arriving");

    /** Static value Delivered for OrderState. */
    public static final OrderState DELIVERED = fromString("Delivered");

    /** Static value ReplacementRequested for OrderState. */
    public static final OrderState REPLACEMENT_REQUESTED = fromString("ReplacementRequested");

    /** Static value LostDevice for OrderState. */
    public static final OrderState LOST_DEVICE = fromString("LostDevice");

    /** Static value Declined for OrderState. */
    public static final OrderState DECLINED = fromString("Declined");

    /** Static value ReturnInitiated for OrderState. */
    public static final OrderState RETURN_INITIATED = fromString("ReturnInitiated");

    /** Static value AwaitingReturnShipment for OrderState. */
    public static final OrderState AWAITING_RETURN_SHIPMENT = fromString("AwaitingReturnShipment");

    /** Static value ShippedBack for OrderState. */
    public static final OrderState SHIPPED_BACK = fromString("ShippedBack");

    /** Static value CollectedAtMicrosoft for OrderState. */
    public static final OrderState COLLECTED_AT_MICROSOFT = fromString("CollectedAtMicrosoft");

    /**
     * Creates or finds a OrderState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrderState.
     */
    @JsonCreator
    public static OrderState fromString(String name) {
        return fromString(name, OrderState.class);
    }

    /** @return known OrderState values. */
    public static Collection<OrderState> values() {
        return values(OrderState.class);
    }
}