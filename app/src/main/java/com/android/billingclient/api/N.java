package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.C1057e;
import com.google.android.gms.internal.play_billing.AbstractC5103e1;
import java.util.ArrayList;

/* loaded from: classes.dex */
abstract class N {
    static M a(Bundle bundle, String str, String str2) {
        C1057e c1057e = H.f12306k;
        if (bundle == null) {
            AbstractC5103e1.j("BillingClient", String.format("%s got null owned items list", str2));
            return new M(c1057e, 54);
        }
        int b8 = AbstractC5103e1.b(bundle, "BillingClient");
        String f8 = AbstractC5103e1.f(bundle, "BillingClient");
        C1057e.a c8 = C1057e.c();
        c8.c(b8);
        c8.b(f8);
        C1057e a8 = c8.a();
        if (b8 != 0) {
            AbstractC5103e1.j("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(b8)));
            return new M(a8, 23);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            AbstractC5103e1.j("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new M(c1057e, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            AbstractC5103e1.j("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new M(c1057e, 56);
        }
        if (stringArrayList2 == null) {
            AbstractC5103e1.j("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new M(c1057e, 57);
        }
        if (stringArrayList3 != null) {
            return new M(H.f12307l, 1);
        }
        AbstractC5103e1.j("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new M(c1057e, 58);
    }
}
