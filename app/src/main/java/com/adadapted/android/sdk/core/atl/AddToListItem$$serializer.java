package com.adadapted.android.sdk.core.atl;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import k7.C0;
import k7.C6151s0;
import k7.H0;
import k7.K;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class AddToListItem$$serializer implements K {
    public static final int $stable = 0;
    public static final AddToListItem$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        AddToListItem$$serializer addToListItem$$serializer = new AddToListItem$$serializer();
        INSTANCE = addToListItem$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.atl.AddToListItem", addToListItem$$serializer, 8);
        c6151s0.n("tracking_id", true);
        c6151s0.n("product_title", true);
        c6151s0.n("product_brand", true);
        c6151s0.n("product_category", true);
        c6151s0.n("product_barcode", true);
        c6151s0.n("product_sku", true);
        c6151s0.n("product_discount", true);
        c6151s0.n("product_image", true);
        descriptor = c6151s0;
    }

    private AddToListItem$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, h02, h02, h02};
    }

    @Override // g7.a
    public AddToListItem deserialize(e eVar) {
        String str;
        int i8;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        int i9 = 0;
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            String z10 = d8.z(descriptor2, 3);
            String z11 = d8.z(descriptor2, 4);
            String z12 = d8.z(descriptor2, 5);
            String z13 = d8.z(descriptor2, 6);
            str = z7;
            str2 = d8.z(descriptor2, 7);
            str3 = z13;
            str4 = z12;
            str5 = z10;
            str6 = z11;
            str7 = z9;
            str8 = z8;
            i8 = 255;
        } else {
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            boolean z14 = true;
            while (z14) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z14 = false;
                        break;
                    case 0:
                        i9 |= 1;
                        str9 = d8.z(descriptor2, 0);
                        continue;
                    case 1:
                        str16 = d8.z(descriptor2, 1);
                        i9 |= 2;
                        continue;
                    case 2:
                        str15 = d8.z(descriptor2, 2);
                        i9 |= 4;
                        break;
                    case 3:
                        str13 = d8.z(descriptor2, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        str14 = d8.z(descriptor2, 4);
                        i9 |= 16;
                        break;
                    case 5:
                        str12 = d8.z(descriptor2, 5);
                        i9 |= 32;
                        break;
                    case 6:
                        str11 = d8.z(descriptor2, 6);
                        i9 |= 64;
                        break;
                    case 7:
                        str10 = d8.z(descriptor2, 7);
                        i9 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            str = str9;
            i8 = i9;
            str2 = str10;
            str3 = str11;
            str4 = str12;
            str5 = str13;
            str6 = str14;
            str7 = str15;
            str8 = str16;
        }
        d8.c(descriptor2);
        return new AddToListItem(i8, str, str8, str7, str5, str6, str4, str3, str2, (C0) null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, AddToListItem addToListItem) {
        r.e(fVar, "encoder");
        r.e(addToListItem, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        AddToListItem.write$Self$advertising_sdk_release(addToListItem, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
