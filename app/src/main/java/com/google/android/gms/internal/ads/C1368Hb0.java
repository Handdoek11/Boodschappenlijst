package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368Hb0 implements InterfaceC1260Eb0 {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f15755a = new int[2];

    @Override // com.google.android.gms.internal.ads.InterfaceC1260Eb0
    public final void a(View view, JSONObject jSONObject, InterfaceC1224Db0 interfaceC1224Db0, boolean z7, boolean z8) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z7) {
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    interfaceC1224Db0.a(viewGroup.getChildAt(i9), this, jSONObject, z8);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(hashMap.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i11));
                int size2 = arrayList3.size();
                int i12 = 0;
                while (true) {
                    i8 = i11 + 1;
                    if (i12 < size2) {
                        interfaceC1224Db0.a((View) arrayList3.get(i12), this, jSONObject, z8);
                        i12++;
                    }
                }
                i11 = i8;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1260Eb0
    public final JSONObject b(View view) {
        if (view == null) {
            return AbstractC1649Pb0.a(0, 0, 0, 0);
        }
        int[] iArr = this.f15755a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f15755a;
        return AbstractC1649Pb0.a(iArr2[0], iArr2[1], width, height);
    }
}
