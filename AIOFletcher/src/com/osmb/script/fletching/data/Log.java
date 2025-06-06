package com.osmb.script.fletching.data;

import com.osmb.api.item.ItemID;

public enum Log implements ItemIdentifier {
    LOGS(ItemID.LOGS, new Product[]{
            new Product(ItemID.SHORTBOW_U, 1),
            new Product(ItemID.LONGBOW_U, 1),
            new Product(ItemID.ARROW_SHAFT, 1)
    }),
    OAK_LOGS(ItemID.OAK_LOGS, new Product[]{
            new Product(ItemID.OAK_SHORTBOW_U, 1),
            new Product(ItemID.OAK_LONGBOW_U, 1),
            new Product(ItemID.OAK_SHIELD, 2),
            new Product(ItemID.ARROW_SHAFT, 1)
    }),
    WILLOW_LOGS(ItemID.WILLOW_LOGS, new Product[]{
            new Product(ItemID.WILLOW_SHORTBOW_U, 1),
            new Product(ItemID.WILLOW_LONGBOW_U, 1),
            new Product(ItemID.WILLOW_SHIELD, 2),
            new Product(ItemID.ARROW_SHAFT, 1)
    }),
    MAPLE_LOGS(ItemID.MAPLE_LOGS, new Product[]{
            new Product(ItemID.MAPLE_SHORTBOW_U, 1),
            new Product(ItemID.MAPLE_LONGBOW_U, 1),
            new Product(ItemID.MAPLE_SHIELD, 2),
            new Product(ItemID.ARROW_SHAFT, 1)
    }),
    YEW_LOGS(ItemID.YEW_LOGS, new Product[]{
            new Product(ItemID.YEW_SHORTBOW_U, 1),
            new Product(ItemID.YEW_LONGBOW_U, 1),
            new Product(ItemID.YEW_SHIELD, 2),
            new Product(ItemID.ARROW_SHAFT, 1)
    }),
    MAGIC_LOGS(ItemID.MAGIC_LOGS, new Product[]{
            new Product(ItemID.MAGIC_SHORTBOW_U, 1),
            new Product(ItemID.MAGIC_LONGBOW_U, 1),
            new Product(ItemID.MAGIC_SHIELD, 2),
            new Product(ItemID.ARROW_SHAFT, 1)
    });

    private final int itemId;
    private final Product[] products;

    Log(int itemId, Product[] products) {
        this.itemId = itemId;
        this.products = products;
    }

    public static int[] getItemIDs() {
        int[] itemIds = new int[Log.values().length];
        for (int i = 0; i < itemIds.length; i++) {
            itemIds[i] = Log.values()[i].getItemID();
        }
        return itemIds;
    }

    public static Log getLog(int itemId) {
        for (Log log : Log.values()) {
            if (log.itemId == itemId) {
                return log;
            }
        }
        return null;
    }

    public Product getProduct(int itemId) {
        for (Product product : products) {
            if(itemId == product.getItemID()) {
                return product;
            }
        }
        return null;
    }

    public Integer[] getProductIDs() {
        Integer[] productIDs = new Integer[products.length];
        for (int i = 0; i < productIDs.length; i++) {
            productIDs[i] = products[i].getItemID();
        }
        return productIDs;
    }

    public Product[] getProducts() {
        return products;
    }

    @Override
    public int getItemID() {
        return itemId;
    }
}
