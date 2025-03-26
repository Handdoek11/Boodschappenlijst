package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class L9 extends K9 {
    private L9(Context context, J9 j9) {
        super(context, j9);
    }

    public static L9 y(Context context, J9 j9) {
        K9.u(context, j9);
        return new L9(context, j9);
    }

    @Override // com.google.android.gms.internal.ads.K9
    protected final List s(C3610oa c3610oa, Context context, C2918i8 c2918i8, U7 u7) {
        if (c3610oa.k() == null || !this.f16537M.f16138a) {
            return super.s(c3610oa, context, c2918i8, null);
        }
        int a8 = c3610oa.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.s(c3610oa, context, c2918i8, null));
        arrayList.add(new C1365Ha(c3610oa, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", c2918i8, a8, 24));
        return arrayList;
    }
}
