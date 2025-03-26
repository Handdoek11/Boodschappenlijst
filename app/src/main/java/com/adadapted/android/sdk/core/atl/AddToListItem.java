package com.adadapted.android.sdk.core.atl;

import J6.AbstractC0650j;
import J6.r;
import g7.b;
import g7.g;
import i7.f;
import j7.d;
import k7.C0;

@g
/* loaded from: classes.dex */
public final class AddToListItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String brand;
    private final String category;
    private final String productImage;
    private final String productUpc;
    private final String retailerID;
    private final String retailerSku;
    private final String title;
    private final String trackingId;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0650j abstractC0650j) {
            this();
        }

        public final b serializer() {
            return AddToListItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AddToListItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (AbstractC0650j) null);
    }

    public static /* synthetic */ void getBrand$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getProductImage$annotations() {
    }

    public static /* synthetic */ void getProductUpc$annotations() {
    }

    public static /* synthetic */ void getRetailerID$annotations() {
    }

    public static /* synthetic */ void getRetailerSku$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }

    public static /* synthetic */ void getTrackingId$annotations() {
    }

    public static final /* synthetic */ void write$Self$advertising_sdk_release(AddToListItem addToListItem, d dVar, f fVar) {
        if (dVar.e(fVar, 0) || !r.a(addToListItem.trackingId, "")) {
            dVar.g(fVar, 0, addToListItem.trackingId);
        }
        if (dVar.e(fVar, 1) || !r.a(addToListItem.title, "")) {
            dVar.g(fVar, 1, addToListItem.title);
        }
        if (dVar.e(fVar, 2) || !r.a(addToListItem.brand, "")) {
            dVar.g(fVar, 2, addToListItem.brand);
        }
        if (dVar.e(fVar, 3) || !r.a(addToListItem.category, "")) {
            dVar.g(fVar, 3, addToListItem.category);
        }
        if (dVar.e(fVar, 4) || !r.a(addToListItem.productUpc, "")) {
            dVar.g(fVar, 4, addToListItem.productUpc);
        }
        if (dVar.e(fVar, 5) || !r.a(addToListItem.retailerSku, "")) {
            dVar.g(fVar, 5, addToListItem.retailerSku);
        }
        if (dVar.e(fVar, 6) || !r.a(addToListItem.retailerID, "")) {
            dVar.g(fVar, 6, addToListItem.retailerID);
        }
        if (!dVar.e(fVar, 7) && r.a(addToListItem.productImage, "")) {
            return;
        }
        dVar.g(fVar, 7, addToListItem.productImage);
    }

    public final String component1() {
        return this.trackingId;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.brand;
    }

    public final String component4() {
        return this.category;
    }

    public final String component5() {
        return this.productUpc;
    }

    public final String component6() {
        return this.retailerSku;
    }

    public final String component7() {
        return this.retailerID;
    }

    public final String component8() {
        return this.productImage;
    }

    public final AddToListItem copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        r.e(str, "trackingId");
        r.e(str2, "title");
        r.e(str3, "brand");
        r.e(str4, "category");
        r.e(str5, "productUpc");
        r.e(str6, "retailerSku");
        r.e(str7, "retailerID");
        r.e(str8, "productImage");
        return new AddToListItem(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToListItem)) {
            return false;
        }
        AddToListItem addToListItem = (AddToListItem) obj;
        return r.a(this.trackingId, addToListItem.trackingId) && r.a(this.title, addToListItem.title) && r.a(this.brand, addToListItem.brand) && r.a(this.category, addToListItem.category) && r.a(this.productUpc, addToListItem.productUpc) && r.a(this.retailerSku, addToListItem.retailerSku) && r.a(this.retailerID, addToListItem.retailerID) && r.a(this.productImage, addToListItem.productImage);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getProductImage() {
        return this.productImage;
    }

    public final String getProductUpc() {
        return this.productUpc;
    }

    public final String getRetailerID() {
        return this.retailerID;
    }

    public final String getRetailerSku() {
        return this.retailerSku;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    public int hashCode() {
        return (((((((((((((this.trackingId.hashCode() * 31) + this.title.hashCode()) * 31) + this.brand.hashCode()) * 31) + this.category.hashCode()) * 31) + this.productUpc.hashCode()) * 31) + this.retailerSku.hashCode()) * 31) + this.retailerID.hashCode()) * 31) + this.productImage.hashCode();
    }

    public String toString() {
        return "AddToListItem(trackingId=" + this.trackingId + ", title=" + this.title + ", brand=" + this.brand + ", category=" + this.category + ", productUpc=" + this.productUpc + ", retailerSku=" + this.retailerSku + ", retailerID=" + this.retailerID + ", productImage=" + this.productImage + ")";
    }

    public /* synthetic */ AddToListItem(int i8, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C0 c02) {
        if ((i8 & 1) == 0) {
            this.trackingId = "";
        } else {
            this.trackingId = str;
        }
        if ((i8 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i8 & 4) == 0) {
            this.brand = "";
        } else {
            this.brand = str3;
        }
        if ((i8 & 8) == 0) {
            this.category = "";
        } else {
            this.category = str4;
        }
        if ((i8 & 16) == 0) {
            this.productUpc = "";
        } else {
            this.productUpc = str5;
        }
        if ((i8 & 32) == 0) {
            this.retailerSku = "";
        } else {
            this.retailerSku = str6;
        }
        if ((i8 & 64) == 0) {
            this.retailerID = "";
        } else {
            this.retailerID = str7;
        }
        if ((i8 & 128) == 0) {
            this.productImage = "";
        } else {
            this.productImage = str8;
        }
    }

    public AddToListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        r.e(str, "trackingId");
        r.e(str2, "title");
        r.e(str3, "brand");
        r.e(str4, "category");
        r.e(str5, "productUpc");
        r.e(str6, "retailerSku");
        r.e(str7, "retailerID");
        r.e(str8, "productImage");
        this.trackingId = str;
        this.title = str2;
        this.brand = str3;
        this.category = str4;
        this.productUpc = str5;
        this.retailerSku = str6;
        this.retailerID = str7;
        this.productImage = str8;
    }

    public /* synthetic */ AddToListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? "" : str7, (i8 & 128) == 0 ? str8 : "");
    }
}
