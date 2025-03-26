package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Gb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332Gb0 implements InterfaceC1260Eb0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1260Eb0 f15408a;

    public C1332Gb0(InterfaceC1260Eb0 interfaceC1260Eb0) {
        this.f15408a = interfaceC1260Eb0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1260Eb0
    public final void a(View view, JSONObject jSONObject, InterfaceC1224Db0 interfaceC1224Db0, boolean z7, boolean z8) {
        ArrayList arrayList = new ArrayList();
        C4048sb0 a8 = C4048sb0.a();
        if (a8 != null) {
            Collection b8 = a8.b();
            int size = b8.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = b8.iterator();
            while (it.hasNext()) {
                View f8 = ((C2200bb0) it.next()).f();
                if (f8 != null && f8.isAttachedToWindow() && f8.isShown()) {
                    View view2 = f8;
                    while (true) {
                        if (view2 == null) {
                            View rootView = f8.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z9 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i8 = size2 - 1;
                                    if (((View) arrayList.get(i8)).getZ() <= z9) {
                                        break;
                                    } else {
                                        size2 = i8;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            interfaceC1224Db0.a((View) arrayList.get(i9), this.f15408a, jSONObject, z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1260Eb0
    public final JSONObject b(View view) {
        JSONObject a8 = AbstractC1649Pb0.a(0, 0, 0, 0);
        int b8 = AbstractC1754Sb0.b();
        int i8 = b8 - 1;
        if (b8 == 0) {
            throw null;
        }
        try {
            a8.put("noOutputDevice", i8 == 0);
        } catch (JSONException e8) {
            AbstractC1684Qb0.a("Error with setting output device status", e8);
        }
        return a8;
    }
}
