package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2831hJ implements InterfaceC1519Lg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ HJ f22532a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup f22533b;

    C2831hJ(HJ hj, ViewGroup viewGroup) {
        this.f22532a = hj;
        this.f22533b = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final void a() {
        AbstractC4169th0 abstractC4169th0 = ViewTreeObserverOnGlobalLayoutListenerC2504eJ.f21775F;
        Map k8 = this.f22532a.k();
        if (k8 == null) {
            return;
        }
        int size = abstractC4169th0.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = k8.get((String) abstractC4169th0.get(i8));
            i8++;
            if (obj != null) {
                this.f22532a.onClick(this.f22533b);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final void b(MotionEvent motionEvent) {
        this.f22532a.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final JSONObject zza() {
        return this.f22532a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1519Lg
    public final JSONObject zzb() {
        return this.f22532a.p();
    }
}
