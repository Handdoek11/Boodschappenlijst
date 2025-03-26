package com.google.android.gms.ads.internal;

import C2.u;
import D2.AbstractBinderC0515k0;
import D2.InterfaceC0497e0;
import D2.InterfaceC0547v0;
import D2.Q;
import D2.Q0;
import D2.V;
import D2.c2;
import F2.BinderC0571c;
import F2.BinderC0575g;
import F2.D;
import F2.E;
import F2.i;
import F2.j;
import H2.a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A40;
import com.google.android.gms.internal.ads.AbstractC4630xu;
import com.google.android.gms.internal.ads.InterfaceC1242Dl;
import com.google.android.gms.internal.ads.InterfaceC1564Mo;
import com.google.android.gms.internal.ads.InterfaceC2319ch;
import com.google.android.gms.internal.ads.InterfaceC2443dp;
import com.google.android.gms.internal.ads.InterfaceC2863hh;
import com.google.android.gms.internal.ads.InterfaceC3022j60;
import com.google.android.gms.internal.ads.InterfaceC3097jq;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC3954rj;
import com.google.android.gms.internal.ads.InterfaceC4000s50;
import com.google.android.gms.internal.ads.InterfaceC4172tj;
import com.google.android.gms.internal.ads.InterfaceC4251uO;
import com.google.android.gms.internal.ads.InterfaceC4289un;
import com.google.android.gms.internal.ads.K30;
import com.google.android.gms.internal.ads.UW;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2179bJ;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC2504eJ;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ClientApi extends AbstractBinderC0515k0 {
    @Override // D2.InterfaceC0518l0
    public final V A4(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        InterfaceC4000s50 B7 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).B();
        B7.a(context);
        B7.b(c2Var);
        B7.v(str);
        return B7.d().zza();
    }

    @Override // D2.InterfaceC0518l0
    public final V F2(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        K30 z7 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).z();
        z7.n(str);
        z7.b(context);
        return z7.a().zza();
    }

    @Override // D2.InterfaceC0518l0
    public final V F3(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        A40 A7 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).A();
        A7.a(context);
        A7.b(c2Var);
        A7.v(str);
        return A7.d().zza();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC3418mn K2(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        return AbstractC4630xu.i((Context) BinderC5853b.J0(interfaceC5852a), interfaceC1242Dl, i8).u();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC3097jq L5(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        return AbstractC4630xu.i((Context) BinderC5853b.J0(interfaceC5852a), interfaceC1242Dl, i8).x();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC2863hh L6(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2, InterfaceC5852a interfaceC5852a3) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2179bJ((View) BinderC5853b.J0(interfaceC5852a), (HashMap) BinderC5853b.J0(interfaceC5852a2), (HashMap) BinderC5853b.J0(interfaceC5852a3));
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC1564Mo M0(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        InterfaceC3022j60 C7 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).C();
        C7.b(context);
        return C7.a().zzb();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC0547v0 N3(InterfaceC5852a interfaceC5852a, int i8) {
        return AbstractC4630xu.i((Context) BinderC5853b.J0(interfaceC5852a), null, i8).j();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC2443dp O6(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        InterfaceC3022j60 C7 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).C();
        C7.b(context);
        C7.n(str);
        return C7.a().zza();
    }

    @Override // D2.InterfaceC0518l0
    public final V V5(InterfaceC5852a interfaceC5852a, c2 c2Var, String str, int i8) {
        return new u((Context) BinderC5853b.J0(interfaceC5852a), c2Var, str, new a(244410000, i8, true, false));
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC4172tj W1(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8, InterfaceC3954rj interfaceC3954rj) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        InterfaceC4251uO r8 = AbstractC4630xu.i(context, interfaceC1242Dl, i8).r();
        r8.b(context);
        r8.c(interfaceC3954rj);
        return r8.a().d();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC2319ch b6(InterfaceC5852a interfaceC5852a, InterfaceC5852a interfaceC5852a2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC2504eJ((FrameLayout) BinderC5853b.J0(interfaceC5852a), (FrameLayout) BinderC5853b.J0(interfaceC5852a2), 244410000);
    }

    @Override // D2.InterfaceC0518l0
    public final Q0 d6(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        return AbstractC4630xu.i((Context) BinderC5853b.J0(interfaceC5852a), interfaceC1242Dl, i8).t();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC0497e0 h1(InterfaceC5852a interfaceC5852a, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        return AbstractC4630xu.i((Context) BinderC5853b.J0(interfaceC5852a), interfaceC1242Dl, i8).b();
    }

    @Override // D2.InterfaceC0518l0
    public final InterfaceC4289un v0(InterfaceC5852a interfaceC5852a) {
        Activity activity = (Activity) BinderC5853b.J0(interfaceC5852a);
        AdOverlayInfoParcel A02 = AdOverlayInfoParcel.A0(activity.getIntent());
        if (A02 == null) {
            return new E(activity);
        }
        int i8 = A02.f13071B;
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? i8 != 4 ? i8 != 5 ? new E(activity) : new BinderC0575g(activity) : new BinderC0571c(activity, A02) : new j(activity) : new i(activity) : new D(activity);
    }

    @Override // D2.InterfaceC0518l0
    public final Q z2(InterfaceC5852a interfaceC5852a, String str, InterfaceC1242Dl interfaceC1242Dl, int i8) {
        Context context = (Context) BinderC5853b.J0(interfaceC5852a);
        return new UW(AbstractC4630xu.i(context, interfaceC1242Dl, i8), context, str);
    }
}
