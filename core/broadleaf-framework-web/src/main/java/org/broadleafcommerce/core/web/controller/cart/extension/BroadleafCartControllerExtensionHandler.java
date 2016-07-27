/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End User License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 * 
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package org.broadleafcommerce.core.web.controller.cart.extension;

import org.broadleafcommerce.common.extension.ExtensionHandler;
import org.broadleafcommerce.common.extension.ExtensionResultHolder;
import org.broadleafcommerce.common.extension.ExtensionResultStatusType;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.call.AddToCartItem;
import org.broadleafcommerce.core.order.service.call.ConfigurableOrderItemRequest;

/**
 * @author Jon Fleschler (jfleschler)
 */
public interface BroadleafCartControllerExtensionHandler extends ExtensionHandler {

    /**
     *
     *
     * @param configurableOrderItem
     * @return
     */
    public ExtensionResultStatusType modifyOrderItemRequest(ConfigurableOrderItemRequest configurableOrderItem);

    /**
     *
     *
     * @param itemRequest
     * @param orderItem
     * @return
     */
    public ExtensionResultStatusType mergeOrderItemRequest(ConfigurableOrderItemRequest itemRequest, OrderItem orderItem);

    /**
     *
     *
     * @param addToCartItem
     * @return
     */
    public ExtensionResultStatusType validateAddToCartItem(AddToCartItem addToCartItem) throws Exception;
}
